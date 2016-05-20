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
 * Data items in the PHASING_MAD category record details about
 * the phasing of the structure where methods involving
 * multiple-wavelength anomalous-dispersion techniques are involved.
 * 
 *     Example 1 - based on a paper by Shapiro et al. [Nature (London)
 *                 (1995), 374, 327-337].
 * <PDBx:phasing_MADCategory>
 *    <PDBx:phasing_MAD entry_id="NCAD"></PDBx:phasing_MAD>
 * </PDBx:phasing_MADCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for phasing_MADType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phasing_MADType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phasing_MAD" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_R_cullis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_R_cullis_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_R_cullis_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_R_kraut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_R_kraut_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_R_kraut_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_anom_scat_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_d_res_high" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_d_res_low" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_fom_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_fom_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_loc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_loc_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_loc_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_data_sets" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_power" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_power_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_power_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdbx_reflns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_reflns_acentric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_reflns_centric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "phasing_MADType", propOrder = {
    "phasingMAD"
})
public class PhasingMADType {

    @XmlElement(name = "phasing_MAD")
    protected List<PhasingMADType.PhasingMAD> phasingMAD;

    /**
     * Gets the value of the phasingMAD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phasingMAD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhasingMAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhasingMADType.PhasingMAD }
     * 
     * 
     */
    public List<PhasingMADType.PhasingMAD> getPhasingMAD() {
        if (phasingMAD == null) {
            phasingMAD = new ArrayList<PhasingMADType.PhasingMAD>();
        }
        return this.phasingMAD;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_R_cullis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_R_cullis_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_R_cullis_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_R_kraut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_R_kraut_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_R_kraut_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_anom_scat_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_d_res_high" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_d_res_low" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_fom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_fom_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_fom_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_loc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_loc_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_loc_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_number_data_sets" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_power" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_power_acentric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_power_centric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdbx_reflns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_reflns_acentric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_reflns_centric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    public static class PhasingMAD {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "method", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> method;
        @XmlElementRef(name = "pdbx_R_cullis", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRCullis;
        @XmlElementRef(name = "pdbx_R_cullis_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRCullisAcentric;
        @XmlElementRef(name = "pdbx_R_cullis_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRCullisCentric;
        @XmlElementRef(name = "pdbx_R_kraut", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRKraut;
        @XmlElementRef(name = "pdbx_R_kraut_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRKrautAcentric;
        @XmlElementRef(name = "pdbx_R_kraut_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxRKrautCentric;
        @XmlElementRef(name = "pdbx_anom_scat_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAnomScatMethod;
        @XmlElementRef(name = "pdbx_d_res_high", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxDResHigh;
        @XmlElementRef(name = "pdbx_d_res_low", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxDResLow;
        @XmlElementRef(name = "pdbx_fom", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFom;
        @XmlElementRef(name = "pdbx_fom_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFomAcentric;
        @XmlElementRef(name = "pdbx_fom_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxFomCentric;
        @XmlElementRef(name = "pdbx_loc", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxLoc;
        @XmlElementRef(name = "pdbx_loc_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxLocAcentric;
        @XmlElementRef(name = "pdbx_loc_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxLocCentric;
        @XmlElementRef(name = "pdbx_number_data_sets", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberDataSets;
        @XmlElementRef(name = "pdbx_power", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxPower;
        @XmlElementRef(name = "pdbx_power_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxPowerAcentric;
        @XmlElementRef(name = "pdbx_power_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pdbxPowerCentric;
        @XmlElementRef(name = "pdbx_reflns", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxReflns;
        @XmlElementRef(name = "pdbx_reflns_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxReflnsAcentric;
        @XmlElementRef(name = "pdbx_reflns_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxReflnsCentric;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

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
         * Gets the value of the pdbxRCullis property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRCullis() {
            return pdbxRCullis;
        }

        /**
         * Sets the value of the pdbxRCullis property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRCullis(JAXBElement<BigDecimal> value) {
            this.pdbxRCullis = value;
        }

        /**
         * Gets the value of the pdbxRCullisAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRCullisAcentric() {
            return pdbxRCullisAcentric;
        }

        /**
         * Sets the value of the pdbxRCullisAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRCullisAcentric(JAXBElement<BigDecimal> value) {
            this.pdbxRCullisAcentric = value;
        }

        /**
         * Gets the value of the pdbxRCullisCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRCullisCentric() {
            return pdbxRCullisCentric;
        }

        /**
         * Sets the value of the pdbxRCullisCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRCullisCentric(JAXBElement<BigDecimal> value) {
            this.pdbxRCullisCentric = value;
        }

        /**
         * Gets the value of the pdbxRKraut property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRKraut() {
            return pdbxRKraut;
        }

        /**
         * Sets the value of the pdbxRKraut property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRKraut(JAXBElement<BigDecimal> value) {
            this.pdbxRKraut = value;
        }

        /**
         * Gets the value of the pdbxRKrautAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRKrautAcentric() {
            return pdbxRKrautAcentric;
        }

        /**
         * Sets the value of the pdbxRKrautAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRKrautAcentric(JAXBElement<BigDecimal> value) {
            this.pdbxRKrautAcentric = value;
        }

        /**
         * Gets the value of the pdbxRKrautCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxRKrautCentric() {
            return pdbxRKrautCentric;
        }

        /**
         * Sets the value of the pdbxRKrautCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxRKrautCentric(JAXBElement<BigDecimal> value) {
            this.pdbxRKrautCentric = value;
        }

        /**
         * Gets the value of the pdbxAnomScatMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAnomScatMethod() {
            return pdbxAnomScatMethod;
        }

        /**
         * Sets the value of the pdbxAnomScatMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAnomScatMethod(JAXBElement<String> value) {
            this.pdbxAnomScatMethod = value;
        }

        /**
         * Gets the value of the pdbxDResHigh property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxDResHigh() {
            return pdbxDResHigh;
        }

        /**
         * Sets the value of the pdbxDResHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxDResHigh(JAXBElement<BigDecimal> value) {
            this.pdbxDResHigh = value;
        }

        /**
         * Gets the value of the pdbxDResLow property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxDResLow() {
            return pdbxDResLow;
        }

        /**
         * Sets the value of the pdbxDResLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxDResLow(JAXBElement<BigDecimal> value) {
            this.pdbxDResLow = value;
        }

        /**
         * Gets the value of the pdbxFom property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFom() {
            return pdbxFom;
        }

        /**
         * Sets the value of the pdbxFom property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFom(JAXBElement<BigDecimal> value) {
            this.pdbxFom = value;
        }

        /**
         * Gets the value of the pdbxFomAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFomAcentric() {
            return pdbxFomAcentric;
        }

        /**
         * Sets the value of the pdbxFomAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFomAcentric(JAXBElement<BigDecimal> value) {
            this.pdbxFomAcentric = value;
        }

        /**
         * Gets the value of the pdbxFomCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxFomCentric() {
            return pdbxFomCentric;
        }

        /**
         * Sets the value of the pdbxFomCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxFomCentric(JAXBElement<BigDecimal> value) {
            this.pdbxFomCentric = value;
        }

        /**
         * Gets the value of the pdbxLoc property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxLoc() {
            return pdbxLoc;
        }

        /**
         * Sets the value of the pdbxLoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxLoc(JAXBElement<BigDecimal> value) {
            this.pdbxLoc = value;
        }

        /**
         * Gets the value of the pdbxLocAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxLocAcentric() {
            return pdbxLocAcentric;
        }

        /**
         * Sets the value of the pdbxLocAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxLocAcentric(JAXBElement<BigDecimal> value) {
            this.pdbxLocAcentric = value;
        }

        /**
         * Gets the value of the pdbxLocCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxLocCentric() {
            return pdbxLocCentric;
        }

        /**
         * Sets the value of the pdbxLocCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxLocCentric(JAXBElement<BigDecimal> value) {
            this.pdbxLocCentric = value;
        }

        /**
         * Gets the value of the pdbxNumberDataSets property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberDataSets() {
            return pdbxNumberDataSets;
        }

        /**
         * Sets the value of the pdbxNumberDataSets property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberDataSets(JAXBElement<BigInteger> value) {
            this.pdbxNumberDataSets = value;
        }

        /**
         * Gets the value of the pdbxPower property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxPower() {
            return pdbxPower;
        }

        /**
         * Sets the value of the pdbxPower property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxPower(JAXBElement<BigDecimal> value) {
            this.pdbxPower = value;
        }

        /**
         * Gets the value of the pdbxPowerAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxPowerAcentric() {
            return pdbxPowerAcentric;
        }

        /**
         * Sets the value of the pdbxPowerAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxPowerAcentric(JAXBElement<BigDecimal> value) {
            this.pdbxPowerAcentric = value;
        }

        /**
         * Gets the value of the pdbxPowerCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPdbxPowerCentric() {
            return pdbxPowerCentric;
        }

        /**
         * Sets the value of the pdbxPowerCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPdbxPowerCentric(JAXBElement<BigDecimal> value) {
            this.pdbxPowerCentric = value;
        }

        /**
         * Gets the value of the pdbxReflns property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxReflns() {
            return pdbxReflns;
        }

        /**
         * Sets the value of the pdbxReflns property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxReflns(JAXBElement<BigInteger> value) {
            this.pdbxReflns = value;
        }

        /**
         * Gets the value of the pdbxReflnsAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxReflnsAcentric() {
            return pdbxReflnsAcentric;
        }

        /**
         * Sets the value of the pdbxReflnsAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxReflnsAcentric(JAXBElement<BigInteger> value) {
            this.pdbxReflnsAcentric = value;
        }

        /**
         * Gets the value of the pdbxReflnsCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxReflnsCentric() {
            return pdbxReflnsCentric;
        }

        /**
         * Sets the value of the pdbxReflnsCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxReflnsCentric(JAXBElement<BigInteger> value) {
            this.pdbxReflnsCentric = value;
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
