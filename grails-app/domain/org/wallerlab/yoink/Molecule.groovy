package org.wallerlab.yoink

class Molecule {

	String fileName
	
    static hasMany = [atoms:Atom]

    static constraints = {
		fileName (blank:false)
    }

	
}
