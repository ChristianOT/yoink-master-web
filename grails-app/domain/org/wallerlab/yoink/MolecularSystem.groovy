package org.wallerlab.yoink

class MolecularSystem {
	
	String nameOfSystem
	
	static hasMany = [molecules:Molecule]

    static constraints = {
    }
}
