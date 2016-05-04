package org.wallerlab.yoink

import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class MoleculeTranslator {

	AtomTranslate at = new AtomTranslate()
	//Simple moleculeTranslator
	public Molecule moleculeTranslator(DatablockType item){
		Molecule molecule = new Molecule(atoms:at.atomTranslator(item));
		molecule.fileName = item.getDatablockName();
		return molecule;
	}
}
