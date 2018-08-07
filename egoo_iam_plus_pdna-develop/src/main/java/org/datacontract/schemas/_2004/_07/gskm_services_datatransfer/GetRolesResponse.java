
package org.datacontract.schemas._2004._07.gskm_services_datatransfer;

import org.datacontract.schemas._2004._07.gskm_services.ArrayOfRole;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRolesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRolesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleList" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer}ArrayOfRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRolesResponse", propOrder = {
    "roleList"
})
public class GetRolesResponse {

    @XmlElementRef(name = "RoleList", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRole> roleList;

    /**
     * Gets the value of the roleList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRole> getRoleList() {
        return roleList;
    }

    /**
     * Sets the value of the roleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}
     *     
     */
    public void setRoleList(JAXBElement<ArrayOfRole> value) {
        this.roleList = value;
    }

}
