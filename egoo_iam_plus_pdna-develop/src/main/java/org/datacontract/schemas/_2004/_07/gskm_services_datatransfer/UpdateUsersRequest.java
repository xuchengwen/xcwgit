
package org.datacontract.schemas._2004._07.gskm_services_datatransfer;

import org.datacontract.schemas._2004._07.gskm_services.ArrayOfUser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateUsersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateUsersRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserList" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer}ArrayOfUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUsersRequest", propOrder = {
    "userList"
})
public class UpdateUsersRequest {

    @XmlElementRef(name = "UserList", namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUser> userList;

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUser> getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     *     
     */
    public void setUserList(JAXBElement<ArrayOfUser> value) {
        this.userList = value;
    }

}
