package org.wallerlab.yoink

import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class MoleculeTranslator {

	AtomTranslate at = new AtomTranslate()
	//Simple moleculeTranslator
	public List<Molecule> moleculeTranslator(DatablockType item){
		List<Atom> atoms = at.atomTranslator(item);
		List<Molecule> molecules = new ArrayList<Molecule>();
		Molecule mole1 = new Molecule();
		mole1.setFileName("ATOM");
		Molecule mole2 = new Molecule();
		mole2.setFileName("HETATOM");
		Molecule mole3 = new Molecule();
		mole3.setFileName("OTHER");
		for(int i = 0; i<atoms.size();++i){
			if (atoms[i].getGroupPDBx().matches("ATOM")==true){
				mole1.addToAtoms(atoms[i])
			}else if (atoms[i].getGroupPDBx().matches("HETATOM")==true){
				mole2.addToAtoms(atoms[i]);
			}else{
				mole3.addToAtoms(atoms[i])
			}
		}
		if (mole1.hasMany.size()!=0) molecules.add(mole1);
		if (mole2.hasMany.size()!=0) molecules.add(mole2);
		if (mole3.hasMany.size()!=0) molecules.add(mole3);
		return molecules;
	}
}
