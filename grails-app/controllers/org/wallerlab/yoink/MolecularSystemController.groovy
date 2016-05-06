package org.wallerlab.yoink

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class MolecularSystemController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MolecularSystem.list(params), model:[molecularSystemCount: MolecularSystem.count()]
    }

    def show(MolecularSystem molecularSystem) {
        respond molecularSystem
    }

    def create() {
        respond new MolecularSystem(params)
    }

    @Transactional
    def save(MolecularSystem molecularSystem) {
        if (molecularSystem == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (molecularSystem.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond molecularSystem.errors, view:'create'
            return
        }

        molecularSystem.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'molecularSystem.label', default: 'MolecularSystem'), molecularSystem.id])
                redirect molecularSystem
            }
            '*' { respond molecularSystem, [status: CREATED] }
        }
    }

    def edit(MolecularSystem molecularSystem) {
        respond molecularSystem
    }

    @Transactional
    def update(MolecularSystem molecularSystem) {
        if (molecularSystem == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (molecularSystem.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond molecularSystem.errors, view:'edit'
            return
        }

        molecularSystem.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'molecularSystem.label', default: 'MolecularSystem'), molecularSystem.id])
                redirect molecularSystem
            }
            '*'{ respond molecularSystem, [status: OK] }
        }
    }

    @Transactional
    def delete(MolecularSystem molecularSystem) {

        if (molecularSystem == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        molecularSystem.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'molecularSystem.label', default: 'MolecularSystem'), molecularSystem.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'molecularSystem.label', default: 'MolecularSystem'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
