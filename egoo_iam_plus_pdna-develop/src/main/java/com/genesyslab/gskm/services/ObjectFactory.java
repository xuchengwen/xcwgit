
package com.genesyslab.gskm.services;

import org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersRequest;
import org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genesyslab.gskm.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRolesRequest_QNAME = new QName("http://genesyslab.com/GSKM/services/", "request");
    private final static QName _CreateUsersResponseCreateUsersResult_QNAME = new QName("http://genesyslab.com/GSKM/services/", "CreateUsersResult");
    private final static QName _GetTenantsResponseGetTenantsResult_QNAME = new QName("http://genesyslab.com/GSKM/services/", "GetTenantsResult");
    private final static QName _GetUsersResponseGetUsersResult_QNAME = new QName("http://genesyslab.com/GSKM/services/", "GetUsersResult");
    private final static QName _DeleteUsersResponseDeleteUsersResult_QNAME = new QName("http://genesyslab.com/GSKM/services/", "DeleteUsersResult");
    private final static QName _GetRolesResponseGetRolesResult_QNAME = new QName("http://genesyslab.com/GSKM/services/", "GetRolesResult");
    private final static QName _UpdateUsersResponseUpdateUsersResult_QNAME = new QName("http://genesyslab.com/GSKM/services/", "UpdateUsersResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genesyslab.gskm.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateUsersResponse }
     * 
     */
    public UpdateUsersResponse createUpdateUsersResponse() {
        return new UpdateUsersResponse();
    }

    /**
     * Create an instance of {@link DeleteUsersResponse }
     * 
     */
    public DeleteUsersResponse createDeleteUsersResponse() {
        return new DeleteUsersResponse();
    }

    /**
     * Create an instance of {@link CreateUsersResponse }
     * 
     */
    public CreateUsersResponse createCreateUsersResponse() {
        return new CreateUsersResponse();
    }

    /**
     * Create an instance of {@link CreateUsers }
     * 
     */
    public CreateUsers createCreateUsers() {
        return new CreateUsers();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link UpdateUsers }
     * 
     */
    public UpdateUsers createUpdateUsers() {
        return new UpdateUsers();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetTenants }
     * 
     */
    public GetTenants createGetTenants() {
        return new GetTenants();
    }

    /**
     * Create an instance of {@link DeleteUsers }
     * 
     */
    public DeleteUsers createDeleteUsers() {
        return new DeleteUsers();
    }

    /**
     * Create an instance of {@link GetTenantsResponse }
     * 
     */
    public GetTenantsResponse createGetTenantsResponse() {
        return new GetTenantsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "request", scope = GetRoles.class)
    public JAXBElement<GetRolesRequest> createGetRolesRequest(GetRolesRequest value) {
        return new JAXBElement<GetRolesRequest>(_GetRolesRequest_QNAME, GetRolesRequest.class, GetRoles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "CreateUsersResult", scope = CreateUsersResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse> createCreateUsersResponseCreateUsersResult(org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse>(_CreateUsersResponseCreateUsersResult_QNAME, org.datacontract.schemas._2004._07.gskm_services_datatransfer.CreateUsersResponse.class, CreateUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "request", scope = GetUsers.class)
    public JAXBElement<GetUsersRequest> createGetUsersRequest(GetUsersRequest value) {
        return new JAXBElement<GetUsersRequest>(_GetRolesRequest_QNAME, GetUsersRequest.class, GetUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetTenantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "GetTenantsResult", scope = GetTenantsResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetTenantsResponse> createGetTenantsResponseGetTenantsResult(org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetTenantsResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetTenantsResponse>(_GetTenantsResponseGetTenantsResult_QNAME, org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetTenantsResponse.class, GetTenantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "request", scope = UpdateUsers.class)
    public JAXBElement<UpdateUsersRequest> createUpdateUsersRequest(UpdateUsersRequest value) {
        return new JAXBElement<UpdateUsersRequest>(_GetRolesRequest_QNAME, UpdateUsersRequest.class, UpdateUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "GetUsersResult", scope = GetUsersResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersResponse> createGetUsersResponseGetUsersResult(org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersResponse>(_GetUsersResponseGetUsersResult_QNAME, org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetUsersResponse.class, GetUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "DeleteUsersResult", scope = DeleteUsersResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersResponse> createDeleteUsersResponseDeleteUsersResult(org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersResponse>(_DeleteUsersResponseDeleteUsersResult_QNAME, org.datacontract.schemas._2004._07.gskm_services_datatransfer.DeleteUsersResponse.class, DeleteUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "request", scope = CreateUsers.class)
    public JAXBElement<CreateUsersRequest> createCreateUsersRequest(CreateUsersRequest value) {
        return new JAXBElement<CreateUsersRequest>(_GetRolesRequest_QNAME, CreateUsersRequest.class, CreateUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "GetRolesResult", scope = GetRolesResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse> createGetRolesResponseGetRolesResult(org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse>(_GetRolesResponseGetRolesResult_QNAME, org.datacontract.schemas._2004._07.gskm_services_datatransfer.GetRolesResponse.class, GetRolesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "UpdateUsersResult", scope = UpdateUsersResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse> createUpdateUsersResponseUpdateUsersResult(org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse>(_UpdateUsersResponseUpdateUsersResult_QNAME, org.datacontract.schemas._2004._07.gskm_services_datatransfer.UpdateUsersResponse.class, UpdateUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genesyslab.com/GSKM/services/", name = "request", scope = DeleteUsers.class)
    public JAXBElement<DeleteUsersRequest> createDeleteUsersRequest(DeleteUsersRequest value) {
        return new JAXBElement<DeleteUsersRequest>(_GetRolesRequest_QNAME, DeleteUsersRequest.class, DeleteUsers.class, value);
    }

}
