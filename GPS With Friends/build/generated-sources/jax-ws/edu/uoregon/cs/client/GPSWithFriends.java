
package edu.uoregon.cs.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GPSWithFriends", targetNamespace = "http://cs.uoregon.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GPSWithFriends {


    /**
     * 
     * @param lname
     * @param email
     * @param password
     * @param fname
     * @return
     *     returns edu.uoregon.cs.client.Status
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.RegisterResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/registerRequest", output = "http://cs.uoregon.edu/GPSWithFriends/registerResponse")
    public Status register(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "fname", targetNamespace = "")
        String fname,
        @WebParam(name = "lname", targetNamespace = "")
        String lname);

    /**
     * 
     * @param uid
     * @return
     *     returns edu.uoregon.cs.client.Location
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLocation", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.GetLocation")
    @ResponseWrapper(localName = "getLocationResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.GetLocationResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/getLocationRequest", output = "http://cs.uoregon.edu/GPSWithFriends/getLocationResponse")
    public Location getLocation(
        @WebParam(name = "uid", targetNamespace = "")
        String uid);

    /**
     * 
     * @param gid
     * @return
     *     returns java.util.List<edu.uoregon.cs.client.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMembers", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.GetMembers")
    @ResponseWrapper(localName = "getMembersResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.GetMembersResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/getMembersRequest", output = "http://cs.uoregon.edu/GPSWithFriends/getMembersResponse")
    public List<User> getMembers(
        @WebParam(name = "gid", targetNamespace = "")
        String gid);

    /**
     * 
     * @param uids
     * @return
     *     returns edu.uoregon.cs.client.Status
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.CreateGroup")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.CreateGroupResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/createGroupRequest", output = "http://cs.uoregon.edu/GPSWithFriends/createGroupResponse")
    public Status createGroup(
        @WebParam(name = "uids", targetNamespace = "")
        List<String> uids);

    /**
     * 
     * @param uid
     * @param gid
     * @return
     *     returns edu.uoregon.cs.client.Status
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMember", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.AddMember")
    @ResponseWrapper(localName = "addMemberResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.AddMemberResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/addMemberRequest", output = "http://cs.uoregon.edu/GPSWithFriends/addMemberResponse")
    public Status addMember(
        @WebParam(name = "uid", targetNamespace = "")
        String uid,
        @WebParam(name = "gid", targetNamespace = "")
        String gid);

    /**
     * 
     * @param uid
     * @param gid
     * @return
     *     returns edu.uoregon.cs.client.Status
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeMember", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.RemoveMember")
    @ResponseWrapper(localName = "removeMemberResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.RemoveMemberResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/removeMemberRequest", output = "http://cs.uoregon.edu/GPSWithFriends/removeMemberResponse")
    public Status removeMember(
        @WebParam(name = "uid", targetNamespace = "")
        String uid,
        @WebParam(name = "gid", targetNamespace = "")
        String gid);

    /**
     * 
     * @param uid
     * @param longitude
     * @param latitude
     * @return
     *     returns edu.uoregon.cs.client.Status
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setLocation", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.SetLocation")
    @ResponseWrapper(localName = "setLocationResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.SetLocationResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/setLocationRequest", output = "http://cs.uoregon.edu/GPSWithFriends/setLocationResponse")
    public Status setLocation(
        @WebParam(name = "uid", targetNamespace = "")
        String uid,
        @WebParam(name = "latitude", targetNamespace = "")
        long latitude,
        @WebParam(name = "longitude", targetNamespace = "")
        long longitude);

    /**
     * 
     * @param uid
     * @return
     *     returns java.util.List<edu.uoregon.cs.client.Group>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGroups", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.GetGroups")
    @ResponseWrapper(localName = "getGroupsResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.GetGroupsResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/getGroupsRequest", output = "http://cs.uoregon.edu/GPSWithFriends/getGroupsResponse")
    public List<Group> getGroups(
        @WebParam(name = "uid", targetNamespace = "")
        String uid);

    /**
     * 
     * @param email
     * @param password
     * @return
     *     returns edu.uoregon.cs.client.Status
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://cs.uoregon.edu/", className = "edu.uoregon.cs.client.AuthenticateResponse")
    @Action(input = "http://cs.uoregon.edu/GPSWithFriends/authenticateRequest", output = "http://cs.uoregon.edu/GPSWithFriends/authenticateResponse")
    public Status authenticate(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
