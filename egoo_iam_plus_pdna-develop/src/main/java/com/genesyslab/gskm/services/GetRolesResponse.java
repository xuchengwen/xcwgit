
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
 *         &lt;element name="GetRolesResult" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages}GetRolesResponse" minOccurs="0"/>
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
    "getRolesResult"
})
@XmlRootElement(name = "GetRolesResponse")
public class GetRolesResponse {

    @XmlElementRef(name = "GetRolesResult", namespace = "http://genesyslab.com/GSKM/services/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse> getRolesResult;

    /**
     * Gets the value of the getRolesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse> getGetRolesResult() {
        return getRolesResult;
    }

    /**
     * Sets the value of the getRolesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse }{@code >}
     *     
     */
    public void setGetRolesResult(JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse> value) {
        this.getRolesResult = value;
    }

}
