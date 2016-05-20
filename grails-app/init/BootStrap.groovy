import javax.xml.bind.UnmarshalException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.wallerlab.yoink.Atom
import org.wallerlab.yoink.AtomTranslator
import org.wallerlab.yoink.MolecularSystem;
import org.wallerlab.yoink.MolecularSystemTranslator
import org.wallerlab.yoink.MolecularSystemTranslatorV42;
import org.wallerlab.yoink.Molecule
import org.wallerlab.yoink.MoleculeTranslator;
import org.wallerlab.yoink.PdbmlFileReader
import org.wallerlab.yoink.Interfaces.DatablockTypeInterface;
import org.wallerlab.yoink.core.pdbml.generated.DatablockType

class BootStrap {

	def init = {
		servletContext ->
		Long time1 = System.currentTimeMillis();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources =  pathMatchinResolver.getResources("file:/scratch/c_oual01/pdb/**/*.xml");

		PdbmlFileReader reader = new PdbmlFileReader()
		MolecularSystemTranslator mst = new MolecularSystemTranslator();
		MolecularSystemTranslatorV42 mstV42 = new MolecularSystemTranslatorV42();

		List<String> contents = new ArrayList<String>();
		Integer nFiles = 1;
		for(int i = 0; i<nFiles; i++){
			try{
				DatablockTypeInterface dti = reader.read(resources[i]);
				MolecularSystem ms = mst.translateToMolecularSystem(dti);
				String content = "File: " +  resources[i].getFile().getName() + "   " + "Number of Molecules: " + ms.molecules.size() + "   " +
				 "Number of Atoms: " + dti.getAtomSiteCategory().getAtomSite().size();
				contents.add(content); 
				ms.save();
				resources[i].file.delete();
			} catch (UnmarshalException e){
			DatablockTypeInterface dti = reader.readv42(resources[i]);
				MolecularSystem ms = mstV42.translateToMolecularSystem(dti);
				String content = "File: " +  resources[i].getFile().getName() + "   " + "Number of Molecules: " + ms.molecules.size() + "   " +
				 "Number of Atoms: " + dti.getAtomSiteCategory().getAtomSite().size();
			    contents.add(content);
				ms.save();
				resources[i].file.delete();
			}


			println "************************************"
		}
		toFile(contents);
		Long time2 = System.currentTimeMillis();
		println ("Time for storing "+ nFiles + " files in database: " + (time2-time1)/1000 + " seconds");
		println ("Seconds per file: " + ((time2-time1)/1000 )/nFiles);
		println  ("*******************************************************************************") ;
	}
	def destroy = {
	}
	
	public void toFile(List<String> contents) {
			try {
				File file = new File("/scratch/c_oual01/workspace_for_sts/yoink-master-web/src/main/groovy/org/wallerlab/yoink/MoleculeList.txt");
				
				if (!file.exists()) {
					file.createNewFile();
				}
	
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				for (int i=0;i<contents.size();i++){
				bw.write(contents[i]);
				bw.newLine();
				}
				bw.close();
	
				System.out.println("Done");
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}


//-XX:-UseGCOverheadLimit -Xmx16g
