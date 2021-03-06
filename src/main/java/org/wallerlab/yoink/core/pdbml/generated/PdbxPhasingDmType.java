//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

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
 * Data items in the PDBX_PHASING_DM category record details about 
 * density modification 
 * 
 *     Example 1 - density modification from resolve
 * <PDBx:pdbx_phasing_dmCategory>
 *    <PDBx:pdbx_phasing_dm entry_id="ABC001">
 *       <PDBx:fom>0.85</PDBx:fom>
 *       <PDBx:fom_acentric>0.85</PDBx:fom_acentric>
 *       <PDBx:fom_centric>0.79</PDBx:fom_centric>
 *       <PDBx:reflns>12486</PDBx:reflns>
 *       <PDBx:reflns_acentric>11351</PDBx:reflns_acentric>
 *       <PDBx:reflns_centric>1135</PDBx:reflns_centric>
 *    </PDBx:pdbx_phasing_dm>
 * </PDBx:pdbx_phasing_dmCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_phasing_dmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_phasing_dmType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_phasing_dm" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="delta_phi_final" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="delta_phi_initial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fom_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fom_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mask_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reflns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="reflns_acentric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="reflns_centric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "pdbx_phasing_dmType", propOrder = {
    "pdbxPhasingDm"
})
public class PdbxPhasingDmType {

    @XmlElement(name = "pdbx_phasing_dm")
    protected List<PdbxPhasingDmType.PdbxPhasingDm> pdbxPhasingDm;

    /**
     * Gets the value of the pdbxPhasingDm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxPhasingDm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxPhasingDm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxPhasingDmType.PdbxPhasingDm }
     * 
     * 
     */
    public List<PdbxPhasingDmType.PdbxPhasingDm> getPdbxPhasingDm() {
        if (pdbxPhasingDm == null) {
            pdbxPhasingDm = new ArrayList<PdbxPhasingDmType.PdbxPhasingDm>();
        }
        return this.pdbxPhasingDm;
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
     *         &lt;element name="delta_phi_final" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="delta_phi_initial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fom_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fom_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mask_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reflns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="reflns_acentric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="reflns_centric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    public static class PdbxPhasingDm {

        @XmlElementRef(name = "delta_phi_final", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> deltaPhiFinal;
        @XmlElementRef(name = "delta_phi_initial", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> deltaPhiInitial;
        @XmlElementRef(name = "fom", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fom;
        @XmlElementRef(name = "fom_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fomAcentric;
        @XmlElementRef(name = "fom_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fomCentric;
        @XmlElementRef(name = "mask_type", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> maskType;
        @XmlElementRef(name = "method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> method;
        @XmlElementRef(name = "reflns", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> reflns;
        @XmlElementRef(name = "reflns_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> reflnsAcentric;
        @XmlElementRef(name = "reflns_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> reflnsCentric;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the deltaPhiFinal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDeltaPhiFinal() {
            return deltaPhiFinal;
        }

        /**
         * Sets the value of the deltaPhiFinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDeltaPhiFinal(JAXBElement<BigDecimal> value) {
            this.deltaPhiFinal = value;
        }

        /**
         * Gets the value of the deltaPhiInitial property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDeltaPhiInitial() {
            return deltaPhiInitial;
        }

        /**
         * Sets the value of the deltaPhiInitial property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDeltaPhiInitial(JAXBElement<BigDecimal> value) {
            this.deltaPhiInitial = value;
        }

        /**
         * Gets the value of the fom property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFom() {
            return fom;
        }

        /**
         * Sets the value of the fom property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFom(JAXBElement<BigDecimal> value) {
            this.fom = value;
        }

        /**
         * Gets the value of the fomAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFomAcentric() {
            return fomAcentric;
        }

        /**
         * Sets the value of the fomAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFomAcentric(JAXBElement<BigDecimal> value) {
            this.fomAcentric = value;
        }

        /**
         * Gets the value of the fomCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFomCentric() {
            return fomCentric;
        }

        /**
         * Sets the value of the fomCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFomCentric(JAXBElement<BigDecimal> value) {
            this.fomCentric = value;
        }

        /**
         * Gets the value of the maskType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMaskType() {
            return maskType;
        }

        /**
         * Sets the value of the maskType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMaskType(JAXBElement<String> value) {
            this.maskType = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethod(JAXBElement<String> value) {
            this.method = value;
        }

        /**
         * Gets the value of the reflns property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getReflns() {
            return reflns;
        }

        /**
         * Sets the value of the reflns property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setReflns(JAXBElement<BigInteger> value) {
            this.reflns = value;
        }

        /**
         * Gets the value of the reflnsAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getReflnsAcentric() {
            return reflnsAcentric;
        }

        /**
         * Sets the value of the reflnsAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setReflnsAcentric(JAXBElement<BigInteger> value) {
            this.reflnsAcentric = value;
        }

        /**
         * Gets the value of the reflnsCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getReflnsCentric() {
            return reflnsCentric;
        }

        /**
         * Sets the value of the reflnsCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setReflnsCentric(JAXBElement<BigInteger> value) {
            this.reflnsCentric = value;
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
