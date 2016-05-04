import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.wallerlab.yoink.Atom
import org.wallerlab.yoink.AtomTranslate;
import org.wallerlab.yoink.Molecule
import org.wallerlab.yoink.PdbmlFileReader;
import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class BootStrap {

    def init = { servletContext ->
		
	
//    Atom atom = new Atom(x:1.1,y:2.0,z:3.4,element:'Ne')
//    atom.save(flush:true)
//	println atom
//    Atom atom2 = new Atom(x:2.2,y:4.5,z:6.0,element:'O')
//    atom2.save()
//    Molecule molecule = new Molecule(atoms:[atom,atom2])
//    molecule.save()
	
	
	//import from file
	
	PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
	Resource[] resources =  pathMatchinResolver.getResources("file:/scratch/c_oual01/yoink-master-web/grails-app/assets/*.xml");
//	for(Resource r:resources){
//		println("Resourcepath: " + resources[r])
//	}
	
	PdbmlFileReader reader = new PdbmlFileReader()
	AtomTranslate translator = new AtomTranslate()
	
	for(int i = 0; i<resources.size(); i++){
		Molecule molecule = new Molecule(atoms:translator.atomTranslator(reader.read(resources[i])))
		molecule.save()
	}
		
    }
    def destroy = {
    }
}
