package org.wallerlab.yoink

import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class MoleculeTranslator {

	Integer waterCounter = 0;
	AtomTranslate at = new AtomTranslate();

	public List<Molecule> moleculeTranslator(DatablockType item){
		List<Atom> atoms = at.atomTranslator(item);
		List<Molecule> molecules = new ArrayList<Molecule>();
		Molecule molecule = new Molecule();
		for(int i = 0; i<atoms.size();i++){
			/*
			 * Check GroupPDBx
			 */
			if (atoms[i].getGroupPDBx().matches("ATOM")==true){
				molecule.setFileName(item.getDatablockName() + ": ATOM");
				int j = i;
				while(atoms[j].getGroupPDBx()==atoms[i].getGroupPDBx()){
					molecule.addToAtoms(atoms[j]);
					molecule.atomCount++;
					j++;
				}
				i = j-1;
				molecules.add(molecule);
				println "Number of Proteinatoms:" + molecule.atomCount
			}else{
			
			/*
			 * Check LabelCompId
			 */
				if(atoms[i].getLabelCompId().matches("HOH")==true){
					Molecule water = new Molecule();
					water.addToAtoms(atoms[i]);
					water.setFileName(item.getDatablockName() + ": H2O");
					molecules.add(water);
					waterCounter++;
				} else{
					Molecule mole = new Molecule()
					mole.setFileName(item.getDatablockName()+ " " + atoms[i].getLabelCompId());
					int j = i;
					while(atoms[j].getLabelCompId()==atoms[i].getLabelCompId()){
						mole.addToAtoms(atoms[j]);
						mole.atomCount++;
						j++;
					}
					i = j-1;
					molecules.add(mole);
					println "Number of non-Proteinatoms:" + mole.atomCount
				}
			}
		}
		println "Number of Watermolecules: " + waterCounter
		return molecules;
	}
}
