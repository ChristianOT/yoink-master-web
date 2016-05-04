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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * Data items in the PHASING_SET_REFLN category record the values
 * of the measured structure factors used in a phasing experiment.
 * This list may contain information from a number of different
 * data sets; attribute set_id in category phasing_set_refln indicates the data set
 *  to which a given record corresponds.
 * 
 *     Example 1 - based on laboratory records for the 15,15,32
 *                 reflection of an Hg/Pt derivative of protein NS1.
 * <PDBx:phasing_set_reflnCategory>
 *    <PDBx:phasing_set_refln index_h="15" index_k="15" index_l="32" set_id="NS1-96">
 *       <PDBx:F_meas_au>181.79</PDBx:F_meas_au>
 *       <PDBx:F_meas_sigma_au>3.72</PDBx:F_meas_sigma_au>
 *    </PDBx:phasing_set_refln>
 * </PDBx:phasing_set_reflnCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for phasing_set_reflnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phasing_set_reflnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phasing_set_refln" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="F_meas" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="electrons" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="F_meas_au" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="F_meas_sigma" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="electrons" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="F_meas_sigma_au" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="set_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "phasing_set_reflnType", propOrder = {
    "phasingSetRefln"
})
public class PhasingSetReflnType {

    @XmlElement(name = "phasing_set_refln")
    protected List<PhasingSetReflnType.PhasingSetRefln> phasingSetRefln;

    /**
     * Gets the value of the phasingSetRefln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phasingSetRefln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhasingSetRefln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhasingSetReflnType.PhasingSetRefln }
     * 
     * 
     */
    public List<PhasingSetReflnType.PhasingSetRefln> getPhasingSetRefln() {
        if (phasingSetRefln == null) {
            phasingSetRefln = new ArrayList<PhasingSetReflnType.PhasingSetRefln>();
        }
        return this.phasingSetRefln;
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
     *         &lt;element name="F_meas" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="electrons" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="F_meas_au" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="F_meas_sigma" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="electrons" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="F_meas_sigma_au" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="set_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PhasingSetRefln {

        @XmlElementRef(name = "F_meas", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeas> fMeas;
        @XmlElementRef(name = "F_meas_au", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasAu> fMeasAu;
        @XmlElementRef(name = "F_meas_sigma", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasSigma> fMeasSigma;
        @XmlElementRef(name = "F_meas_sigma_au", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasSigmaAu> fMeasSigmaAu;
        @XmlAttribute(name = "index_h", required = true)
        protected BigInteger indexH;
        @XmlAttribute(name = "index_k", required = true)
        protected BigInteger indexK;
        @XmlAttribute(name = "index_l", required = true)
        protected BigInteger indexL;
        @XmlAttribute(name = "set_id", required = true)
        protected String setId;

        /**
         * Gets the value of the fMeas property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeas }{@code >}
         *     
         */
        public JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeas> getFMeas() {
            return fMeas;
        }

        /**
         * Sets the value of the fMeas property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeas }{@code >}
         *     
         */
        public void setFMeas(JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeas> value) {
            this.fMeas = value;
        }

        /**
         * Gets the value of the fMeasAu property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeasAu }{@code >}
         *     
         */
        public JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasAu> getFMeasAu() {
            return fMeasAu;
        }

        /**
         * Sets the value of the fMeasAu property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeasAu }{@code >}
         *     
         */
        public void setFMeasAu(JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasAu> value) {
            this.fMeasAu = value;
        }

        /**
         * Gets the value of the fMeasSigma property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeasSigma }{@code >}
         *     
         */
        public JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasSigma> getFMeasSigma() {
            return fMeasSigma;
        }

        /**
         * Sets the value of the fMeasSigma property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeasSigma }{@code >}
         *     
         */
        public void setFMeasSigma(JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasSigma> value) {
            this.fMeasSigma = value;
        }

        /**
         * Gets the value of the fMeasSigmaAu property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeasSigmaAu }{@code >}
         *     
         */
        public JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasSigmaAu> getFMeasSigmaAu() {
            return fMeasSigmaAu;
        }

        /**
         * Sets the value of the fMeasSigmaAu property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PhasingSetReflnType.PhasingSetRefln.FMeasSigmaAu }{@code >}
         *     
         */
        public void setFMeasSigmaAu(JAXBElement<PhasingSetReflnType.PhasingSetRefln.FMeasSigmaAu> value) {
            this.fMeasSigmaAu = value;
        }

        /**
         * Gets the value of the indexH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexH() {
            return indexH;
        }

        /**
         * Sets the value of the indexH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexH(BigInteger value) {
            this.indexH = value;
        }

        /**
         * Gets the value of the indexK property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexK() {
            return indexK;
        }

        /**
         * Sets the value of the indexK property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexK(BigInteger value) {
            this.indexK = value;
        }

        /**
         * Gets the value of the indexL property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexL() {
            return indexL;
        }

        /**
         * Sets the value of the indexL property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexL(BigInteger value) {
            this.indexL = value;
        }

        /**
         * Gets the value of the setId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSetId() {
            return setId;
        }

        /**
         * Sets the value of the setId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSetId(String value) {
            this.setId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="electrons" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FMeas {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "electrons";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FMeasAu {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "arbitrary";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="electrons" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FMeasSigma {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "electrons";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="arbitrary" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FMeasSigmaAu {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "arbitrary";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
