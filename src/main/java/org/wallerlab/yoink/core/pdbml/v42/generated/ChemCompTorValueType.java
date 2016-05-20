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
 * Data items in the CHEM_COMP_TOR_VALUE category record details
 * about the target values for the torsion angles enumerated in the
 * CHEM_COMP_TOR list. Target values may be specified as angles
 * in degrees, as a distance between the first and fourth atoms, or
 * both.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:chem_comp_tor_valueCategory>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_chi1">
 *       <PDBx:angle>-60.0</PDBx:angle>
 *       <PDBx:dist>2.88</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_chi1">
 *       <PDBx:angle>180.0</PDBx:angle>
 *       <PDBx:dist>3.72</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_chi1">
 *       <PDBx:angle>60.0</PDBx:angle>
 *       <PDBx:dist>2.88</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_chi2">
 *       <PDBx:angle>90.0</PDBx:angle>
 *       <PDBx:dist>3.34</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_chi2">
 *       <PDBx:angle>-90.0</PDBx:angle>
 *       <PDBx:dist>3.34</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_ring1">
 *       <PDBx:angle>180.0</PDBx:angle>
 *       <PDBx:dist>3.75</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_ring2">
 *       <PDBx:angle>180.0</PDBx:angle>
 *       <PDBx:dist>3.75</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_ring3">
 *       <PDBx:angle>0.0</PDBx:angle>
 *       <PDBx:dist>2.80</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_ring4">
 *       <PDBx:angle>0.0</PDBx:angle>
 *       <PDBx:dist>2.80</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 *    <PDBx:chem_comp_tor_value comp_id="phe" tor_id="phe_ring5">
 *       <PDBx:angle>0.0</PDBx:angle>
 *       <PDBx:dist>2.80</PDBx:dist>
 *    </PDBx:chem_comp_tor_value>
 * </PDBx:chem_comp_tor_valueCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chem_comp_tor_valueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_comp_tor_valueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_comp_tor_value" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="angle">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="-180.0"/>
 *                         &lt;maxInclusive value="180.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="angle_esd">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="-180.0"/>
 *                         &lt;maxInclusive value="180.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dist" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dist_esd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0.0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="tor_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_comp_tor_valueType", propOrder = {
    "chemCompTorValue"
})
public class ChemCompTorValueType {

    @XmlElement(name = "chem_comp_tor_value")
    protected List<ChemCompTorValueType.ChemCompTorValue> chemCompTorValue;

    /**
     * Gets the value of the chemCompTorValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemCompTorValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemCompTorValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemCompTorValueType.ChemCompTorValue }
     * 
     * 
     */
    public List<ChemCompTorValueType.ChemCompTorValue> getChemCompTorValue() {
        if (chemCompTorValue == null) {
            chemCompTorValue = new ArrayList<ChemCompTorValueType.ChemCompTorValue>();
        }
        return this.chemCompTorValue;
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
     *         &lt;element name="angle">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-180.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="angle_esd">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-180.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dist" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dist_esd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="tor_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemCompTorValue {

        @XmlElement(required = true)
        protected BigDecimal angle;
        @XmlElement(name = "angle_esd", required = true)
        protected BigDecimal angleEsd;
        @XmlElementRef(name = "dist", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> dist;
        @XmlElementRef(name = "dist_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> distEsd;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "tor_id", required = true)
        protected String torId;

        /**
         * Gets the value of the angle property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAngle() {
            return angle;
        }

        /**
         * Sets the value of the angle property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAngle(BigDecimal value) {
            this.angle = value;
        }

        /**
         * Gets the value of the angleEsd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAngleEsd() {
            return angleEsd;
        }

        /**
         * Sets the value of the angleEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAngleEsd(BigDecimal value) {
            this.angleEsd = value;
        }

        /**
         * Gets the value of the dist property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDist() {
            return dist;
        }

        /**
         * Sets the value of the dist property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDist(JAXBElement<BigDecimal> value) {
            this.dist = value;
        }

        /**
         * Gets the value of the distEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getDistEsd() {
            return distEsd;
        }

        /**
         * Sets the value of the distEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setDistEsd(JAXBElement<BigDecimal> value) {
            this.distEsd = value;
        }

        /**
         * Gets the value of the compId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId() {
            return compId;
        }

        /**
         * Sets the value of the compId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId(String value) {
            this.compId = value;
        }

        /**
         * Gets the value of the torId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTorId() {
            return torId;
        }

        /**
         * Sets the value of the torId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTorId(String value) {
            this.torId = value;
        }

    }

}
