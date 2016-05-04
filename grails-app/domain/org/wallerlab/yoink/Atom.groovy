package org.wallerlab.yoink

class Atom {

    Double x
    Double y
    Double z

    String element
	String index

    static constraints = {
    }

	@Override
	public String toString() {
		return "Atom [element=" + element +", x=" + x + ", y=" + y + ", z=" + z +  ", index=" + index + "]";
	}	
}
