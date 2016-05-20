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
 * Data items in the DATABASE_PDB_CAVEAT category record details
 * about features of the data block flagged as 'caveats' by the
 * Protein Data Bank (PDB).
 * 
 * These data items are included only for consistency with PDB
 * format files. They should appear in a data block only if that
 * data block was created by reformatting a PDB format file.
 * 
 *     Example 1 - hypothetical example.
 * <PDBx:database_PDB_caveatCategory>
 *    <PDBx:database_PDB_caveat id="1">
 *       <PDBx:text> THE CRYSTAL TRANSFORMATION IS IN ERROR BUT IS</PDBx:text>
 *    </PDBx:database_PDB_caveat>
 *    <PDBx:database_PDB_caveat id="2">
 *       <PDBx:text> UNCORRECTABLE AT THIS TIME</PDBx:text>
 *    </PDBx:database_PDB_caveat>
 * </PDBx:database_PDB_caveatCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for database_PDB_caveatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="database_PDB_caveatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="database_PDB_caveat" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "database_PDB_caveatType", propOrder = {
    "databasePDBCaveat"
})
public class DatabasePDBCaveatType {

    @XmlElement(name = "database_PDB_caveat")
    protected List<DatabasePDBCaveatType.DatabasePDBCaveat> databasePDBCaveat;

    /**
     * Gets the value of the databasePDBCaveat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databasePDBCaveat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabasePDBCaveat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabasePDBCaveatType.DatabasePDBCaveat }
     * 
     * 
     */
    public List<DatabasePDBCaveatType.DatabasePDBCaveat> getDatabasePDBCaveat() {
        if (databasePDBCaveat == null) {
            databasePDBCaveat = new ArrayList<DatabasePDBCaveatType.DatabasePDBCaveat>();
        }
        return this.databasePDBCaveat;
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
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class DatabasePDBCaveat {

        @XmlElementRef(name = "text", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> text;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setText(JAXBElement<String> value) {
            this.text = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

    }

}
