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
 * Data items in the PDBX_REFERENCE_MOLECULE_RELATED_STRUCTURES category record 
 * details of the structural examples in related databases for this entity.
 * 
 *     Example 1 - Actinomycin
 * <PDBx:pdbx_reference_molecule_related_structuresCategory>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="1">
 *       <PDBx:citation_id>1</PDBx:citation_id>
 *       <PDBx:db_accession>144860</PDBx:db_accession>
 *       <PDBx:db_code>POHMUU</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:formula>C72 H90 N12 O18</PDBx:formula>
 *       <PDBx:name>2,2&apos;-D-bis(O-Methyltyrosinyl)-actinomycin D ethyl acetate hydrate</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="2">
 *       <PDBx:citation_id>2</PDBx:citation_id>
 *       <PDBx:db_accession>140332</PDBx:db_accession>
 *       <PDBx:db_code>ZZZGQM</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:name>Actinomycin</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="3">
 *       <PDBx:citation_id>2</PDBx:citation_id>
 *       <PDBx:db_accession>140333</PDBx:db_accession>
 *       <PDBx:db_code>ZZZGQM01</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:name>Actinomycin</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="4">
 *       <PDBx:citation_id>3</PDBx:citation_id>
 *       <PDBx:db_accession>36676</PDBx:db_accession>
 *       <PDBx:db_code>BEJXET</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:formula>C62 H86 N12 O16; 2(C19 H25 N8 O10 P1)</PDBx:formula>
 *       <PDBx:name>bis(Deoxyguanylyl-(3&apos;-5&apos;)-deoxycytidine) actinomycin D hydrate</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="5">
 *       <PDBx:citation_id>4</PDBx:citation_id>
 *       <PDBx:db_accession>77327</PDBx:db_accession>
 *       <PDBx:db_code>GIDNUC</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:formula>C62 H86 N12 O16</PDBx:formula>
 *       <PDBx:name>Actinomycin D ethanol solvate hydrate</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="6">
 *       <PDBx:citation_id>5</PDBx:citation_id>
 *       <PDBx:db_accession>128630</PDBx:db_accession>
 *       <PDBx:db_code>ACTDGU01</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:name>Actinomycin D bis(deoxyguanosine) dodecahydrate</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="7">
 *       <PDBx:citation_id>6</PDBx:citation_id>
 *       <PDBx:db_accession>455</PDBx:db_accession>
 *       <PDBx:db_code>ACTDGU10</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:name>Actinomycin D bis(deoxyguanosine) dodecahydrate</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 *    <PDBx:pdbx_reference_molecule_related_structures family_prd_id="FAM_000001" ordinal="8">
 *       <PDBx:citation_id>6</PDBx:citation_id>
 *       <PDBx:db_accession>3032</PDBx:db_accession>
 *       <PDBx:db_code>BRAXGU</PDBx:db_code>
 *       <PDBx:db_name>CCDC</PDBx:db_name>
 *       <PDBx:name>7-Bromoactinomycin D bis(deoxyguanosine) undecahydrate</PDBx:name>
 *    </PDBx:pdbx_reference_molecule_related_structures>
 * </PDBx:pdbx_reference_molecule_related_structuresCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_molecule_related_structuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_molecule_related_structuresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_molecule_related_structures" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_accession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_reference_molecule_related_structuresType", propOrder = {
    "pdbxReferenceMoleculeRelatedStructures"
})
public class PdbxReferenceMoleculeRelatedStructuresType {

    @XmlElement(name = "pdbx_reference_molecule_related_structures")
    protected List<PdbxReferenceMoleculeRelatedStructuresType.PdbxReferenceMoleculeRelatedStructures> pdbxReferenceMoleculeRelatedStructures;

    /**
     * Gets the value of the pdbxReferenceMoleculeRelatedStructures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceMoleculeRelatedStructures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceMoleculeRelatedStructures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceMoleculeRelatedStructuresType.PdbxReferenceMoleculeRelatedStructures }
     * 
     * 
     */
    public List<PdbxReferenceMoleculeRelatedStructuresType.PdbxReferenceMoleculeRelatedStructures> getPdbxReferenceMoleculeRelatedStructures() {
        if (pdbxReferenceMoleculeRelatedStructures == null) {
            pdbxReferenceMoleculeRelatedStructures = new ArrayList<PdbxReferenceMoleculeRelatedStructuresType.PdbxReferenceMoleculeRelatedStructures>();
        }
        return this.pdbxReferenceMoleculeRelatedStructures;
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
     *         &lt;element name="citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_accession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxReferenceMoleculeRelatedStructures {

        @XmlElementRef(name = "citation_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> citationId;
        @XmlElementRef(name = "db_accession", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbAccession;
        @XmlElementRef(name = "db_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbCode;
        @XmlElementRef(name = "db_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbName;
        @XmlElementRef(name = "formula", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> formula;
        @XmlElementRef(name = "name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> name;
        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

        /**
         * Gets the value of the citationId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCitationId() {
            return citationId;
        }

        /**
         * Sets the value of the citationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCitationId(JAXBElement<String> value) {
            this.citationId = value;
        }

        /**
         * Gets the value of the dbAccession property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbAccession() {
            return dbAccession;
        }

        /**
         * Sets the value of the dbAccession property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbAccession(JAXBElement<String> value) {
            this.dbAccession = value;
        }

        /**
         * Gets the value of the dbCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbCode() {
            return dbCode;
        }

        /**
         * Sets the value of the dbCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbCode(JAXBElement<String> value) {
            this.dbCode = value;
        }

        /**
         * Gets the value of the dbName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbName() {
            return dbName;
        }

        /**
         * Sets the value of the dbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbName(JAXBElement<String> value) {
            this.dbName = value;
        }

        /**
         * Gets the value of the formula property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFormula() {
            return formula;
        }

        /**
         * Sets the value of the formula property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFormula(JAXBElement<String> value) {
            this.formula = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setName(JAXBElement<String> value) {
            this.name = value;
        }

        /**
         * Gets the value of the familyPrdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyPrdId() {
            return familyPrdId;
        }

        /**
         * Sets the value of the familyPrdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyPrdId(String value) {
            this.familyPrdId = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
        }

    }

}
