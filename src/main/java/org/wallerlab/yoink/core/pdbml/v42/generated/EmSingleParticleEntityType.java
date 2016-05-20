//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.core.pdbml.v42.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
 * the details of the symmetry for a single particle entity type.
 *   Example 1 - based on PDB entry 1EG0
 * <PDBx:em_single_particle_entityCategory>
 *    <PDBx:em_single_particle_entity entry_id="1EG0">
 *       <PDBx:symmetry_type>ASYMMETRIC</PDBx:symmetry_type>
 *    </PDBx:em_single_particle_entity>
 * </PDBx:em_single_particle_entityCategory>
 * 
 *   Example 2 - based on PDB entry 2ZLE
 * <PDBx:em_single_particle_entityCategory>
 *    <PDBx:em_single_particle_entity entry_id="2ZLE">
 *       <PDBx:symmetry_type>MIXED SYMMETRY</PDBx:symmetry_type>
 *    </PDBx:em_single_particle_entity>
 * </PDBx:em_single_particle_entityCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_single_particle_entityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_single_particle_entityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_single_particle_entity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="symmetry_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ASYMMETRIC"/>
 *                         &lt;enumeration value="CYCLIC"/>
 *                         &lt;enumeration value="DIHEDRAL"/>
 *                         &lt;enumeration value="TETRAHEDRAL"/>
 *                         &lt;enumeration value="OCTAHEDRAL"/>
 *                         &lt;enumeration value="ICOSAHEDRAL"/>
 *                         &lt;enumeration value="MIXED SYMMETRY"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "em_single_particle_entityType", propOrder = {
    "emSingleParticleEntity"
})
public class EmSingleParticleEntityType {

    @XmlElement(name = "em_single_particle_entity")
    protected List<EmSingleParticleEntityType.EmSingleParticleEntity> emSingleParticleEntity;

    /**
     * Gets the value of the emSingleParticleEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emSingleParticleEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmSingleParticleEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmSingleParticleEntityType.EmSingleParticleEntity }
     * 
     * 
     */
    public List<EmSingleParticleEntityType.EmSingleParticleEntity> getEmSingleParticleEntity() {
        if (emSingleParticleEntity == null) {
            emSingleParticleEntity = new ArrayList<EmSingleParticleEntityType.EmSingleParticleEntity>();
        }
        return this.emSingleParticleEntity;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="symmetry_type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ASYMMETRIC"/>
     *               &lt;enumeration value="CYCLIC"/>
     *               &lt;enumeration value="DIHEDRAL"/>
     *               &lt;enumeration value="TETRAHEDRAL"/>
     *               &lt;enumeration value="OCTAHEDRAL"/>
     *               &lt;enumeration value="ICOSAHEDRAL"/>
     *               &lt;enumeration value="MIXED SYMMETRY"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class EmSingleParticleEntity {

        @XmlElementRef(name = "symmetry_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> symmetryType;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the symmetryType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSymmetryType() {
            return symmetryType;
        }

        /**
         * Sets the value of the symmetryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSymmetryType(JAXBElement<String> value) {
            this.symmetryType = value;
        }

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

    }

}
