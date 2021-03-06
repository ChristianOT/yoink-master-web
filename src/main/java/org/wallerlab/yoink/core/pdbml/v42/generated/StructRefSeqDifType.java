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
 * Data items in the STRUCT_REF_SEQ_DIF category provide a
 * mechanism for indicating and annotating point differences
 * between the sequence of the entity or biological unit described
 * in the data block and the sequence of the referenced database
 * entry.
 * 
 *     Example 1 - based on laboratory records for CAP-DNA complex.
 * <PDBx:struct_ref_seq_difCategory>
 *    <PDBx:struct_ref_seq_dif pdbx_ordinal="1">
 *       <PDBx:align_id>algn2</PDBx:align_id>
 *       <PDBx:db_mon_id>GLU</PDBx:db_mon_id>
 *       <PDBx:details> A point mutation was introduced in the CAP at position 181
 * substituting PHE for GLU.</PDBx:details>
 *       <PDBx:mon_id>PHE</PDBx:mon_id>
 *       <PDBx:seq_num>181</PDBx:seq_num>
 *    </PDBx:struct_ref_seq_dif>
 * </PDBx:struct_ref_seq_difCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_ref_seq_difType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_ref_seq_difType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_ref_seq_dif" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="align_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="db_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_auth_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_pdb_id_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_pdb_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_db_accession_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_db_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="seq_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "struct_ref_seq_difType", propOrder = {
    "structRefSeqDif"
})
public class StructRefSeqDifType {

    @XmlElement(name = "struct_ref_seq_dif")
    protected List<StructRefSeqDifType.StructRefSeqDif> structRefSeqDif;

    /**
     * Gets the value of the structRefSeqDif property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structRefSeqDif property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructRefSeqDif().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructRefSeqDifType.StructRefSeqDif }
     * 
     * 
     */
    public List<StructRefSeqDifType.StructRefSeqDif> getStructRefSeqDif() {
        if (structRefSeqDif == null) {
            structRefSeqDif = new ArrayList<StructRefSeqDifType.StructRefSeqDif>();
        }
        return this.structRefSeqDif;
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
     *         &lt;element name="align_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="db_mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_auth_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_pdb_id_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_pdb_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_pdb_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_db_accession_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_db_seq_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="seq_num" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    public static class StructRefSeqDif {

        @XmlElement(name = "align_id", required = true)
        protected String alignId;
        @XmlElementRef(name = "db_mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dbMonId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "mon_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> monId;
        @XmlElementRef(name = "pdbx_auth_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAuthSeqNum;
        @XmlElementRef(name = "pdbx_pdb_id_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPdbIdCode;
        @XmlElementRef(name = "pdbx_pdb_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPdbInsCode;
        @XmlElementRef(name = "pdbx_pdb_strand_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPdbStrandId;
        @XmlElementRef(name = "pdbx_seq_db_accession_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqDbAccessionCode;
        @XmlElementRef(name = "pdbx_seq_db_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqDbName;
        @XmlElementRef(name = "pdbx_seq_db_seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqDbSeqNum;
        @XmlElementRef(name = "seq_num", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> seqNum;
        @XmlAttribute(name = "pdbx_ordinal", required = true)
        protected BigInteger pdbxOrdinal;

        /**
         * Gets the value of the alignId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlignId() {
            return alignId;
        }

        /**
         * Sets the value of the alignId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlignId(String value) {
            this.alignId = value;
        }

        /**
         * Gets the value of the dbMonId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDbMonId() {
            return dbMonId;
        }

        /**
         * Sets the value of the dbMonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDbMonId(JAXBElement<String> value) {
            this.dbMonId = value;
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
         * Gets the value of the monId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMonId() {
            return monId;
        }

        /**
         * Sets the value of the monId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMonId(JAXBElement<String> value) {
            this.monId = value;
        }

        /**
         * Gets the value of the pdbxAuthSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAuthSeqNum() {
            return pdbxAuthSeqNum;
        }

        /**
         * Sets the value of the pdbxAuthSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAuthSeqNum(JAXBElement<String> value) {
            this.pdbxAuthSeqNum = value;
        }

        /**
         * Gets the value of the pdbxPdbIdCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPdbIdCode() {
            return pdbxPdbIdCode;
        }

        /**
         * Sets the value of the pdbxPdbIdCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPdbIdCode(JAXBElement<String> value) {
            this.pdbxPdbIdCode = value;
        }

        /**
         * Gets the value of the pdbxPdbInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPdbInsCode() {
            return pdbxPdbInsCode;
        }

        /**
         * Sets the value of the pdbxPdbInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPdbInsCode(JAXBElement<String> value) {
            this.pdbxPdbInsCode = value;
        }

        /**
         * Gets the value of the pdbxPdbStrandId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPdbStrandId() {
            return pdbxPdbStrandId;
        }

        /**
         * Sets the value of the pdbxPdbStrandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPdbStrandId(JAXBElement<String> value) {
            this.pdbxPdbStrandId = value;
        }

        /**
         * Gets the value of the pdbxSeqDbAccessionCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqDbAccessionCode() {
            return pdbxSeqDbAccessionCode;
        }

        /**
         * Sets the value of the pdbxSeqDbAccessionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqDbAccessionCode(JAXBElement<String> value) {
            this.pdbxSeqDbAccessionCode = value;
        }

        /**
         * Gets the value of the pdbxSeqDbName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqDbName() {
            return pdbxSeqDbName;
        }

        /**
         * Sets the value of the pdbxSeqDbName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqDbName(JAXBElement<String> value) {
            this.pdbxSeqDbName = value;
        }

        /**
         * Gets the value of the pdbxSeqDbSeqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqDbSeqNum() {
            return pdbxSeqDbSeqNum;
        }

        /**
         * Sets the value of the pdbxSeqDbSeqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqDbSeqNum(JAXBElement<String> value) {
            this.pdbxSeqDbSeqNum = value;
        }

        /**
         * Gets the value of the seqNum property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getSeqNum() {
            return seqNum;
        }

        /**
         * Sets the value of the seqNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setSeqNum(JAXBElement<BigInteger> value) {
            this.seqNum = value;
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
