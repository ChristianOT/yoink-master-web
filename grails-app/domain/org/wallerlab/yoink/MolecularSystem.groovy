package org.wallerlab.yoink

class MolecularSystem {
	
	String nameOfSystem
	
	Integer numberOfMolecules;
	
	Integer numberOfAtoms;
	
	static hasMany = [molecules:Molecule]

	static constraints = {
		
		nameOfSystem (blank:false)
    }
	
	@Override
	public String toString() {
		return "MolecularSystem [nameOfSystem=" + nameOfSystem + "]";
	}
}
