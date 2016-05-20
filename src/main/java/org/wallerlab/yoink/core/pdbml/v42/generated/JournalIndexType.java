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
 * Data items in the JOURNAL_INDEX category are used to list terms
 * used to generate the journal indexes.
 * 
 * The creator of a data block will not normally specify these data
 * items.
 * 
 *     Example 1 - based on a paper by Zhu, Reynolds, Klein & Trudell
 *                 [Acta Cryst. (1994), C50, 2067-2069].
 * <PDBx:journal_indexCategory>
 *    <PDBx:journal_index term="C16H19NO4" type="O">
 *       <PDBx:subterm xsi:nil="true" />
 *    </PDBx:journal_index>
 *    <PDBx:journal_index term="alkaloids" type="S">
 *       <PDBx:subterm>(-)-norcocaine</PDBx:subterm>
 *    </PDBx:journal_index>
 *    <PDBx:journal_index term="(-)-norcocaine" type="S">
 *       <PDBx:subterm xsi:nil="true" />
 *    </PDBx:journal_index>
 *    <PDBx:journal_index term="  [2R,3S-(2\b,3\b)]-methyl 3-(benzoyloxy)-8-azabicyclo[3.2.1]octane-2-carboxylate" type="S">
 *       <PDBx:subterm xsi:nil="true" />
 *    </PDBx:journal_index>
 * </PDBx:journal_indexCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for journal_indexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journal_indexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journal_index" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="subterm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "journal_indexType", propOrder = {
    "journalIndex"
})
public class JournalIndexType {

    @XmlElement(name = "journal_index")
    protected List<JournalIndexType.JournalIndex> journalIndex;

    /**
     * Gets the value of the journalIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalIndexType.JournalIndex }
     * 
     * 
     */
    public List<JournalIndexType.JournalIndex> getJournalIndex() {
        if (journalIndex == null) {
            journalIndex = new ArrayList<JournalIndexType.JournalIndex>();
        }
        return this.journalIndex;
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
     *         &lt;element name="subterm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="term" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class JournalIndex {

        @XmlElementRef(name = "subterm", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> subterm;
        @XmlAttribute(name = "term", required = true)
        protected String term;
        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Gets the value of the subterm property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSubterm() {
            return subterm;
        }

        /**
         * Sets the value of the subterm property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSubterm(JAXBElement<String> value) {
            this.subterm = value;
        }

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerm(String value) {
            this.term = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}