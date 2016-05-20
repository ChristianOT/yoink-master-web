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
 * Data items in the STRUCT_SITE_GEN category record details about
 * the generation of portions of the structure that contribute to
 * structurally relevant sites.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_site_genCategory>
 *    <PDBx:struct_site_gen id="1" site_id="1">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>VAL</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>32</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="2" site_id="1">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>ILE</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>47</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="3" site_id="1">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>VAL</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>82</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="4" site_id="1">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>ILE</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>84</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="5" site_id="2">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>B</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>VAL</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>232</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="6" site_id="2">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>B</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>ILE</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>247</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="7" site_id="2">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>B</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>VAL</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>282</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 *    <PDBx:struct_site_gen id="8" site_id="2">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:label_asym_id>B</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>ILE</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>284</PDBx:label_seq_id>
 *       <PDBx:symmetry>1_555</PDBx:symmetry>
 *    </PDBx:struct_site_gen>
 * </PDBx:struct_site_genCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_site_genType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_site_genType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_site_gen" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="pdbx_auth_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_num_res" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="symmetry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="site_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_site_genType", propOrder = {
    "structSiteGen"
})
public class StructSiteGenType {

    @XmlElement(name = "struct_site_gen")
    protected List<StructSiteGenType.StructSiteGen> structSiteGen;

    /**
     * Gets the value of the structSiteGen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structSiteGen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructSiteGen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructSiteGenType.StructSiteGen }
     * 
     * 
     */
    public List<StructSiteGenType.StructSiteGen> getStructSiteGen() {
        if (structSiteGen == null) {
            structSiteGen = new ArrayList<StructSiteGenType.StructSiteGen>();
        }
        return this.structSiteGen;
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
     *         &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_atom_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="pdbx_auth_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_num_res" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="symmetry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="site_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructSiteGen {

        @XmlElementRef(name = "auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAsymId;
        @XmlElementRef(name = "auth_atom_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAtomId;
        @XmlElementRef(name = "auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authCompId;
        @XmlElementRef(name = "auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authSeqId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "label_alt_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId;
        @XmlElement(name = "label_asym_id", required = true)
        protected String labelAsymId;
        @XmlElement(name = "label_atom_id", required = true, nillable = true)
        protected String labelAtomId;
        @XmlElement(name = "label_comp_id", required = true)
        protected String labelCompId;
        @XmlElement(name = "label_seq_id", required = true, nillable = true)
        protected BigInteger labelSeqId;
        @XmlElementRef(name = "pdbx_auth_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAuthInsCode;
        @XmlElementRef(name = "pdbx_num_res", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumRes;
        @XmlElementRef(name = "symmetry", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> symmetry;
        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "site_id", required = true)
        protected String siteId;

        /**
         * Gets the value of the authAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthAsymId() {
            return authAsymId;
        }

        /**
         * Sets the value of the authAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthAsymId(JAXBElement<String> value) {
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
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthCompId() {
            return authCompId;
        }

        /**
         * Sets the value of the authCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthCompId(JAXBElement<String> value) {
            this.authCompId = value;
        }

        /**
         * Gets the value of the authSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAuthSeqId() {
            return authSeqId;
        }

        /**
         * Sets the value of the authSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAuthSeqId(JAXBElement<String> value) {
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
         * Gets the value of the labelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelAsymId() {
            return labelAsymId;
        }

        /**
         * Sets the value of the labelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelAsymId(String value) {
            this.labelAsymId = value;
        }

        /**
         * Gets the value of the labelAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelAtomId() {
            return labelAtomId;
        }

        /**
         * Sets the value of the labelAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelAtomId(String value) {
            this.labelAtomId = value;
        }

        /**
         * Gets the value of the labelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelCompId() {
            return labelCompId;
        }

        /**
         * Sets the value of the labelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelCompId(String value) {
            this.labelCompId = value;
        }

        /**
         * Gets the value of the labelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLabelSeqId() {
            return labelSeqId;
        }

        /**
         * Sets the value of the labelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLabelSeqId(BigInteger value) {
            this.labelSeqId = value;
        }

        /**
         * Gets the value of the pdbxAuthInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAuthInsCode() {
            return pdbxAuthInsCode;
        }

        /**
         * Sets the value of the pdbxAuthInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAuthInsCode(JAXBElement<String> value) {
            this.pdbxAuthInsCode = value;
        }

        /**
         * Gets the value of the pdbxNumRes property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumRes() {
            return pdbxNumRes;
        }

        /**
         * Sets the value of the pdbxNumRes property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumRes(JAXBElement<BigInteger> value) {
            this.pdbxNumRes = value;
        }

        /**
         * Gets the value of the symmetry property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSymmetry() {
            return symmetry;
        }

        /**
         * Sets the value of the symmetry property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSymmetry(JAXBElement<String> value) {
            this.symmetry = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the siteId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteId() {
            return siteId;
        }

        /**
         * Sets the value of the siteId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteId(String value) {
            this.siteId = value;
        }

    }

}
