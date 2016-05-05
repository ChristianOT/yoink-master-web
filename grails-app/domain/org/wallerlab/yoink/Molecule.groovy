package org.wallerlab.yoink

class Molecule {

	public Integer atomCount = 0
	String fileName

	static hasMany = [atoms:Atom]

    static constraints = {
		fileName (blank:false)
    }
	
}
