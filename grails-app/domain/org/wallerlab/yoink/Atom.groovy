package org.wallerlab.yoink

class Atom {

    String index
	String element
	
	Double x
    Double y
    Double z

    static constraints = {
		index (blank:false);
		element (blank:false);
    }

	@Override
	public String toString() {
		return "Atom [index=" + index + ", element=" + element +", x=" + x + ", y=" + y + ", z=" + z + "]";
	}	
}
