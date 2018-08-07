
package org.datacontract.schemas._2004._07.gskm_services_datatransfer;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUsersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUsersRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TenantID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUsersRequest", propOrder = {
    "loginIDs",
    "tenantID"
})
public class GetUsersRequest {

    @XmlElementRef(name = "LoginIDs", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> loginIDs;
    @XmlElement(name = "TenantID")
    protected Integer tenantID;

    /**
     * Gets the value of the loginIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getLoginIDs() {
        return loginIDs;
    }

    /**
     * Sets the value of the loginIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setLoginIDs(JAXBElement<ArrayOfstring> value) {
        this.loginIDs = value;
    }

    /**
     * Gets the value of the tenantID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTenantID() {
        return tenantID;
    }

    /**
     * Sets the value of the tenantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTenantID(Integer value) {
        this.tenantID = value;
    }

}
