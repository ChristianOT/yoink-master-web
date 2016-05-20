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
 * Data items in the PDBX_STRUCT_OPER_LIST category describe 
 * Cartesian rotation and translation operations required to 
 * generate or transform the coordinates deposited with this entry.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_struct_oper_listCategory>
 *    <PDBx:pdbx_struct_oper_list id="2">
 *       <PDBx:matrix11>0.247</PDBx:matrix11>
 *       <PDBx:matrix12>0.935</PDBx:matrix12>
 *       <PDBx:matrix13>0.256</PDBx:matrix13>
 *       <PDBx:matrix21>0.929</PDBx:matrix21>
 *       <PDBx:matrix22>0.153</PDBx:matrix22>
 *       <PDBx:matrix23>0.337</PDBx:matrix23>
 *       <PDBx:matrix31>0.276</PDBx:matrix31>
 *       <PDBx:matrix32>0.321</PDBx:matrix32>
 *       <PDBx:matrix33>-0.906</PDBx:matrix33>
 *       <PDBx:type>point symmetry operation</PDBx:type>
 *       <PDBx:vector1>-8.253</PDBx:vector1>
 *       <PDBx:vector2>-11.743</PDBx:vector2>
 *       <PDBx:vector3>-1.782</PDBx:vector3>
 *    </PDBx:pdbx_struct_oper_list>
 * </PDBx:pdbx_struct_oper_listCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_struct_oper_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_struct_oper_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_struct_oper_list" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="matrix11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix21" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix22" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix23" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix31" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix32" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="matrix33" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="symmetry_operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="identity operation"/>
 *                         &lt;enumeration value="point symmetry operation"/>
 *                         &lt;enumeration value="helical symmetry operation"/>
 *                         &lt;enumeration value="crystal symmetry operation"/>
 *                         &lt;enumeration value="3D crystal symmetry operation"/>
 *                         &lt;enumeration value="2D crystal symmetry operation"/>
 *                         &lt;enumeration value="transform to point frame"/>
 *                         &lt;enumeration value="transform to helical frame"/>
 *                         &lt;enumeration value="transform to crystal frame"/>
 *                         &lt;enumeration value="transform to 2D crystal frame"/>
 *                         &lt;enumeration value="transform to 3D crystal frame"/>
 *                         &lt;enumeration value="build point asymmetric unit"/>
 *                         &lt;enumeration value="build helical asymmetric unit"/>
 *                         &lt;enumeration value="build 2D crystal asymmetric unit"/>
 *                         &lt;enumeration value="build 3D crystal asymmetric unit"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vector1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="vector2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="vector3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "pdbx_struct_oper_listType", propOrder = {
    "pdbxStructOperList"
})
public class PdbxStructOperListType {

    @XmlElement(name = "pdbx_struct_oper_list")
    protected List<PdbxStructOperListType.PdbxStructOperList> pdbxStructOperList;

    /**
     * Gets the value of the pdbxStructOperList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxStructOperList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxStructOperList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxStructOperListType.PdbxStructOperList }
     * 
     * 
     */
    public List<PdbxStructOperListType.PdbxStructOperList> getPdbxStructOperList() {
        if (pdbxStructOperList == null) {
            pdbxStructOperList = new ArrayList<PdbxStructOperListType.PdbxStructOperList>();
        }
        return this.pdbxStructOperList;
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
     *         &lt;element name="matrix11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix21" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix22" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix23" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix31" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix32" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="matrix33" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="symmetry_operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="identity operation"/>
     *               &lt;enumeration value="point symmetry operation"/>
     *               &lt;enumeration value="helical symmetry operation"/>
     *               &lt;enumeration value="crystal symmetry operation"/>
     *               &lt;enumeration value="3D crystal symmetry operation"/>
     *               &lt;enumeration value="2D crystal symmetry operation"/>
     *               &lt;enumeration value="transform to point frame"/>
     *               &lt;enumeration value="transform to helical frame"/>
     *               &lt;enumeration value="transform to crystal frame"/>
     *               &lt;enumeration value="transform to 2D crystal frame"/>
     *               &lt;enumeration value="transform to 3D crystal frame"/>
     *               &lt;enumeration value="build point asymmetric unit"/>
     *               &lt;enumeration value="build helical asymmetric unit"/>
     *               &lt;enumeration value="build 2D crystal asymmetric unit"/>
     *               &lt;enumeration value="build 3D crystal asymmetric unit"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vector1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="vector2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="vector3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    public static class PdbxStructOperList {

        @XmlElementRef(name = "matrix11", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix11;
        @XmlElementRef(name = "matrix12", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix12;
        @XmlElementRef(name = "matrix13", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix13;
        @XmlElementRef(name = "matrix21", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix21;
        @XmlElementRef(name = "matrix22", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix22;
        @XmlElementRef(name = "matrix23", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix23;
        @XmlElementRef(name = "matrix31", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix31;
        @XmlElementRef(name = "matrix32", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix32;
        @XmlElementRef(name = "matrix33", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> matrix33;
        @XmlElementRef(name = "name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> name;
        @XmlElementRef(name = "symmetry_operation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> symmetryOperation;
        @XmlElement(required = true)
        protected String type;
        @XmlElementRef(name = "vector1", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> vector1;
        @XmlElementRef(name = "vector2", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> vector2;
        @XmlElementRef(name = "vector3", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> vector3;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the matrix11 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix11() {
            return matrix11;
        }

        /**
         * Sets the value of the matrix11 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix11(JAXBElement<BigDecimal> value) {
            this.matrix11 = value;
        }

        /**
         * Gets the value of the matrix12 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix12() {
            return matrix12;
        }

        /**
         * Sets the value of the matrix12 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix12(JAXBElement<BigDecimal> value) {
            this.matrix12 = value;
        }

        /**
         * Gets the value of the matrix13 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix13() {
            return matrix13;
        }

        /**
         * Sets the value of the matrix13 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix13(JAXBElement<BigDecimal> value) {
            this.matrix13 = value;
        }

        /**
         * Gets the value of the matrix21 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix21() {
            return matrix21;
        }

        /**
         * Sets the value of the matrix21 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix21(JAXBElement<BigDecimal> value) {
            this.matrix21 = value;
        }

        /**
         * Gets the value of the matrix22 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix22() {
            return matrix22;
        }

        /**
         * Sets the value of the matrix22 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix22(JAXBElement<BigDecimal> value) {
            this.matrix22 = value;
        }

        /**
         * Gets the value of the matrix23 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix23() {
            return matrix23;
        }

        /**
         * Sets the value of the matrix23 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix23(JAXBElement<BigDecimal> value) {
            this.matrix23 = value;
        }

        /**
         * Gets the value of the matrix31 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix31() {
            return matrix31;
        }

        /**
         * Sets the value of the matrix31 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix31(JAXBElement<BigDecimal> value) {
            this.matrix31 = value;
        }

        /**
         * Gets the value of the matrix32 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix32() {
            return matrix32;
        }

        /**
         * Sets the value of the matrix32 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix32(JAXBElement<BigDecimal> value) {
            this.matrix32 = value;
        }

        /**
         * Gets the value of the matrix33 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getMatrix33() {
            return matrix33;
        }

        /**
         * Sets the value of the matrix33 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setMatrix33(JAXBElement<BigDecimal> value) {
            this.matrix33 = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setName(JAXBElement<String> value) {
            this.name = value;
        }

        /**
         * Gets the value of the symmetryOperation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSymmetryOperation() {
            return symmetryOperation;
        }

        /**
         * Sets the value of the symmetryOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSymmetryOperation(JAXBElement<String> value) {
            this.symmetryOperation = value;
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

        /**
         * Gets the value of the vector1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getVector1() {
            return vector1;
        }

        /**
         * Sets the value of the vector1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setVector1(JAXBElement<BigDecimal> value) {
            this.vector1 = value;
        }

        /**
         * Gets the value of the vector2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getVector2() {
            return vector2;
        }

        /**
         * Sets the value of the vector2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setVector2(JAXBElement<BigDecimal> value) {
            this.vector2 = value;
        }

        /**
         * Gets the value of the vector3 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getVector3() {
            return vector3;
        }

        /**
         * Sets the value of the vector3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setVector3(JAXBElement<BigDecimal> value) {
            this.vector3 = value;
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
