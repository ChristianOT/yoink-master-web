package org.wallerlab.yoink

import org.wallerlab.yoink.Atom
import org.wallerlab.yoink.core.pdbml.generated.DatablockType;

class AtomTranslate {

	private List<Atom> atomTranslator(DatablockType item) {
		List<Atom> atoms = new ArrayList<Atom>();
		//for(int j = 0;j<items.size();j++){
			System.out.println("number of Atoms: " + item.getAtomSiteCategory().getAtomSite().size());
			DatablockType dt = item;
			int nAtoms = dt.getAtomSiteCategory().getAtomSite().size();
			int i = 0;
			for (i=0; i < nAtoms; i++) {
				Double cx = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnX().getValue().getValue().doubleValue();
				Double cy = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnY().getValue().getValue().doubleValue();
				Double cz = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnZ().getValue().getValue().doubleValue();
				//System.out.println(cx + " " + cy + " " + cz);
				String element = dt.getAtomSiteCategory().getAtomSite().get(i).getTypeSymbol();
				String index = dt.getAtomSiteCategory().getAtomSite().get(i).getId();
				//##################################################################################################################//
				Atom atom = new Atom();
				atom.x = cx;
				atom.y = cy;
				atom.z = cz;
				atom.element = element;
				atom.index = index;
				//##################################################################################################################//
				//println atom;
				atoms.add(atom);
				println (atoms[i].getIndex()+ " " + atom.getIndex())
			}
		//}
		return atoms;
	}
	
}
