package org.wallerlab.yoink

import org.wallerlab.yoink.core.pdbml.generated.DatablockType;

class MolecularSystemTranslator {

	public MolecularSystem translateToMolecularSystem(DatablockType item){
		
		MoleculeTranslator mt = new MoleculeTranslator();
		List<Molecule> molecules = mt.translateToMolecule(item);
		MolecularSystem molecularSystem = new MolecularSystem();
		for (int i=0;i<molecules.size();i++){
				molecularSystem.setNameOfSystem(getMoleculeName(molecules[0]));
				molecularSystem.addToMolecules(molecules[i]);
			}
		return molecularSystem;
	}
	
	public String getMoleculeName(Molecule molecule){
		return molecule.getFileName().substring(0, 4);
	}
}
