package org.wallerlab.yoink

import org.wallerlab.yoink.core.pdbml.generated.DatablockType

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.Resource;

class PdbmlFileReader {
	
	Resource resource;
	
	DatablockType read(Resource resource){
			if(resource != null){
				JAXBContext jaxbContext = JAXBContext.newInstance(DatablockType.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				JAXBElement<DatablockType> pdb = (JAXBElement<DatablockType>) jaxbUnmarshaller.unmarshal(resource.getInputStream());
				System.out.println("reading : " + pdb.getValue().getDatablockName());
				this.resource = null;
				return pdb.getValue();
			}else{
				return null;
			}
	}
}
