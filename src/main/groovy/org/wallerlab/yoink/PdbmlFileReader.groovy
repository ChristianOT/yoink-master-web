package org.wallerlab.yoink

import org.wallerlab.yoink.Interfaces.DatablockTypeInterface;
import org.wallerlab.yoink.core.pdbml.v42.generated.DatablockType

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement;
import javax.xml.bind.UnmarshalException
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.Resource;

class PdbmlFileReader {
	
	Resource resource;
	
	DatablockTypeInterface read(Resource resource){
		if(resource != null){
			System.out.println("File: " + resource.getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(org.wallerlab.yoink.core.pdbml.generated.DatablockType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement<org.wallerlab.yoink.core.pdbml.generated.DatablockType> pdb = (JAXBElement<org.wallerlab.yoink.core.pdbml.generated.DatablockType>) jaxbUnmarshaller.unmarshal(resource.getInputStream());
			System.out.println("done reading : " + pdb.getValue().getDatablockName());
			this.resource = null;
			return pdb.getValue();
		}else{
			return null;
		}
	}
	
	DatablockTypeInterface readv42(Resource resource){
		if(resource != null){
			System.out.println("File: " + resource.getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(DatablockType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement<DatablockType> pdb = (JAXBElement<DatablockType>) jaxbUnmarshaller.unmarshal(resource.getInputStream());
			System.out.println("done reading : " + pdb.getValue().getDatablockName());
			this.resource = null;
			return pdb.getValue();
		}else{
			return null;
		}
	}
	
	
}
