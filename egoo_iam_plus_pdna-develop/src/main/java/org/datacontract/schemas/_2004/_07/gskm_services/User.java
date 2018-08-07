
package org.datacontract.schemas._2004._07.gskm_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EditingUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Roles" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer}ArrayOfRole" minOccurs="0"/>
 *         &lt;element name="TenantId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WfmUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "editingUserID",
    "fields",
    "firstName",
    "id",
    "isArchived",
    "lastName",
    "loginName",
    "managerID",
    "roles",
    "tenantId",
    "userPassword",
    "wfmUserId"
})
public class User {

    @XmlElement(name = "EditingUserID")
    protected Integer editingUserID;
    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfField> fields;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "IsArchived")
    protected Boolean isArchived;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LoginName", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginName;
    @XmlElement(name = "ManagerID")
    protected Integer managerID;
    @XmlElementRef(name = "Roles", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRole> roles;
    @XmlElement(name = "TenantId")
    protected Integer tenantId;
    @XmlElementRef(name = "UserPassword", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userPassword;
    @XmlElementRef(name = "WfmUserId", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wfmUserId;

    /**
     * Gets the value of the editingUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditingUserID() {
        return editingUserID;
    }

    /**
     * Sets the value of the editingUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditingUserID(Integer value) {
        this.editingUserID = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfField> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ArrayOfField> value) {
        this.fields = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginName(JAXBElement<String> value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the managerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManagerID() {
        return managerID;
    }

    /**
     * Sets the value of the managerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManagerID(Integer value) {
        this.managerID = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRole> getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}
     *     
     */
    public void setRoles(JAXBElement<ArrayOfRole> value) {
        this.roles = value;
    }

    /**
     * Gets the value of the tenantId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTenantId(Integer value) {
        this.tenantId = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserPassword(JAXBElement<String> value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the wfmUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWfmUserId() {
        return wfmUserId;
    }

    /**
     * Sets the value of the wfmUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWfmUserId(JAXBElement<String> value) {
        this.wfmUserId = value;
    }

}
