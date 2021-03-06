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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * This category contains details for the final purified protein product. Note
 * that this category does not contain the amino acid sequence of the protein.
 * The sequence will be found in the ENTITY_POLY_SEQ entry with matching
 * entity_id.
 * Only one PDBX_ENTITY_SRC_GEN_PURE category is allowed per entity, hence there is
 * no step_id for this category.
 * 
 *          
 * 
 * <p>Java class for pdbx_entity_src_gen_pureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_entity_src_gen_pureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_entity_src_gen_pure" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="conc_assay_method" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="conc_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="conc_device_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="protein_concentration">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="mg_per_ml" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="protein_oligomeric_state" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="protein_purity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="protein_yield" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="milligrams" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="storage_buffer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="storage_temperature" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_entity_src_gen_pureType", propOrder = {
    "pdbxEntitySrcGenPure"
})
public class PdbxEntitySrcGenPureType {

    @XmlElement(name = "pdbx_entity_src_gen_pure")
    protected List<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure> pdbxEntitySrcGenPure;

    /**
     * Gets the value of the pdbxEntitySrcGenPure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxEntitySrcGenPure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxEntitySrcGenPure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure }
     * 
     * 
     */
    public List<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure> getPdbxEntitySrcGenPure() {
        if (pdbxEntitySrcGenPure == null) {
            pdbxEntitySrcGenPure = new ArrayList<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure>();
        }
        return this.pdbxEntitySrcGenPure;
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
     *         &lt;element name="conc_assay_method" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="conc_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="conc_device_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="protein_concentration">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="mg_per_ml" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="protein_oligomeric_state" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="protein_purity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="protein_yield" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="milligrams" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="storage_buffer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="storage_temperature" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="step_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxEntitySrcGenPure {

        @XmlElement(name = "conc_assay_method", required = true)
        protected String concAssayMethod;
        @XmlElementRef(name = "conc_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> concDetails;
        @XmlElementRef(name = "conc_device_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> concDeviceId;
        @XmlElementRef(name = "date", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> date;
        @XmlElementRef(name = "product_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> productId;
        @XmlElement(name = "protein_concentration", required = true)
        protected PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinConcentration proteinConcentration;
        @XmlElementRef(name = "protein_oligomeric_state", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> proteinOligomericState;
        @XmlElementRef(name = "protein_purity", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> proteinPurity;
        @XmlElementRef(name = "protein_yield", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinYield> proteinYield;
        @XmlElement(name = "storage_buffer_id", required = true)
        protected String storageBufferId;
        @XmlElementRef(name = "storage_temperature", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.StorageTemperature> storageTemperature;
        @XmlElementRef(name = "summary", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> summary;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "step_id", required = true)
        protected BigInteger stepId;

        /**
         * Gets the value of the concAssayMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConcAssayMethod() {
            return concAssayMethod;
        }

        /**
         * Sets the value of the concAssayMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConcAssayMethod(String value) {
            this.concAssayMethod = value;
        }

        /**
         * Gets the value of the concDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConcDetails() {
            return concDetails;
        }

        /**
         * Sets the value of the concDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConcDetails(JAXBElement<String> value) {
            this.concDetails = value;
        }

        /**
         * Gets the value of the concDeviceId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConcDeviceId() {
            return concDeviceId;
        }

        /**
         * Sets the value of the concDeviceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConcDeviceId(JAXBElement<String> value) {
            this.concDeviceId = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDate(JAXBElement<String> value) {
            this.date = value;
        }

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setProductId(JAXBElement<String> value) {
            this.productId = value;
        }

        /**
         * Gets the value of the proteinConcentration property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinConcentration }
         *     
         */
        public PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinConcentration getProteinConcentration() {
            return proteinConcentration;
        }

        /**
         * Sets the value of the proteinConcentration property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinConcentration }
         *     
         */
        public void setProteinConcentration(PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinConcentration value) {
            this.proteinConcentration = value;
        }

        /**
         * Gets the value of the proteinOligomericState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getProteinOligomericState() {
            return proteinOligomericState;
        }

        /**
         * Sets the value of the proteinOligomericState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setProteinOligomericState(JAXBElement<BigInteger> value) {
            this.proteinOligomericState = value;
        }

        /**
         * Gets the value of the proteinPurity property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getProteinPurity() {
            return proteinPurity;
        }

        /**
         * Sets the value of the proteinPurity property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setProteinPurity(JAXBElement<BigDecimal> value) {
            this.proteinPurity = value;
        }

        /**
         * Gets the value of the proteinYield property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinYield }{@code >}
         *     
         */
        public JAXBElement<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinYield> getProteinYield() {
            return proteinYield;
        }

        /**
         * Sets the value of the proteinYield property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinYield }{@code >}
         *     
         */
        public void setProteinYield(JAXBElement<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.ProteinYield> value) {
            this.proteinYield = value;
        }

        /**
         * Gets the value of the storageBufferId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStorageBufferId() {
            return storageBufferId;
        }

        /**
         * Sets the value of the storageBufferId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStorageBufferId(String value) {
            this.storageBufferId = value;
        }

        /**
         * Gets the value of the storageTemperature property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.StorageTemperature }{@code >}
         *     
         */
        public JAXBElement<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.StorageTemperature> getStorageTemperature() {
            return storageTemperature;
        }

        /**
         * Sets the value of the storageTemperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.StorageTemperature }{@code >}
         *     
         */
        public void setStorageTemperature(JAXBElement<PdbxEntitySrcGenPureType.PdbxEntitySrcGenPure.StorageTemperature> value) {
            this.storageTemperature = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSummary(JAXBElement<String> value) {
            this.summary = value;
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

        /**
         * Gets the value of the stepId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStepId() {
            return stepId;
        }

        /**
         * Sets the value of the stepId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStepId(BigInteger value) {
            this.stepId = value;
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="mg_per_ml" />
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
        public static class ProteinConcentration {

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
                    return "mg_per_ml";
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="milligrams" />
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
        public static class ProteinYield {

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
                    return "milligrams";
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="celsius" />
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
        public static class StorageTemperature {

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
                    return "celsius";
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
