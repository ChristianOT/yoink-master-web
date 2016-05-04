package org.wallerlab.yoink

class Molecule {

	String fileName
//	List<Atom> atoms = new ArrayList<Atom>()
    static hasMany = [atoms:Atom]

    static constraints = {
		fileName (blank:false)
    }
	
//	def void addAtom(Atom a){
//		hasMany.
//	}

	
}
