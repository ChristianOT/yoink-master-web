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
				String chain = dt.getAtomSiteCategory().getAtomSite().get(i).getAuthAsymId();
				String compId = dt.getAtomSiteCategory().getAtomSite().get(i).getLabelCompId();
				String groupPDBx = dt.getAtomSiteCategory().getAtomSite().get(i).getGroupPDB().getValue().getChars().toString();
				//##################################################################################################################//
				Atom atom = new Atom();
				atom.x = cx;
				atom.y = cy;
				atom.z = cz;
				atom.element = element;
				atom.index = index;
				atom.chain = chain;
				atom.labelCompId = compId;
				atom.groupPDBx = groupPDBx;
				//##################################################################################################################//
				//println atom;
				atoms.add(atom);
			}
		//}
		return atoms;
	}
	
}
