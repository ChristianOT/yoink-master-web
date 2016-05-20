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
 * Data items in the AUDIT_AUTHOR category record details about
 * the author(s) of the data block.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:audit_authorCategory>
 *    <PDBx:audit_author pdbx_ordinal="1">
 *       <PDBx:address> Department of Biophysical Chemistry
 * Merck Research Laboratories
 * P. O. Box 2000, Ry80M203
 * Rahway, New Jersey  07065
 * USA</PDBx:address>
 *       <PDBx:name>Fitzgerald, Paula M.D.</PDBx:name>
 *    </PDBx:audit_author>
 *    <PDBx:audit_author pdbx_ordinal="2">
 *       <PDBx:address> Department of Biophysical Chemistry
 * Merck Research Laboratories
 * P. O. Box 2000, Ry80M203
 * Rahway, New Jersey  07065
 * USA</PDBx:address>
 *       <PDBx:name>McKeever, Brian M.</PDBx:name>
 *    </PDBx:audit_author>
 *    <PDBx:audit_author pdbx_ordinal="3">
 *       <PDBx:address> Department of Biophysical Chemistry
 * Merck Research Laboratories
 * P. O. Box 2000, Ry80M203
 * Rahway, New Jersey  07065
 * USA</PDBx:address>
 *       <PDBx:name>Van Middlesworth, J.F.</PDBx:name>
 *    </PDBx:audit_author>
 *    <PDBx:audit_author pdbx_ordinal="4">
 *       <PDBx:address> Department of Biophysical Chemistry
 * Merck Research Laboratories
 * P. O. Box 2000, Ry80M203
 * Rahway, New Jersey  07065
 * USA</PDBx:address>
 *       <PDBx:name>Springer, James P.</PDBx:name>
 *    </PDBx:audit_author>
 * </PDBx:audit_authorCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for audit_authorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audit_authorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit_author" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="pdbx_ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "audit_authorType", propOrder = {
    "auditAuthor"
})
public class AuditAuthorType {

    @XmlElement(name = "audit_author")
    protected List<AuditAuthorType.AuditAuthor> auditAuthor;

    /**
     * Gets the value of the auditAuthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditAuthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditAuthorType.AuditAuthor }
     * 
     * 
     */
    public List<AuditAuthorType.AuditAuthor> getAuditAuthor() {
        if (auditAuthor == null) {
            auditAuthor = new ArrayList<AuditAuthorType.AuditAuthor>();
        }
        return this.auditAuthor;
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
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="pdbx_ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class AuditAuthor {

        @XmlElementRef(name = "address", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> address;
        @XmlElement(required = true)
        protected String name;
        @XmlAttribute(name = "pdbx_ordinal", required = true)
        protected BigInteger pdbxOrdinal;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAddress(JAXBElement<String> value) {
            this.address = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the pdbxOrdinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPdbxOrdinal() {
            return pdbxOrdinal;
        }

        /**
         * Sets the value of the pdbxOrdinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPdbxOrdinal(BigInteger value) {
            this.pdbxOrdinal = value;
        }

    }

}
