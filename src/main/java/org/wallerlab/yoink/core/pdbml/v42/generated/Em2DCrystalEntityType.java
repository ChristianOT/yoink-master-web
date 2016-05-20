//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.core.pdbml.v42.generated;

import java.math.BigDecimal;
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
 * Data items in the EM_2D_CRYSTAL_ENTITY category record
 * the symmetry details of a 2D crystal assembly component.
 * 
 * 
 *          
 * 
 * <p>Java class for em_2d_crystal_entityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_2d_crystal_entityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_2d_crystal_entity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="angle_alpha" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                         &lt;maxInclusive value="180.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="angle_beta" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                         &lt;maxInclusive value="180.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="angle_gamma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                         &lt;maxInclusive value="180.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="length_a" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="length_b" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="length_c" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="space_group_name_H-M" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="P 1"/>
 *                         &lt;enumeration value="P 2 1"/>
 *                         &lt;enumeration value="P 1 2"/>
 *                         &lt;enumeration value="P 1 21"/>
 *                         &lt;enumeration value="C 1 2"/>
 *                         &lt;enumeration value="P 2 2 2"/>
 *                         &lt;enumeration value="P 2 2 21"/>
 *                         &lt;enumeration value="P 2 21 21"/>
 *                         &lt;enumeration value="C 2 2 2"/>
 *                         &lt;enumeration value="P 4"/>
 *                         &lt;enumeration value="P 4 2 2"/>
 *                         &lt;enumeration value="P 4 21 2"/>
 *                         &lt;enumeration value="P 3"/>
 *                         &lt;enumeration value="P 3 1 2"/>
 *                         &lt;enumeration value="P 3 2 1"/>
 *                         &lt;enumeration value="P 6"/>
 *                         &lt;enumeration value="P 6 2 2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_assembly_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "em_2d_crystal_entityType", propOrder = {
    "em2DCrystalEntity"
})
public class Em2DCrystalEntityType {

    @XmlElement(name = "em_2d_crystal_entity")
    protected List<Em2DCrystalEntityType.Em2DCrystalEntity> em2DCrystalEntity;

    /**
     * Gets the value of the em2DCrystalEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the em2DCrystalEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEm2DCrystalEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Em2DCrystalEntityType.Em2DCrystalEntity }
     * 
     * 
     */
    public List<Em2DCrystalEntityType.Em2DCrystalEntity> getEm2DCrystalEntity() {
        if (em2DCrystalEntity == null) {
            em2DCrystalEntity = new ArrayList<Em2DCrystalEntityType.Em2DCrystalEntity>();
        }
        return this.em2DCrystalEntity;
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
     *         &lt;element name="angle_alpha" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="angle_beta" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="angle_gamma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="length_a" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="length_b" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="length_c" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="space_group_name_H-M" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="P 1"/>
     *               &lt;enumeration value="P 2 1"/>
     *               &lt;enumeration value="P 1 2"/>
     *               &lt;enumeration value="P 1 21"/>
     *               &lt;enumeration value="C 1 2"/>
     *               &lt;enumeration value="P 2 2 2"/>
     *               &lt;enumeration value="P 2 2 21"/>
     *               &lt;enumeration value="P 2 21 21"/>
     *               &lt;enumeration value="C 2 2 2"/>
     *               &lt;enumeration value="P 4"/>
     *               &lt;enumeration value="P 4 2 2"/>
     *               &lt;enumeration value="P 4 21 2"/>
     *               &lt;enumeration value="P 3"/>
     *               &lt;enumeration value="P 3 1 2"/>
     *               &lt;enumeration value="P 3 2 1"/>
     *               &lt;enumeration value="P 6"/>
     *               &lt;enumeration value="P 6 2 2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="entity_assembly_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Em2DCrystalEntity {

        @XmlElementRef(name = "angle_alpha", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> angleAlpha;
        @XmlElementRef(name = "angle_beta", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> angleBeta;
        @XmlElementRef(name = "angle_gamma", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> angleGamma;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "length_a", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> lengthA;
        @XmlElementRef(name = "length_b", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> lengthB;
        @XmlElementRef(name = "length_c", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> lengthC;
        @XmlElementRef(name = "space_group_name_H-M", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> spaceGroupNameHM;
        @XmlAttribute(name = "entity_assembly_id", required = true)
        protected String entityAssemblyId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the angleAlpha property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getAngleAlpha() {
            return angleAlpha;
        }

        /**
         * Sets the value of the angleAlpha property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setAngleAlpha(JAXBElement<BigDecimal> value) {
            this.angleAlpha = value;
        }

        /**
         * Gets the value of the angleBeta property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getAngleBeta() {
            return angleBeta;
        }

        /**
         * Sets the value of the angleBeta property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setAngleBeta(JAXBElement<BigDecimal> value) {
            this.angleBeta = value;
        }

        /**
         * Gets the value of the angleGamma property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getAngleGamma() {
            return angleGamma;
        }

        /**
         * Sets the value of the angleGamma property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setAngleGamma(JAXBElement<BigDecimal> value) {
            this.angleGamma = value;
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
         * Gets the value of the lengthA property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getLengthA() {
            return lengthA;
        }

        /**
         * Sets the value of the lengthA property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setLengthA(JAXBElement<BigDecimal> value) {
            this.lengthA = value;
        }

        /**
         * Gets the value of the lengthB property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getLengthB() {
            return lengthB;
        }

        /**
         * Sets the value of the lengthB property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setLengthB(JAXBElement<BigDecimal> value) {
            this.lengthB = value;
        }

        /**
         * Gets the value of the lengthC property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getLengthC() {
            return lengthC;
        }

        /**
         * Sets the value of the lengthC property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setLengthC(JAXBElement<BigDecimal> value) {
            this.lengthC = value;
        }

        /**
         * Gets the value of the spaceGroupNameHM property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSpaceGroupNameHM() {
            return spaceGroupNameHM;
        }

        /**
         * Sets the value of the spaceGroupNameHM property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSpaceGroupNameHM(JAXBElement<String> value) {
            this.spaceGroupNameHM = value;
        }

        /**
         * Gets the value of the entityAssemblyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityAssemblyId() {
            return entityAssemblyId;
        }

        /**
         * Sets the value of the entityAssemblyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityAssemblyId(String value) {
            this.entityAssemblyId = value;
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
