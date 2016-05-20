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
 * Data items in the ATOM_SITES_ALT category record details
 * about the structural ensembles that should be generated from
 * atom sites or groups of atom sites that are modelled in
 * alternative conformations in this data block.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:atom_sites_altCategory>
 *    <PDBx:atom_sites_alt id="1">
 *       <PDBx:details> Atom sites with the alternative ID set to 1 have been
 * modeled in alternative conformations with respect to atom
 * sites marked with alternative ID 2. The conformations of
 * amino-acid side chains and solvent atoms with alternative
 * ID set to 1 correlate with the conformation of the
 * inhibitor marked with alternative ID 1. They have been
 * given an occupancy of 0.58 to match the occupancy assigned
 * to the inhibitor.</PDBx:details>
 *    </PDBx:atom_sites_alt>
 *    <PDBx:atom_sites_alt id="2">
 *       <PDBx:details> Atom sites with the alternative ID set to 2 have been
 * modeled in alternative conformations with respect to atom
 * sites marked with alternative ID 1. The conformations of
 * amino-acid side chains and solvent atoms with alternative
 * ID set to 2 correlate with the conformation of the
 * inhibitor marked with alternative ID 2. They have been
 * given an occupancy of 0.42 to match the occupancy assigned
 * to the inhibitor.</PDBx:details>
 *    </PDBx:atom_sites_alt>
 *    <PDBx:atom_sites_alt id="3">
 *       <PDBx:details> Atom sites with the alternative ID set to 3 have been
 * modeled in alternative conformations with respect to
 * atoms marked with alternative ID 4. The conformations of
 * amino-acid side chains and solvent atoms with alternative
 * ID set to 3 do not correlate with the conformation of the
 * inhibitor. These atom sites have arbitrarily been given
 * an occupancy of 0.50.</PDBx:details>
 *    </PDBx:atom_sites_alt>
 *    <PDBx:atom_sites_alt id="4">
 *       <PDBx:details> Atom sites with the alternative ID set to 4 have been
 * modeled in alternative conformations with respect to
 * atoms marked with alternative ID 3. The conformations of
 * amino-acid side chains and solvent atoms with alternative
 * ID set to 4 do not correlate with the conformation of the
 * inhibitor. These atom sites have arbitrarily been given
 * an occupancy of 0.50.</PDBx:details>
 *    </PDBx:atom_sites_alt>
 * </PDBx:atom_sites_altCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for atom_sites_altType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atom_sites_altType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atom_sites_alt" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "atom_sites_altType", propOrder = {
    "atomSitesAlt"
})
public class AtomSitesAltType {

    @XmlElement(name = "atom_sites_alt")
    protected List<AtomSitesAltType.AtomSitesAlt> atomSitesAlt;

    /**
     * Gets the value of the atomSitesAlt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomSitesAlt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomSitesAlt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomSitesAltType.AtomSitesAlt }
     * 
     * 
     */
    public List<AtomSitesAltType.AtomSitesAlt> getAtomSitesAlt() {
        if (atomSitesAlt == null) {
            atomSitesAlt = new ArrayList<AtomSitesAltType.AtomSitesAlt>();
        }
        return this.atomSitesAlt;
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
    public static class AtomSitesAlt {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
