
package org.datacontract.schemas._2004._07.gskm_services_datatransfer;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfRole;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfTenant;
import org.datacontract.schemas._2004._07.gskm_services.ArrayOfUser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.gskm_services_datatransfer package. 
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

    private final static QName _DeleteUsersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "DeleteUsersRequest");
    private final static QName _GetTenantsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "GetTenantsResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "GetUsersResponse");
    private final static QName _CreateUsersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "CreateUsersRequest");
    private final static QName _UpdateUsersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "UpdateUsersResponse");
    private final static QName _DeleteUsersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "DeleteUsersResponse");
    private final static QName _UpdateUsersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "UpdateUsersRequest");
    private final static QName _GetRolesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "GetRolesRequest");
    private final static QName _GetUsersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "GetUsersRequest");
    private final static QName _GetRolesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "GetRolesResponse");
    private final static QName _CreateUsersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "CreateUsersResponse");
    private final static QName _GetUsersRequestLoginIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "LoginIDs");
    private final static QName _CreateUsersResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "Message");
    private final static QName _CreateUsersRequestUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "Users");
    private final static QName _GetUsersResponseUserList_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "UserList");
    private final static QName _GetTenantsResponseTenantList_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "TenantList");
    private final static QName _GetRolesResponseRoleList_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", "RoleList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.gskm_services_datatransfer
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
     * Create an instance of {@link CreateUsersRequest }
     * 
     */
    public CreateUsersRequest createCreateUsersRequest() {
        return new CreateUsersRequest();
    }

    /**
     * Create an instance of {@link GetUsersRequest }
     * 
     */
    public GetUsersRequest createGetUsersRequest() {
        return new GetUsersRequest();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link UpdateUsersRequest }
     * 
     */
    public UpdateUsersRequest createUpdateUsersRequest() {
        return new UpdateUsersRequest();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link GetRolesRequest }
     * 
     */
    public GetRolesRequest createGetRolesRequest() {
        return new GetRolesRequest();
    }

    /**
     * Create an instance of {@link DeleteUsersRequest }
     * 
     */
    public DeleteUsersRequest createDeleteUsersRequest() {
        return new DeleteUsersRequest();
    }

    /**
     * Create an instance of {@link GetTenantsResponse }
     * 
     */
    public GetTenantsResponse createGetTenantsResponse() {
        return new GetTenantsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "DeleteUsersRequest")
    public JAXBElement<DeleteUsersRequest> createDeleteUsersRequest(DeleteUsersRequest value) {
        return new JAXBElement<DeleteUsersRequest>(_DeleteUsersRequest_QNAME, DeleteUsersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTenantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "GetTenantsResponse")
    public JAXBElement<GetTenantsResponse> createGetTenantsResponse(GetTenantsResponse value) {
        return new JAXBElement<GetTenantsResponse>(_GetTenantsResponse_QNAME, GetTenantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "GetUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "CreateUsersRequest")
    public JAXBElement<CreateUsersRequest> createCreateUsersRequest(CreateUsersRequest value) {
        return new JAXBElement<CreateUsersRequest>(_CreateUsersRequest_QNAME, CreateUsersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "UpdateUsersResponse")
    public JAXBElement<UpdateUsersResponse> createUpdateUsersResponse(UpdateUsersResponse value) {
        return new JAXBElement<UpdateUsersResponse>(_UpdateUsersResponse_QNAME, UpdateUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "DeleteUsersResponse")
    public JAXBElement<DeleteUsersResponse> createDeleteUsersResponse(DeleteUsersResponse value) {
        return new JAXBElement<DeleteUsersResponse>(_DeleteUsersResponse_QNAME, DeleteUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "UpdateUsersRequest")
    public JAXBElement<UpdateUsersRequest> createUpdateUsersRequest(UpdateUsersRequest value) {
        return new JAXBElement<UpdateUsersRequest>(_UpdateUsersRequest_QNAME, UpdateUsersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "GetRolesRequest")
    public JAXBElement<GetRolesRequest> createGetRolesRequest(GetRolesRequest value) {
        return new JAXBElement<GetRolesRequest>(_GetRolesRequest_QNAME, GetRolesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "GetUsersRequest")
    public JAXBElement<GetUsersRequest> createGetUsersRequest(GetUsersRequest value) {
        return new JAXBElement<GetUsersRequest>(_GetUsersRequest_QNAME, GetUsersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "GetRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "CreateUsersResponse")
    public JAXBElement<CreateUsersResponse> createCreateUsersResponse(CreateUsersResponse value) {
        return new JAXBElement<CreateUsersResponse>(_CreateUsersResponse_QNAME, CreateUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "LoginIDs", scope = GetUsersRequest.class)
    public JAXBElement<ArrayOfstring> createGetUsersRequestLoginIDs(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetUsersRequestLoginIDs_QNAME, ArrayOfstring.class, GetUsersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "Message", scope = CreateUsersResponse.class)
    public JAXBElement<String> createCreateUsersResponseMessage(String value) {
        return new JAXBElement<String>(_CreateUsersResponseMessage_QNAME, String.class, CreateUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "Message", scope = UpdateUsersResponse.class)
    public JAXBElement<String> createUpdateUsersResponseMessage(String value) {
        return new JAXBElement<String>(_CreateUsersResponseMessage_QNAME, String.class, UpdateUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "Users", scope = CreateUsersRequest.class)
    public JAXBElement<ArrayOfUser> createCreateUsersRequestUsers(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_CreateUsersRequestUsers_QNAME, ArrayOfUser.class, CreateUsersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "UserList", scope = GetUsersResponse.class)
    public JAXBElement<ArrayOfUser> createGetUsersResponseUserList(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_GetUsersResponseUserList_QNAME, ArrayOfUser.class, GetUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTenant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "TenantList", scope = GetTenantsResponse.class)
    public JAXBElement<ArrayOfTenant> createGetTenantsResponseTenantList(ArrayOfTenant value) {
        return new JAXBElement<ArrayOfTenant>(_GetTenantsResponseTenantList_QNAME, ArrayOfTenant.class, GetTenantsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "UserList", scope = UpdateUsersRequest.class)
    public JAXBElement<ArrayOfUser> createUpdateUsersRequestUserList(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_GetUsersResponseUserList_QNAME, ArrayOfUser.class, UpdateUsersRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "RoleList", scope = GetRolesResponse.class)
    public JAXBElement<ArrayOfRole> createGetRolesResponseRoleList(ArrayOfRole value) {
        return new JAXBElement<ArrayOfRole>(_GetRolesResponseRoleList_QNAME, ArrayOfRole.class, GetRolesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "Message", scope = DeleteUsersResponse.class)
    public JAXBElement<String> createDeleteUsersResponseMessage(String value) {
        return new JAXBElement<String>(_CreateUsersResponseMessage_QNAME, String.class, DeleteUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer.Messages", name = "UserList", scope = DeleteUsersRequest.class)
    public JAXBElement<ArrayOfUser> createDeleteUsersRequestUserList(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_GetUsersResponseUserList_QNAME, ArrayOfUser.class, DeleteUsersRequest.class, value);
    }

}
