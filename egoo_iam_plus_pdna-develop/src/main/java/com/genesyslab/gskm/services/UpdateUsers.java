
package com.genesyslab.gskm.services;

import org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersRequest;

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
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages}UpdateUsersRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "UpdateUsers")
public class UpdateUsers {

    @XmlElementRef(name = "request", namespace = "http://genesyslab.com/GSKM/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateUsersRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateUsersRequest }{@code >}
     *     
     */
    public JAXBElement<UpdateUsersRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateUsersRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<UpdateUsersRequest> value) {
        this.request = value;
    }

}
