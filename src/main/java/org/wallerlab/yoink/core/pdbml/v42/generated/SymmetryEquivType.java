//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.yoink.core.pdbml.v42.generated;

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
 * Data items in the SYMMETRY_EQUIV category list the
 * symmetry-equivalent positions for the space group.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:symmetry_equivCategory>
 *    <PDBx:symmetry_equiv id="1">
 *       <PDBx:pos_as_xyz>+x,+y,+z</PDBx:pos_as_xyz>
 *    </PDBx:symmetry_equiv>
 *    <PDBx:symmetry_equiv id="2">
 *       <PDBx:pos_as_xyz>-x,-y,z</PDBx:pos_as_xyz>
 *    </PDBx:symmetry_equiv>
 *    <PDBx:symmetry_equiv id="3">
 *       <PDBx:pos_as_xyz>1/2+x,1/2-y,-z</PDBx:pos_as_xyz>
 *    </PDBx:symmetry_equiv>
 *    <PDBx:symmetry_equiv id="4">
 *       <PDBx:pos_as_xyz>1/2-x,1/2+y,-z</PDBx:pos_as_xyz>
 *    </PDBx:symmetry_equiv>
 * </PDBx:symmetry_equivCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for symmetry_equivType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="symmetry_equivType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="symmetry_equiv" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="pos_as_xyz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "symmetry_equivType", propOrder = {
    "symmetryEquiv"
})
public class SymmetryEquivType {

    @XmlElement(name = "symmetry_equiv")
    protected List<SymmetryEquivType.SymmetryEquiv> symmetryEquiv;

    /**
     * Gets the value of the symmetryEquiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symmetryEquiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymmetryEquiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymmetryEquivType.SymmetryEquiv }
     * 
     * 
     */
    public List<SymmetryEquivType.SymmetryEquiv> getSymmetryEquiv() {
        if (symmetryEquiv == null) {
            symmetryEquiv = new ArrayList<SymmetryEquivType.SymmetryEquiv>();
        }
        return this.symmetryEquiv;
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
     *         &lt;element name="pos_as_xyz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SymmetryEquiv {

        @XmlElementRef(name = "pos_as_xyz", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> posAsXyz;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the posAsXyz property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPosAsXyz() {
            return posAsXyz;
        }

        /**
         * Sets the value of the posAsXyz property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPosAsXyz(JAXBElement<String> value) {
            this.posAsXyz = value;
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
