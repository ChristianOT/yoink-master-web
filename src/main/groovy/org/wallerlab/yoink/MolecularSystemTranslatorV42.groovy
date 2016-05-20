package org.wallerlab.yoink

import org.wallerlab.yoink.MolecularSystem
import org.wallerlab.yoink.Molecule
import org.wallerlab.yoink.core.pdbml.v42.generated.DatablockType;

class MolecularSystemTranslatorV42 {

	public MolecularSystem translateToMolecularSystem(DatablockType item){
		
		MoleculeTranslatorV42 mt = new MoleculeTranslatorV42();
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
