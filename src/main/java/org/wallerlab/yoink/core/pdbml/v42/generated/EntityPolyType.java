//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.core.pdbml.v42.generated;

import java.math.BigInteger;
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
 * Data items in the ENTITY_POLY category record details about the
 * polymer, such as the type of the polymer, the number of
 * monomers and whether it has nonstandard features.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:entity_polyCategory>
 *    <PDBx:entity_poly entity_id="1">
 *       <PDBx:nstd_chirality>no</PDBx:nstd_chirality>
 *       <PDBx:nstd_linkage>no</PDBx:nstd_linkage>
 *       <PDBx:nstd_monomer>no</PDBx:nstd_monomer>
 *       <PDBx:type>polypeptide(L)</PDBx:type>
 *       <PDBx:type_details xsi:nil="true" />
 *    </PDBx:entity_poly>
 * </PDBx:entity_polyCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for entity_polyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity_polyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity_poly" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="nstd_chirality" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nstd_linkage" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nstd_monomer" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="no"/>
 *                         &lt;enumeration value="n"/>
 *                         &lt;enumeration value="yes"/>
 *                         &lt;enumeration value="y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number_of_monomers" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_seq_one_letter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_one_letter_code_can" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_one_letter_code_sample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_target_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="polypeptide(D)"/>
 *                         &lt;enumeration value="polypeptide(L)"/>
 *                         &lt;enumeration value="polydeoxyribonucleotide"/>
 *                         &lt;enumeration value="polyribonucleotide"/>
 *                         &lt;enumeration value="polysaccharide(D)"/>
 *                         &lt;enumeration value="polysaccharide(L)"/>
 *                         &lt;enumeration value="polydeoxyribonucleotide/polyribonucleotide hybrid"/>
 *                         &lt;enumeration value="cyclic-pseudo-peptide"/>
 *                         &lt;enumeration value="peptide nucleic acid"/>
 *                         &lt;enumeration value="other"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="type_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "entity_polyType", propOrder = {
    "entityPoly"
})
public class EntityPolyType {

    @XmlElement(name = "entity_poly")
    protected List<EntityPolyType.EntityPoly> entityPoly;

    /**
     * Gets the value of the entityPoly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityPoly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityPoly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityPolyType.EntityPoly }
     * 
     * 
     */
    public List<EntityPolyType.EntityPoly> getEntityPoly() {
        if (entityPoly == null) {
            entityPoly = new ArrayList<EntityPolyType.EntityPoly>();
        }
        return this.entityPoly;
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
     *         &lt;element name="nstd_chirality" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nstd_linkage" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nstd_monomer" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="no"/>
     *               &lt;enumeration value="n"/>
     *               &lt;enumeration value="yes"/>
     *               &lt;enumeration value="y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number_of_monomers" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_seq_one_letter_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_one_letter_code_can" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_one_letter_code_sample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_target_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="polypeptide(D)"/>
     *               &lt;enumeration value="polypeptide(L)"/>
     *               &lt;enumeration value="polydeoxyribonucleotide"/>
     *               &lt;enumeration value="polyribonucleotide"/>
     *               &lt;enumeration value="polysaccharide(D)"/>
     *               &lt;enumeration value="polysaccharide(L)"/>
     *               &lt;enumeration value="polydeoxyribonucleotide/polyribonucleotide hybrid"/>
     *               &lt;enumeration value="cyclic-pseudo-peptide"/>
     *               &lt;enumeration value="peptide nucleic acid"/>
     *               &lt;enumeration value="other"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="type_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class EntityPoly {

        @XmlElementRef(name = "nstd_chirality", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nstdChirality;
        @XmlElementRef(name = "nstd_linkage", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nstdLinkage;
        @XmlElementRef(name = "nstd_monomer", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nstdMonomer;
        @XmlElementRef(name = "number_of_monomers", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberOfMonomers;
        @XmlElementRef(name = "pdbx_seq_one_letter_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqOneLetterCode;
        @XmlElementRef(name = "pdbx_seq_one_letter_code_can", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqOneLetterCodeCan;
        @XmlElementRef(name = "pdbx_seq_one_letter_code_sample", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqOneLetterCodeSample;
        @XmlElementRef(name = "pdbx_strand_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxStrandId;
        @XmlElementRef(name = "pdbx_target_identifier", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxTargetIdentifier;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlElementRef(name = "type_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> typeDetails;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;

        /**
         * Gets the value of the nstdChirality property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNstdChirality() {
            return nstdChirality;
        }

        /**
         * Sets the value of the nstdChirality property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNstdChirality(JAXBElement<String> value) {
            this.nstdChirality = value;
        }

        /**
         * Gets the value of the nstdLinkage property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNstdLinkage() {
            return nstdLinkage;
        }

        /**
         * Sets the value of the nstdLinkage property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNstdLinkage(JAXBElement<String> value) {
            this.nstdLinkage = value;
        }

        /**
         * Gets the value of the nstdMonomer property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getNstdMonomer() {
            return nstdMonomer;
        }

        /**
         * Sets the value of the nstdMonomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setNstdMonomer(JAXBElement<String> value) {
            this.nstdMonomer = value;
        }

        /**
         * Gets the value of the numberOfMonomers property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberOfMonomers() {
            return numberOfMonomers;
        }

        /**
         * Sets the value of the numberOfMonomers property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberOfMonomers(JAXBElement<BigInteger> value) {
            this.numberOfMonomers = value;
        }

        /**
         * Gets the value of the pdbxSeqOneLetterCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqOneLetterCode() {
            return pdbxSeqOneLetterCode;
        }

        /**
         * Sets the value of the pdbxSeqOneLetterCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqOneLetterCode(JAXBElement<String> value) {
            this.pdbxSeqOneLetterCode = value;
        }

        /**
         * Gets the value of the pdbxSeqOneLetterCodeCan property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqOneLetterCodeCan() {
            return pdbxSeqOneLetterCodeCan;
        }

        /**
         * Sets the value of the pdbxSeqOneLetterCodeCan property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqOneLetterCodeCan(JAXBElement<String> value) {
            this.pdbxSeqOneLetterCodeCan = value;
        }

        /**
         * Gets the value of the pdbxSeqOneLetterCodeSample property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqOneLetterCodeSample() {
            return pdbxSeqOneLetterCodeSample;
        }

        /**
         * Sets the value of the pdbxSeqOneLetterCodeSample property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqOneLetterCodeSample(JAXBElement<String> value) {
            this.pdbxSeqOneLetterCodeSample = value;
        }

        /**
         * Gets the value of the pdbxStrandId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxStrandId() {
            return pdbxStrandId;
        }

        /**
         * Sets the value of the pdbxStrandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxStrandId(JAXBElement<String> value) {
            this.pdbxStrandId = value;
        }

        /**
         * Gets the value of the pdbxTargetIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxTargetIdentifier() {
            return pdbxTargetIdentifier;
        }

        /**
         * Sets the value of the pdbxTargetIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxTargetIdentifier(JAXBElement<String> value) {
            this.pdbxTargetIdentifier = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setType(JAXBElement<String> value) {
            this.type = value;
        }

        /**
         * Gets the value of the typeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTypeDetails() {
            return typeDetails;
        }

        /**
         * Sets the value of the typeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTypeDetails(JAXBElement<String> value) {
            this.typeDetails = value;
        }

        /**
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityId(String value) {
            this.entityId = value;
        }

    }

}
