//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.core.pdbml.v42.generated;

import java.math.BigDecimal;
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
 * Data items in the PDBX_VALIDATE_CHIRAL category list the
 * residues that contain unexpected configuration of chiral
 * centers.
 * IMPROPER   HA  N   C   CB   chirality CA
 * IMPROPER   HB1 HB2 CA  CG   stereo CB
 * as this number approaches (+) or (-) 180.0, then the
 * error in predicting the true chirality of the center increases.
 * Improper dihedrals are a measure of the chirality/planarity of the
 * structure at a specific atom. Values around -35 or +35 are expected
 * for chiral atoms, and values around 0 for planar atoms.
 * HERE improper C---N----CA---CB done
 * expected answer is around -120 mean -122.52
 * D-amino acid is +120.0
 * 
 *     Example 1 
 * <PDBx:pdbx_validate_chiralCategory>
 *    <PDBx:pdbx_validate_chiral id="1">
 *       <PDBx:PDB_ins_code xsi:nil="true" />
 *       <PDBx:PDB_model_num>0</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id>ASP</PDBx:auth_asym_id>
 *       <PDBx:auth_comp_id>B</PDBx:auth_comp_id>
 *       <PDBx:auth_seq_id>405</PDBx:auth_seq_id>
 *       <PDBx:details>ALPHA-CARBON</PDBx:details>
 *       <PDBx:omega>150.48</PDBx:omega>
 *    </PDBx:pdbx_validate_chiral>
 * </PDBx:pdbx_validate_chiralCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_validate_chiralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_validate_chiralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_validate_chiral" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="omega">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="-180.0"/>
 *                         &lt;maxInclusive value="180.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_validate_chiralType", propOrder = {
    "pdbxValidateChiral"
})
public class PdbxValidateChiralType {

    @XmlElement(name = "pdbx_validate_chiral")
    protected List<PdbxValidateChiralType.PdbxValidateChiral> pdbxValidateChiral;

    /**
     * Gets the value of the pdbxValidateChiral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxValidateChiral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxValidateChiral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxValidateChiralType.PdbxValidateChiral }
     * 
     * 
     */
    public List<PdbxValidateChiralType.PdbxValidateChiral> getPdbxValidateChiral() {
        if (pdbxValidateChiral == null) {
            pdbxValidateChiral = new ArrayList<PdbxValidateChiralType.PdbxValidateChiral>();
        }
        return this.pdbxValidateChiral;
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
     *         &lt;element name="PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="omega">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-180.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxValidateChiral {

        @XmlElementRef(name = "PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode;
        @XmlElement(name = "PDB_model_num", required = true)
        protected BigInteger pdbModelNum;
        @XmlElement(name = "auth_asym_id", required = true)
        protected String authAsymId;
        @XmlElementRef(name = "auth_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAtomId;
        @XmlElement(name = "auth_comp_id", required = true)
        protected String authCompId;
        @XmlElement(name = "auth_seq_id", required = true)
        protected String authSeqId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId;
        @XmlElement(required = true, nillable = true)
        protected BigDecimal omega;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the pdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPDBInsCode() {
            return pdbInsCode;
        }

        /**
         * Sets the value of the pdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPDBInsCode(JAXBElement<String> value) {
            this.pdbInsCode = value;
        }

        /**
         * Gets the value of the pdbModelNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPDBModelNum() {
            return pdbModelNum;
        }

        /**
         * Sets the value of the pdbModelNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPDBModelNum(BigInteger value) {
            this.pdbModelNum = value;
        }

        /**
         * Gets the value of the authAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAsymId() {
            return authAsymId;
        }

        /**
         * Sets the value of the authAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAsymId(String value) {
            this.authAsymId = value;
        }

        /**
         * Gets the value of the authAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthAtomId() {
            return authAtomId;
        }

        /**
         * Sets the value of the authAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthAtomId(JAXBElement<String> value) {
            this.authAtomId = value;
        }

        /**
         * Gets the value of the authCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthCompId() {
            return authCompId;
        }

        /**
         * Sets the value of the authCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthCompId(String value) {
            this.authCompId = value;
        }

        /**
         * Gets the value of the authSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthSeqId() {
            return authSeqId;
        }

        /**
         * Sets the value of the authSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthSeqId(String value) {
            this.authSeqId = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDetails(JAXBElement<String> value) {
            this.details = value;
        }

        /**
         * Gets the value of the labelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAltId() {
            return labelAltId;
        }

        /**
         * Sets the value of the labelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAltId(JAXBElement<String> value) {
            this.labelAltId = value;
        }

        /**
         * Gets the value of the omega property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOmega() {
            return omega;
        }

        /**
         * Sets the value of the omega property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOmega(BigDecimal value) {
            this.omega = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

    }

}
