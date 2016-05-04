package org.wallerlab.yoink

class Atom {

    String index
	String element
	
	String groupPDBx
	String labelCompId
	String chain
	
	Double x
    Double y
    Double z

    static constraints = {
		index (blank:false);
		element (blank:false);
		groupPDBx (blank:false);
		chain (blank:false);
		labelCompId (blank:false)
    }

	@Override
	public String toString() {
		return "Atom [index=" + index + ", element=" + element + ", groupPDBx=" + groupPDBx + ", chain=" + chain + ", compId=" + labelCompId + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}	
}
