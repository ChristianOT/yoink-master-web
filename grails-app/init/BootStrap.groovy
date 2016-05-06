import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.wallerlab.yoink.Atom
import org.wallerlab.yoink.AtomTranslator
import org.wallerlab.yoink.MolecularSystem;
import org.wallerlab.yoink.MolecularSystemTranslator;
import org.wallerlab.yoink.Molecule
import org.wallerlab.yoink.MoleculeTranslator;
import org.wallerlab.yoink.PdbmlFileReader;
import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class BootStrap {

	def init = { servletContext ->
		Long time1 = System.currentTimeMillis();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources =  pathMatchinResolver.getResources("file:/scratch/c_oual01/pdb/**/*.xml");

		PdbmlFileReader reader = new PdbmlFileReader()
		MoleculeTranslator mt = new MoleculeTranslator()
		MolecularSystemTranslator mst = new MolecularSystemTranslator();
		
		for(int i = 0; i<resources.size(); i++){
			mst.translateToMolecularSystem(reader.read(resources[0])).save();
			resources[i].file.delete();
			println "************************************"
		}
		Long time2 = System.currentTimeMillis();
		println ("Time for storing "+ resources.size() + " files in database: " + (time2-time1)/1000 + " seconds");
		println ("Seconds per file: " + ((time2-time1)/1000 )/resources.size());
		println  ("*******************************************************************************") ;
		
	}
	def destroy = {
	}
}
