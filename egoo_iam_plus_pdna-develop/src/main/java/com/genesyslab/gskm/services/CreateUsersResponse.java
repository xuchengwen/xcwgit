
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
 *         &lt;element name="CreateUsersResult" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages}CreateUsersResponse" minOccurs="0"/>
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
    "createUsersResult"
})
@XmlRootElement(name = "CreateUsersResponse")
public class CreateUsersResponse {

    @XmlElementRef(name = "CreateUsersResult", namespace = "http://genesyslab.com/GSKM/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse> createUsersResult;

    /**
     * Gets the value of the createUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse> getCreateUsersResult() {
        return createUsersResult;
    }

    /**
     * Sets the value of the createUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse }{@code >}
     *     
     */
    public void setCreateUsersResult(JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse> value) {
        this.createUsersResult = value;
    }

}
