
package org.datacontract.schemas._2004._07.gskm_services_datatransfer;

import org.datacontract.schemas._2004._07.gskm_services.ArrayOfTenant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTenantsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTenantsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TenantList" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer}ArrayOfTenant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTenantsResponse", propOrder = {
    "tenantList"
})
public class GetTenantsResponse {

    @XmlElementRef(name = "TenantList", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTenant> tenantList;

    /**
     * Gets the value of the tenantList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTenant }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTenant> getTenantList() {
        return tenantList;
    }

    /**
     * Sets the value of the tenantList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTenant }{@code >}
     *     
     */
    public void setTenantList(JAXBElement<ArrayOfTenant> value) {
        this.tenantList = value;
    }

}
