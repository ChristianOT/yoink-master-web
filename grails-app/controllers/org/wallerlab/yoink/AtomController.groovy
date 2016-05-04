package org.wallerlab.yoink

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AtomController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Atom.list(params), model:[atomCount: Atom.count()]
    }

    def show(Atom atom) {
        respond atom
    }

    def create() {
        respond new Atom(params)
    }

    @Transactional
    def save(Atom atom) {
        if (atom == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (atom.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond atom.errors, view:'create'
            return
        }

        atom.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'atom.label', default: 'Atom'), atom.id])
                redirect atom
            }
            '*' { respond atom, [status: CREATED] }
        }
    }

    def edit(Atom atom) {
        respond atom
    }

    @Transactional
    def update(Atom atom) {
        if (atom == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (atom.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond atom.errors, view:'edit'
            return
        }

        atom.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'atom.label', default: 'Atom'), atom.id])
                redirect atom
            }
            '*'{ respond atom, [status: OK] }
        }
    }

    @Transactional
    def delete(Atom atom) {

        if (atom == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        atom.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'atom.label', default: 'Atom'), atom.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'atom.label', default: 'Atom'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
