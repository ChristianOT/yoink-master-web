package org.wallerlab.yoink

class MolecularSystem {
	
	String nameOfSystem
	
	static hasMany = [molecules:Molecule]

	static constraints = {
		
		nameOfSystem (blank:false)
    }
	
	@Override
	public String toString() {
		return "MolecularSystem [nameOfSystem=" + nameOfSystem + "]";
	}
}
