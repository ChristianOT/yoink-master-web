//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * Data items in the EXPTL_CRYSTAL_GROW category record details
 * about the conditions and methods used to grow the crystal.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:exptl_crystal_growCategory>
 *    <PDBx:exptl_crystal_grow crystal_id="1">
 *       <PDBx:apparatus>Linbro plates</PDBx:apparatus>
 *       <PDBx:atmosphere>room air</PDBx:atmosphere>
 *       <PDBx:method>hanging drop</PDBx:method>
 *       <PDBx:pH>4.7</PDBx:pH>
 *       <PDBx:temp>18.</PDBx:temp>
 *       <PDBx:time>approximately 2 days</PDBx:time>
 *    </PDBx:exptl_crystal_grow>
 * </PDBx:exptl_crystal_growCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for exptl_crystal_growType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exptl_crystal_growType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exptl_crystal_grow" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="apparatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="atmosphere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method_ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pH" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_pH_range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pressure" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pressure_esd" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kilopascals" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="seeding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="seeding_ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="temp" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="temp_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="temp_esd" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kelvins" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "exptl_crystal_growType", propOrder = {
    "exptlCrystalGrow"
})
public class ExptlCrystalGrowType {

    @XmlElement(name = "exptl_crystal_grow")
    protected List<ExptlCrystalGrowType.ExptlCrystalGrow> exptlCrystalGrow;

    /**
     * Gets the value of the exptlCrystalGrow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exptlCrystalGrow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExptlCrystalGrow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExptlCrystalGrowType.ExptlCrystalGrow }
     * 
     * 
     */
    public List<ExptlCrystalGrowType.ExptlCrystalGrow> getExptlCrystalGrow() {
        if (exptlCrystalGrow == null) {
            exptlCrystalGrow = new ArrayList<ExptlCrystalGrowType.ExptlCrystalGrow>();
        }
        return this.exptlCrystalGrow;
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
     *         &lt;element name="apparatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="atmosphere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method_ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pH" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_pH_range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pressure" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pressure_esd" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kilopascals" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="seeding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="seeding_ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="temp" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="temp_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="temp_esd" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kelvins" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="crystal_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ExptlCrystalGrow {

        @XmlElementRef(name = "apparatus", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> apparatus;
        @XmlElementRef(name = "atmosphere", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> atmosphere;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> method;
        @XmlElementRef(name = "method_ref", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> methodRef;
        @XmlElementRef(name = "pH", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ph;
        @XmlElementRef(name = "pdbx_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDetails;
        @XmlElementRef(name = "pdbx_pH_range", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPHRange;
        @XmlElementRef(name = "pressure", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pressure;
        @XmlElementRef(name = "pressure_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ExptlCrystalGrowType.ExptlCrystalGrow.PressureEsd> pressureEsd;
        @XmlElementRef(name = "seeding", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> seeding;
        @XmlElementRef(name = "seeding_ref", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> seedingRef;
        @XmlElementRef(name = "temp", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> temp;
        @XmlElementRef(name = "temp_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> tempDetails;
        @XmlElementRef(name = "temp_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ExptlCrystalGrowType.ExptlCrystalGrow.TempEsd> tempEsd;
        @XmlElementRef(name = "time", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> time;
        @XmlAttribute(name = "crystal_id", required = true)
        protected String crystalId;

        /**
         * Gets the value of the apparatus property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getApparatus() {
            return apparatus;
        }

        /**
         * Sets the value of the apparatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setApparatus(JAXBElement<String> value) {
            this.apparatus = value;
        }

        /**
         * Gets the value of the atmosphere property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAtmosphere() {
            return atmosphere;
        }

        /**
         * Sets the value of the atmosphere property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAtmosphere(JAXBElement<String> value) {
            this.atmosphere = value;
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
         * Gets the value of the methodRef property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethodRef() {
            return methodRef;
        }

        /**
         * Sets the value of the methodRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethodRef(JAXBElement<String> value) {
            this.methodRef = value;
        }

        /**
         * Gets the value of the ph property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPH() {
            return ph;
        }

        /**
         * Sets the value of the ph property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPH(JAXBElement<String> value) {
            this.ph = value;
        }

        /**
         * Gets the value of the pdbxDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDetails() {
            return pdbxDetails;
        }

        /**
         * Sets the value of the pdbxDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDetails(JAXBElement<String> value) {
            this.pdbxDetails = value;
        }

        /**
         * Gets the value of the pdbxPHRange property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPHRange() {
            return pdbxPHRange;
        }

        /**
         * Sets the value of the pdbxPHRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPHRange(JAXBElement<String> value) {
            this.pdbxPHRange = value;
        }

        /**
         * Gets the value of the pressure property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPressure() {
            return pressure;
        }

        /**
         * Sets the value of the pressure property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPressure(JAXBElement<String> value) {
            this.pressure = value;
        }

        /**
         * Gets the value of the pressureEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ExptlCrystalGrowType.ExptlCrystalGrow.PressureEsd }{@code >}
         *     
         */
        public JAXBElement<ExptlCrystalGrowType.ExptlCrystalGrow.PressureEsd> getPressureEsd() {
            return pressureEsd;
        }

        /**
         * Sets the value of the pressureEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ExptlCrystalGrowType.ExptlCrystalGrow.PressureEsd }{@code >}
         *     
         */
        public void setPressureEsd(JAXBElement<ExptlCrystalGrowType.ExptlCrystalGrow.PressureEsd> value) {
            this.pressureEsd = value;
        }

        /**
         * Gets the value of the seeding property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSeeding() {
            return seeding;
        }

        /**
         * Sets the value of the seeding property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSeeding(JAXBElement<String> value) {
            this.seeding = value;
        }

        /**
         * Gets the value of the seedingRef property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSeedingRef() {
            return seedingRef;
        }

        /**
         * Sets the value of the seedingRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSeedingRef(JAXBElement<String> value) {
            this.seedingRef = value;
        }

        /**
         * Gets the value of the temp property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTemp() {
            return temp;
        }

        /**
         * Sets the value of the temp property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTemp(JAXBElement<String> value) {
            this.temp = value;
        }

        /**
         * Gets the value of the tempDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTempDetails() {
            return tempDetails;
        }

        /**
         * Sets the value of the tempDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTempDetails(JAXBElement<String> value) {
            this.tempDetails = value;
        }

        /**
         * Gets the value of the tempEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ExptlCrystalGrowType.ExptlCrystalGrow.TempEsd }{@code >}
         *     
         */
        public JAXBElement<ExptlCrystalGrowType.ExptlCrystalGrow.TempEsd> getTempEsd() {
            return tempEsd;
        }

        /**
         * Sets the value of the tempEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ExptlCrystalGrowType.ExptlCrystalGrow.TempEsd }{@code >}
         *     
         */
        public void setTempEsd(JAXBElement<ExptlCrystalGrowType.ExptlCrystalGrow.TempEsd> value) {
            this.tempEsd = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTime(JAXBElement<String> value) {
            this.time = value;
        }

        /**
         * Gets the value of the crystalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrystalId() {
            return crystalId;
        }

        /**
         * Sets the value of the crystalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrystalId(String value) {
            this.crystalId = value;
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kilopascals" />
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
        public static class PressureEsd {

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
                    return "kilopascals";
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kelvins" />
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
        public static class TempEsd {

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
                    return "kelvins";
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
