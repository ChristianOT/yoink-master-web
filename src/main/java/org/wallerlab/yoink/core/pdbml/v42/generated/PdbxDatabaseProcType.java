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
 * Internal records to track the data processing cycle.
 * <PDBx:pdbx_database_procCategory>
 *    <PDBx:pdbx_database_proc cycle_id="1" entry_id="BDL001">
 *       <PDBx:date_begin_cycle>1998-02-27</PDBx:date_begin_cycle>
 *       <PDBx:date_end_cycle>1998-02-27</PDBx:date_end_cycle>
 *    </PDBx:pdbx_database_proc>
 * </PDBx:pdbx_database_procCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_database_procType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_database_procType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_database_proc" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="date_begin_cycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="date_end_cycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="cycle_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_database_procType", propOrder = {
    "pdbxDatabaseProc"
})
public class PdbxDatabaseProcType {

    @XmlElement(name = "pdbx_database_proc")
    protected List<PdbxDatabaseProcType.PdbxDatabaseProc> pdbxDatabaseProc;

    /**
     * Gets the value of the pdbxDatabaseProc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxDatabaseProc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxDatabaseProc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxDatabaseProcType.PdbxDatabaseProc }
     * 
     * 
     */
    public List<PdbxDatabaseProcType.PdbxDatabaseProc> getPdbxDatabaseProc() {
        if (pdbxDatabaseProc == null) {
            pdbxDatabaseProc = new ArrayList<PdbxDatabaseProcType.PdbxDatabaseProc>();
        }
        return this.pdbxDatabaseProc;
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
     *         &lt;element name="date_begin_cycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="date_end_cycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="cycle_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxDatabaseProc {

        @XmlElement(name = "date_begin_cycle", required = true)
        protected String dateBeginCycle;
        @XmlElement(name = "date_end_cycle", required = true)
        protected String dateEndCycle;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlAttribute(name = "cycle_id", required = true)
        protected String cycleId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the dateBeginCycle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateBeginCycle() {
            return dateBeginCycle;
        }

        /**
         * Sets the value of the dateBeginCycle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateBeginCycle(String value) {
            this.dateBeginCycle = value;
        }

        /**
         * Gets the value of the dateEndCycle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateEndCycle() {
            return dateEndCycle;
        }

        /**
         * Sets the value of the dateEndCycle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateEndCycle(String value) {
            this.dateEndCycle = value;
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
         * Gets the value of the cycleId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCycleId() {
            return cycleId;
        }

        /**
         * Sets the value of the cycleId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCycleId(String value) {
            this.cycleId = value;
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
