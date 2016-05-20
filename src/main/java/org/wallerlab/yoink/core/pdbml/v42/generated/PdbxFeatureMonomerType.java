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
 * Data items in the PDBX_FEATURE_MONOMER category records 
 * information about properties pertaining to particular
 * monomers in this structure.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_feature_monomerCategory>
 *    <PDBx:pdbx_feature_monomer id="1">
 *       <PDBx:feature>129.4</PDBx:feature>
 *       <PDBx:feature_assigned_by>POPS</PDBx:feature_assigned_by>
 *       <PDBx:feature_citation_id>pops</PDBx:feature_citation_id>
 *       <PDBx:feature_name>SASA</PDBx:feature_name>
 *       <PDBx:feature_type>value</PDBx:feature_type>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>ASP</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>1</PDBx:label_seq_id>
 *    </PDBx:pdbx_feature_monomer>
 *    <PDBx:pdbx_feature_monomer id="1">
 *       <PDBx:feature>35.5</PDBx:feature>
 *       <PDBx:feature_assigned_by>POPS</PDBx:feature_assigned_by>
 *       <PDBx:feature_citation_id>pops</PDBx:feature_citation_id>
 *       <PDBx:feature_name>SASA</PDBx:feature_name>
 *       <PDBx:feature_type>value</PDBx:feature_type>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>ILE</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>2</PDBx:label_seq_id>
 *    </PDBx:pdbx_feature_monomer>
 *    <PDBx:pdbx_feature_monomer id="1">
 *       <PDBx:feature>87.2</PDBx:feature>
 *       <PDBx:feature_assigned_by>POPS</PDBx:feature_assigned_by>
 *       <PDBx:feature_citation_id>pops</PDBx:feature_citation_id>
 *       <PDBx:feature_name>SASA</PDBx:feature_name>
 *       <PDBx:feature_type>value</PDBx:feature_type>
 *       <PDBx:label_alt_id xsi:nil="true" />
 *       <PDBx:label_asym_id>A</PDBx:label_asym_id>
 *       <PDBx:label_comp_id>VAL</PDBx:label_comp_id>
 *       <PDBx:label_seq_id>3</PDBx:label_seq_id>
 *    </PDBx:pdbx_feature_monomer>
 * </PDBx:pdbx_feature_monomerCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_feature_monomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_feature_monomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_feature_monomer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="feature_assigned_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="feature_citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="feature_software_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feature_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="value"/>
 *                         &lt;enumeration value="uri"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_feature_monomerType", propOrder = {
    "pdbxFeatureMonomer"
})
public class PdbxFeatureMonomerType {

    @XmlElement(name = "pdbx_feature_monomer")
    protected List<PdbxFeatureMonomerType.PdbxFeatureMonomer> pdbxFeatureMonomer;

    /**
     * Gets the value of the pdbxFeatureMonomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxFeatureMonomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxFeatureMonomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxFeatureMonomerType.PdbxFeatureMonomer }
     * 
     * 
     */
    public List<PdbxFeatureMonomerType.PdbxFeatureMonomer> getPdbxFeatureMonomer() {
        if (pdbxFeatureMonomer == null) {
            pdbxFeatureMonomer = new ArrayList<PdbxFeatureMonomerType.PdbxFeatureMonomer>();
        }
        return this.pdbxFeatureMonomer;
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
     *         &lt;element name="auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="feature_assigned_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="feature_citation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="feature_software_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feature_type">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="value"/>
     *               &lt;enumeration value="uri"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="label_alt_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxFeatureMonomer {

        @XmlElementRef(name = "auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authAsymId;
        @XmlElementRef(name = "auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authCompId;
        @XmlElementRef(name = "auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> authSeqId;
        @XmlElement(required = true)
        protected String feature;
        @XmlElement(name = "feature_assigned_by", required = true)
        protected String featureAssignedBy;
        @XmlElementRef(name = "feature_citation_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> featureCitationId;
        @XmlElementRef(name = "feature_identifier", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> featureIdentifier;
        @XmlElement(name = "feature_name", required = true)
        protected String featureName;
        @XmlElementRef(name = "feature_software_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> featureSoftwareId;
        @XmlElement(name = "feature_type", required = true)
        protected String featureType;
        @XmlElement(name = "label_alt_id", required = true)
        protected String labelAltId;
        @XmlElement(name = "label_asym_id", required = true)
        protected String labelAsymId;
        @XmlElement(name = "label_comp_id", required = true)
        protected String labelCompId;
        @XmlElement(name = "label_seq_id", required = true)
        protected BigInteger labelSeqId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the feature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeature() {
            return feature;
        }

        /**
         * Sets the value of the feature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeature(String value) {
            this.feature = value;
        }

        /**
         * Gets the value of the featureAssignedBy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureAssignedBy() {
            return featureAssignedBy;
        }

        /**
         * Sets the value of the featureAssignedBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureAssignedBy(String value) {
            this.featureAssignedBy = value;
        }

        /**
         * Gets the value of the featureCitationId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFeatureCitationId() {
            return featureCitationId;
        }

        /**
         * Sets the value of the featureCitationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFeatureCitationId(JAXBElement<String> value) {
            this.featureCitationId = value;
        }

        /**
         * Gets the value of the featureIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFeatureIdentifier() {
            return featureIdentifier;
        }

        /**
         * Sets the value of the featureIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFeatureIdentifier(JAXBElement<String> value) {
            this.featureIdentifier = value;
        }

        /**
         * Gets the value of the featureName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureName() {
            return featureName;
        }

        /**
         * Sets the value of the featureName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureName(String value) {
            this.featureName = value;
        }

        /**
         * Gets the value of the featureSoftwareId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFeatureSoftwareId() {
            return featureSoftwareId;
        }

        /**
         * Sets the value of the featureSoftwareId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFeatureSoftwareId(JAXBElement<String> value) {
            this.featureSoftwareId = value;
        }

        /**
         * Gets the value of the featureType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureType() {
            return featureType;
        }

        /**
         * Sets the value of the featureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureType(String value) {
            this.featureType = value;
        }

        /**
         * Gets the value of the labelAltId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabelAltId() {
            return labelAltId;
        }

        /**
         * Sets the value of the labelAltId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabelAltId(String value) {
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

    }

}
