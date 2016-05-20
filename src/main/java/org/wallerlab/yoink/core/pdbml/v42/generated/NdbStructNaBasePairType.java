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
 * Data items in the NDB_STRUCT_NA_BASE_PAIR category record details 
 * of base pairing interactions.
 * <PDBx:ndb_struct_na_base_pairCategory>
 *    <PDBx:ndb_struct_na_base_pair i_label_asym_id="A" i_label_comp_id="G" i_label_seq_id="1" i_symmetry="1_555" j_label_asym_id="A" j_label_comp_id="C" j_label_seq_id="8" j_symmetry="7_555" model_number="1">
 *       <PDBx:buckle>-5.523</PDBx:buckle>
 *       <PDBx:opening>-3.291</PDBx:opening>
 *       <PDBx:propeller>-6.752</PDBx:propeller>
 *       <PDBx:shear>-0.396</PDBx:shear>
 *       <PDBx:stagger>-0.018</PDBx:stagger>
 *       <PDBx:stretch>-0.156</PDBx:stretch>
 *    </PDBx:ndb_struct_na_base_pair>
 *    <PDBx:ndb_struct_na_base_pair i_label_asym_id="A" i_label_comp_id="G" i_label_seq_id="2" i_symmetry="1_555" j_label_asym_id="A" j_label_comp_id="C" j_label_seq_id="7" j_symmetry="7_555" model_number="1">
 *       <PDBx:buckle>-4.727</PDBx:buckle>
 *       <PDBx:opening>2.311</PDBx:opening>
 *       <PDBx:propeller>-9.765</PDBx:propeller>
 *       <PDBx:shear>-0.094</PDBx:shear>
 *       <PDBx:stagger>-0.334</PDBx:stagger>
 *       <PDBx:stretch>-0.220</PDBx:stretch>
 *    </PDBx:ndb_struct_na_base_pair>
 *    <PDBx:ndb_struct_na_base_pair i_label_asym_id="A" i_label_comp_id="G" i_label_seq_id="3" i_symmetry="1_555" j_label_asym_id="A" j_label_comp_id="C" j_label_seq_id="6" j_symmetry="7_555" model_number="1">
 *       <PDBx:buckle>-6.454</PDBx:buckle>
 *       <PDBx:opening>-1.181</PDBx:opening>
 *       <PDBx:propeller>-12.575</PDBx:propeller>
 *       <PDBx:shear>-0.285</PDBx:shear>
 *       <PDBx:stagger>0.008</PDBx:stagger>
 *       <PDBx:stretch>-0.239</PDBx:stretch>
 *    </PDBx:ndb_struct_na_base_pair>
 * </PDBx:ndb_struct_na_base_pairCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for ndb_struct_na_base_pairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ndb_struct_na_base_pairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ndb_struct_na_base_pair" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="buckle" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="hbond_type_12" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="hbond_type_28" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="i_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="i_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="i_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="j_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="j_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="j_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="opening" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pair_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pair_number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="propeller" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="shear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="stagger" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="stretch" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="i_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="i_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="i_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="i_symmetry" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="j_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="j_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="j_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="j_symmetry" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="model_number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "ndb_struct_na_base_pairType", propOrder = {
    "ndbStructNaBasePair"
})
public class NdbStructNaBasePairType {

    @XmlElement(name = "ndb_struct_na_base_pair")
    protected List<NdbStructNaBasePairType.NdbStructNaBasePair> ndbStructNaBasePair;

    /**
     * Gets the value of the ndbStructNaBasePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndbStructNaBasePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNdbStructNaBasePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NdbStructNaBasePairType.NdbStructNaBasePair }
     * 
     * 
     */
    public List<NdbStructNaBasePairType.NdbStructNaBasePair> getNdbStructNaBasePair() {
        if (ndbStructNaBasePair == null) {
            ndbStructNaBasePair = new ArrayList<NdbStructNaBasePairType.NdbStructNaBasePair>();
        }
        return this.ndbStructNaBasePair;
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
     *         &lt;element name="buckle" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="hbond_type_12" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="hbond_type_28" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="i_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="i_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="i_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="j_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="j_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="j_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="opening" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pair_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pair_number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="propeller" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="shear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="stagger" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="stretch" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="i_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="i_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="i_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="i_symmetry" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="j_label_asym_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="j_label_comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="j_label_seq_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="j_symmetry" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="model_number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class NdbStructNaBasePair {

        @XmlElementRef(name = "buckle", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> buckle;
        @XmlElementRef(name = "hbond_type_12", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> hbondType12;
        @XmlElementRef(name = "hbond_type_28", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> hbondType28;
        @XmlElementRef(name = "i_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ipdbInsCode;
        @XmlElement(name = "i_auth_asym_id", required = true)
        protected String iAuthAsymId;
        @XmlElement(name = "i_auth_seq_id", required = true)
        protected String iAuthSeqId;
        @XmlElementRef(name = "j_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> jpdbInsCode;
        @XmlElement(name = "j_auth_asym_id", required = true)
        protected String jAuthAsymId;
        @XmlElement(name = "j_auth_seq_id", required = true)
        protected String jAuthSeqId;
        @XmlElementRef(name = "opening", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> opening;
        @XmlElement(name = "pair_name", required = true)
        protected String pairName;
        @XmlElement(name = "pair_number", required = true)
        protected BigInteger pairNumber;
        @XmlElementRef(name = "propeller", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> propeller;
        @XmlElementRef(name = "shear", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> shear;
        @XmlElementRef(name = "stagger", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> stagger;
        @XmlElementRef(name = "stretch", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> stretch;
        @XmlAttribute(name = "i_label_asym_id", required = true)
        protected String iLabelAsymId;
        @XmlAttribute(name = "i_label_comp_id", required = true)
        protected String iLabelCompId;
        @XmlAttribute(name = "i_label_seq_id", required = true)
        protected BigInteger iLabelSeqId;
        @XmlAttribute(name = "i_symmetry", required = true)
        protected String iSymmetry;
        @XmlAttribute(name = "j_label_asym_id", required = true)
        protected String jLabelAsymId;
        @XmlAttribute(name = "j_label_comp_id", required = true)
        protected String jLabelCompId;
        @XmlAttribute(name = "j_label_seq_id", required = true)
        protected BigInteger jLabelSeqId;
        @XmlAttribute(name = "j_symmetry", required = true)
        protected String jSymmetry;
        @XmlAttribute(name = "model_number", required = true)
        protected BigInteger modelNumber;

        /**
         * Gets the value of the buckle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getBuckle() {
            return buckle;
        }

        /**
         * Sets the value of the buckle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setBuckle(JAXBElement<BigDecimal> value) {
            this.buckle = value;
        }

        /**
         * Gets the value of the hbondType12 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getHbondType12() {
            return hbondType12;
        }

        /**
         * Sets the value of the hbondType12 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setHbondType12(JAXBElement<BigInteger> value) {
            this.hbondType12 = value;
        }

        /**
         * Gets the value of the hbondType28 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getHbondType28() {
            return hbondType28;
        }

        /**
         * Sets the value of the hbondType28 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setHbondType28(JAXBElement<BigInteger> value) {
            this.hbondType28 = value;
        }

        /**
         * Gets the value of the ipdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIPDBInsCode() {
            return ipdbInsCode;
        }

        /**
         * Sets the value of the ipdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIPDBInsCode(JAXBElement<String> value) {
            this.ipdbInsCode = value;
        }

        /**
         * Gets the value of the iAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIAuthAsymId() {
            return iAuthAsymId;
        }

        /**
         * Sets the value of the iAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIAuthAsymId(String value) {
            this.iAuthAsymId = value;
        }

        /**
         * Gets the value of the iAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIAuthSeqId() {
            return iAuthSeqId;
        }

        /**
         * Sets the value of the iAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIAuthSeqId(String value) {
            this.iAuthSeqId = value;
        }

        /**
         * Gets the value of the jpdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getJPDBInsCode() {
            return jpdbInsCode;
        }

        /**
         * Sets the value of the jpdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setJPDBInsCode(JAXBElement<String> value) {
            this.jpdbInsCode = value;
        }

        /**
         * Gets the value of the jAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJAuthAsymId() {
            return jAuthAsymId;
        }

        /**
         * Sets the value of the jAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJAuthAsymId(String value) {
            this.jAuthAsymId = value;
        }

        /**
         * Gets the value of the jAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJAuthSeqId() {
            return jAuthSeqId;
        }

        /**
         * Sets the value of the jAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJAuthSeqId(String value) {
            this.jAuthSeqId = value;
        }

        /**
         * Gets the value of the opening property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getOpening() {
            return opening;
        }

        /**
         * Sets the value of the opening property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setOpening(JAXBElement<BigDecimal> value) {
            this.opening = value;
        }

        /**
         * Gets the value of the pairName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairName() {
            return pairName;
        }

        /**
         * Sets the value of the pairName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPairName(String value) {
            this.pairName = value;
        }

        /**
         * Gets the value of the pairNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPairNumber() {
            return pairNumber;
        }

        /**
         * Sets the value of the pairNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPairNumber(BigInteger value) {
            this.pairNumber = value;
        }

        /**
         * Gets the value of the propeller property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPropeller() {
            return propeller;
        }

        /**
         * Sets the value of the propeller property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPropeller(JAXBElement<BigDecimal> value) {
            this.propeller = value;
        }

        /**
         * Gets the value of the shear property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getShear() {
            return shear;
        }

        /**
         * Sets the value of the shear property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setShear(JAXBElement<BigDecimal> value) {
            this.shear = value;
        }

        /**
         * Gets the value of the stagger property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getStagger() {
            return stagger;
        }

        /**
         * Sets the value of the stagger property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setStagger(JAXBElement<BigDecimal> value) {
            this.stagger = value;
        }

        /**
         * Gets the value of the stretch property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getStretch() {
            return stretch;
        }

        /**
         * Sets the value of the stretch property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setStretch(JAXBElement<BigDecimal> value) {
            this.stretch = value;
        }

        /**
         * Gets the value of the iLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getILabelAsymId() {
            return iLabelAsymId;
        }

        /**
         * Sets the value of the iLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setILabelAsymId(String value) {
            this.iLabelAsymId = value;
        }

        /**
         * Gets the value of the iLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getILabelCompId() {
            return iLabelCompId;
        }

        /**
         * Sets the value of the iLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setILabelCompId(String value) {
            this.iLabelCompId = value;
        }

        /**
         * Gets the value of the iLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getILabelSeqId() {
            return iLabelSeqId;
        }

        /**
         * Sets the value of the iLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setILabelSeqId(BigInteger value) {
            this.iLabelSeqId = value;
        }

        /**
         * Gets the value of the iSymmetry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISymmetry() {
            return iSymmetry;
        }

        /**
         * Sets the value of the iSymmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISymmetry(String value) {
            this.iSymmetry = value;
        }

        /**
         * Gets the value of the jLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJLabelAsymId() {
            return jLabelAsymId;
        }

        /**
         * Sets the value of the jLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJLabelAsymId(String value) {
            this.jLabelAsymId = value;
        }

        /**
         * Gets the value of the jLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJLabelCompId() {
            return jLabelCompId;
        }

        /**
         * Sets the value of the jLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJLabelCompId(String value) {
            this.jLabelCompId = value;
        }

        /**
         * Gets the value of the jLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getJLabelSeqId() {
            return jLabelSeqId;
        }

        /**
         * Sets the value of the jLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setJLabelSeqId(BigInteger value) {
            this.jLabelSeqId = value;
        }

        /**
         * Gets the value of the jSymmetry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJSymmetry() {
            return jSymmetry;
        }

        /**
         * Sets the value of the jSymmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJSymmetry(String value) {
            this.jSymmetry = value;
        }

        /**
         * Gets the value of the modelNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getModelNumber() {
            return modelNumber;
        }

        /**
         * Sets the value of the modelNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setModelNumber(BigInteger value) {
            this.modelNumber = value;
        }

    }

}
