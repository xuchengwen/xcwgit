
package org.datacontract.schemas._2004._07.gskm_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.gskm_services package. 
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

    private final static QName _ArrayOfRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "ArrayOfRole");
    private final static QName _ArrayOfUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "ArrayOfUser");
    private final static QName _Role_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "Role");
    private final static QName _User_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "User");
    private final static QName _Field_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "FieldPojo");
    private final static QName _ArrayOfField_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "ArrayOfField");
    private final static QName _ArrayOfTenant_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "ArrayOfTenant");
    private final static QName _Tenant_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "Tenant");
    private final static QName _TenantName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "Name");
    private final static QName _FieldValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "Value");
    private final static QName _UserWfmUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "WfmUserId");
    private final static QName _UserLoginName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "LoginName");
    private final static QName _UserFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "Fields");
    private final static QName _UserFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "FirstName");
    private final static QName _UserUserPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "UserPassword");
    private final static QName _UserLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "LastName");
    private final static QName _UserRoles_QNAME = new QName("http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", "Roles");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.gskm_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link ArrayOfField }
     * 
     */
    public ArrayOfField createArrayOfField() {
        return new ArrayOfField();
    }

    /**
     * Create an instance of {@link ArrayOfTenant }
     * 
     */
    public ArrayOfTenant createArrayOfTenant() {
        return new ArrayOfTenant();
    }

    /**
     * Create an instance of {@link ArrayOfRole }
     * 
     */
    public ArrayOfRole createArrayOfRole() {
        return new ArrayOfRole();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Tenant }
     * 
     */
    public Tenant createTenant() {
        return new Tenant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "ArrayOfRole")
    public JAXBElement<ArrayOfRole> createArrayOfRole(ArrayOfRole value) {
        return new JAXBElement<ArrayOfRole>(_ArrayOfRole_QNAME, ArrayOfRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "ArrayOfUser")
    public JAXBElement<ArrayOfUser> createArrayOfUser(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ArrayOfUser_QNAME, ArrayOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "FieldPojo")
    public JAXBElement<Field> createField(Field value) {
        return new JAXBElement<Field>(_Field_QNAME, Field.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "ArrayOfField")
    public JAXBElement<ArrayOfField> createArrayOfField(ArrayOfField value) {
        return new JAXBElement<ArrayOfField>(_ArrayOfField_QNAME, ArrayOfField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTenant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "ArrayOfTenant")
    public JAXBElement<ArrayOfTenant> createArrayOfTenant(ArrayOfTenant value) {
        return new JAXBElement<ArrayOfTenant>(_ArrayOfTenant_QNAME, ArrayOfTenant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tenant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Tenant")
    public JAXBElement<Tenant> createTenant(Tenant value) {
        return new JAXBElement<Tenant>(_Tenant_QNAME, Tenant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Name", scope = Tenant.class)
    public JAXBElement<String> createTenantName(String value) {
        return new JAXBElement<String>(_TenantName_QNAME, String.class, Tenant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Name", scope = Role.class)
    public JAXBElement<String> createRoleName(String value) {
        return new JAXBElement<String>(_TenantName_QNAME, String.class, Role.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Name", scope = Field.class)
    public JAXBElement<String> createFieldName(String value) {
        return new JAXBElement<String>(_TenantName_QNAME, String.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Value", scope = Field.class)
    public JAXBElement<String> createFieldValue(String value) {
        return new JAXBElement<String>(_FieldValue_QNAME, String.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "WfmUserId", scope = User.class)
    public JAXBElement<String> createUserWfmUserId(String value) {
        return new JAXBElement<String>(_UserWfmUserId_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "LoginName", scope = User.class)
    public JAXBElement<String> createUserLoginName(String value) {
        return new JAXBElement<String>(_UserLoginName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Fields", scope = User.class)
    public JAXBElement<ArrayOfField> createUserFields(ArrayOfField value) {
        return new JAXBElement<ArrayOfField>(_UserFields_QNAME, ArrayOfField.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "FirstName", scope = User.class)
    public JAXBElement<String> createUserFirstName(String value) {
        return new JAXBElement<String>(_UserFirstName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "UserPassword", scope = User.class)
    public JAXBElement<String> createUserUserPassword(String value) {
        return new JAXBElement<String>(_UserUserPassword_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "LastName", scope = User.class)
    public JAXBElement<String> createUserLastName(String value) {
        return new JAXBElement<String>(_UserLastName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GSKM.Services.DataTransfer", name = "Roles", scope = User.class)
    public JAXBElement<ArrayOfRole> createUserRoles(ArrayOfRole value) {
        return new JAXBElement<ArrayOfRole>(_UserRoles_QNAME, ArrayOfRole.class, User.class, value);
    }

}
