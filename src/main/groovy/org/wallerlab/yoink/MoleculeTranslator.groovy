package org.wallerlab.yoink

import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class MoleculeTranslator {

	Integer solventCounter = 0;
	Integer singleAtomCounter = 0;

	public List<Molecule> translateToMolecule(DatablockType item){
		AtomTranslator at = new AtomTranslator();
		List<Atom> atoms = at.translateToAtom(item);
		List<Molecule> molecules = new ArrayList<Molecule>();
		//start for-loop
		for(int i = 0; i<atoms.size();i++){
			/*
			 * Check GroupPDBx
			 */
			//############################################################################################################
			if (atoms[i].getGroupPDBx().matches("ATOM")==true){
				/*
				 * Check Chain
				 */
				//*********************************************************************************************************
				if (atoms[i].getChain()==atoms[0].getChain()){
					Molecule molecule =  new Molecule();
					molecule.setFileName(item.getDatablockName() + ": ATOM, Chain: " + atoms[i].getChain());
					int j = i;
					while(atoms[j].getChain()==atoms[i].getChain()){
						molecule.addToAtoms(atoms[j]);
						molecule.atomCount++;
						j++;
						if(atoms[j]==null){
							break;
						}
					}
					i = j-1;
					molecules.add(molecule);
					println ("Number of Proteinatoms in Chain "+ atoms[i].getChain() +" :" + molecule.atomCount);
				}else{
					Molecule molecule = new Molecule();
					molecule.setFileName(item.getDatablockName() + ": ATOM, Chain: " + atoms[i].getChain());
					int j = i;
					while(atoms[j].getChain()==atoms[i].getChain()){
						molecule.addToAtoms(atoms[j]);
						molecule.atomCount++;
						j++;
						if(atoms[j]==null){
							break;
						}
					}
					i = j-1;
					molecules.add(molecule);
					println ("Number of Proteinatoms in Chain "+ atoms[i].getChain() +" :" + molecule.atomCount);
				}
				//*********************************************************************************************************
				 
			}else{
				/*
				 * Check LabelCompId
				 */
			    //----------------------------------------------------------------------------------------------------------
				if(atoms[i].getLabelCompId().matches("HOH")==true){
					Molecule solvent = new Molecule();
					solvent.addToAtoms(atoms[i]);
					solvent.setFileName(item.getDatablockName() + ": " + atoms[i].getLabelCompId());
					molecules.add(solvent);
					solventCounter++;
				}else if(atoms[i].getLabelCompId()==atoms[i].getElement()){
					Molecule singleAtom = new Molecule();
					singleAtom.setFileName(item.getDatablockName() + ": " + atoms[i].getLabelCompId());
					singleAtom.addToAtoms(atoms[i]);
					molecules.add(singleAtom);
					println atoms[i];
					singleAtomCounter++;
				} 
				else{
					Molecule mole = new Molecule()
					mole.setFileName(item.getDatablockName()+ " " + atoms[i].getLabelCompId());
					int j = i;
						while(atoms[j].getLabelCompId()==atoms[i].getLabelCompId()){
							mole.addToAtoms(atoms[j]);
							mole.atomCount++;
							j++;
							if(atoms[j]==null){
								break;
						    }
					}
					i = j-1;
					molecules.add(mole);
					println ("Number of Atoms in " + mole.getFileName() + "-Molecule:" + mole.atomCount);
				}
				//----------------------------------------------------------------------------------------------------------
			}
			//############################################################################################################
			
		}
		//end of for-loop
		println ("Number of single Atoms: " + singleAtomCounter);
		println ("Number of Solventmolecules: " + solventCounter);
		return molecules;
	}
	
}
