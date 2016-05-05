import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.wallerlab.yoink.Atom
import org.wallerlab.yoink.AtomTranslate;
import org.wallerlab.yoink.Molecule
import org.wallerlab.yoink.MoleculeTranslator;
import org.wallerlab.yoink.PdbmlFileReader;
import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class BootStrap {

    def init = { servletContext ->	
	//import from file
	PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
	Resource[] resources =  pathMatchinResolver.getResources("file:./grails-app/assets/*.xml");
	
	PdbmlFileReader reader = new PdbmlFileReader()
	MoleculeTranslator mt = new MoleculeTranslator()
	for(int i = 0; i<resources.size(); i++){
		println "Resolving resource " + resources[i].getFilename()
		List<Molecule> molecules = mt.moleculeTranslator(reader.read(resources[i]))
		for(Molecule m:molecules){
			m.save()
		}
	}
		
    }
    def destroy = {
    }
}
