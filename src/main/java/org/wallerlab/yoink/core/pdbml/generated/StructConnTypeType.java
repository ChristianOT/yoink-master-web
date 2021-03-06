//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.yoink.core.pdbml.generated;

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
 * Data items in the STRUCT_CONN_TYPE category record details
 * about the criteria used to identify interactions between
 * portions of the structure.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_conn_typeCategory>
 *    <PDBx:struct_conn_type id="saltbr">
 *       <PDBx:criteria>negative to positive distance &gt; 2.5 \&#37;A, &lt; 3.2 \&#37;A</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conn_type>
 *    <PDBx:struct_conn_type id="hydrog">
 *       <PDBx:criteria>NO distance &gt; 2.5\&#37;A, &lt; 3.5\&#37;A, NOC angle &lt; 120 degrees</PDBx:criteria>
 *       <PDBx:reference xsi:nil="true" />
 *    </PDBx:struct_conn_type>
 * </PDBx:struct_conn_typeCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_conn_typeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_conn_typeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_conn_type" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="covale"/>
 *                       &lt;enumeration value="disulf"/>
 *                       &lt;enumeration value="hydrog"/>
 *                       &lt;enumeration value="metalc"/>
 *                       &lt;enumeration value="mismat"/>
 *                       &lt;enumeration value="saltbr"/>
 *                       &lt;enumeration value="modres"/>
 *                       &lt;enumeration value="covale_base"/>
 *                       &lt;enumeration value="covale_sugar"/>
 *                       &lt;enumeration value="covale_phosphate"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "struct_conn_typeType", propOrder = {
    "structConnType"
})
public class StructConnTypeType {

    @XmlElement(name = "struct_conn_type")
    protected List<StructConnTypeType.StructConnType> structConnType;

    /**
     * Gets the value of the structConnType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structConnType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructConnType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructConnTypeType.StructConnType }
     * 
     * 
     */
    public List<StructConnTypeType.StructConnType> getStructConnType() {
        if (structConnType == null) {
            structConnType = new ArrayList<StructConnTypeType.StructConnType>();
        }
        return this.structConnType;
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
     *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="covale"/>
     *             &lt;enumeration value="disulf"/>
     *             &lt;enumeration value="hydrog"/>
     *             &lt;enumeration value="metalc"/>
     *             &lt;enumeration value="mismat"/>
     *             &lt;enumeration value="saltbr"/>
     *             &lt;enumeration value="modres"/>
     *             &lt;enumeration value="covale_base"/>
     *             &lt;enumeration value="covale_sugar"/>
     *             &lt;enumeration value="covale_phosphate"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class StructConnType {

        @XmlElementRef(name = "criteria", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> criteria;
        @XmlElementRef(name = "reference", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reference;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the criteria property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCriteria() {
            return criteria;
        }

        /**
         * Sets the value of the criteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCriteria(JAXBElement<String> value) {
            this.criteria = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReference(JAXBElement<String> value) {
            this.reference = value;
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
