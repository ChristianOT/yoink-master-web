package org.wallerlab.yoink

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class MolecularSystemTranslatorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MolecularSystem.list(params), model:[molecularSystemTranslatorCount: MolecularSystem.count()]
    }

    def show(MolecularSystem molecularSystemTranslator) {
        respond molecularSystemTranslator
    }

    def create() {
        respond new MolecularSystem(params)
    }

    @Transactional
    def save(MolecularSystem molecularSystemTranslator) {
        if (molecularSystemTranslator == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (molecularSystemTranslator.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond molecularSystemTranslator.errors, view:'create'
            return
        }

        molecularSystemTranslator.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'molecularSystemTranslator.label', default: 'MolecularSystemTranslator'), molecularSystemTranslator.id])
                redirect molecularSystemTranslator
            }
            '*' { respond molecularSystemTranslator, [status: CREATED] }
        }
    }

    def edit(MolecularSystem molecularSystemTranslator) {
        respond molecularSystemTranslator
    }

    @Transactional
    def update(MolecularSystem molecularSystemTranslator) {
        if (molecularSystemTranslator == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (molecularSystemTranslator.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond molecularSystemTranslator.errors, view:'edit'
            return
        }

        molecularSystemTranslator.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'molecularSystemTranslator.label', default: 'MolecularSystemTranslator'), molecularSystemTranslator.id])
                redirect molecularSystemTranslator
            }
            '*'{ respond molecularSystemTranslator, [status: OK] }
        }
    }

    @Transactional
    def delete(MolecularSystem molecularSystemTranslator) {

        if (molecularSystemTranslator == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        molecularSystemTranslator.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'molecularSystemTranslator.label', default: 'MolecularSystemTranslator'), molecularSystemTranslator.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'molecularSystemTranslator.label', default: 'MolecularSystemTranslator'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
