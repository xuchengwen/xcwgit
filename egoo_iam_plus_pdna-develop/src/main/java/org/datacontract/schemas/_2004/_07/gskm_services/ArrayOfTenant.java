
package org.datacontract.schemas._2004._07.gskm_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfTenant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTenant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tenant" type="{http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer}Tenant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTenant", propOrder = {
    "tenant"
})
public class ArrayOfTenant {

    @XmlElement(name = "Tenant", nillable = true)
    protected List<Tenant> tenant;

    /**
     * Gets the value of the tenant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tenant }
     * 
     * 
     */
    public List<Tenant> getTenant() {
        if (tenant == null) {
            tenant = new ArrayList<Tenant>();
        }
        return this.tenant;
    }

}
