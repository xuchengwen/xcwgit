
package com.genesyslab.gskm.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateUsersResult" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages}UpdateUsersResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateUsersResult"
})
@XmlRootElement(name = "UpdateUsersResponse")
public class UpdateUsersResponse {

    @XmlElementRef(name = "UpdateUsersResult", namespace = "http://genesyslab.com/GSKM/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse> updateUsersResult;

    /**
     * Gets the value of the updateUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse> getUpdateUsersResult() {
        return updateUsersResult;
    }

    /**
     * Sets the value of the updateUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse }{@code >}
     *     
     */
    public void setUpdateUsersResult(JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse> value) {
        this.updateUsersResult = value;
    }

}
