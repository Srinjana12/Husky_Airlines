/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SecurityOfficer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class SecurityCheckin extends Organization {

    public SecurityCheckin() {
        super(Organization.Type.SecurityCheckin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SecurityOfficer());
        return roles;
    }

}
