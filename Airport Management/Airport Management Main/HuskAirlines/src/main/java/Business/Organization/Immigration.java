/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ImmigrationClearanceOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class Immigration extends Organization {

    public Immigration() {
        super(Organization.Type.Immigration.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ImmigrationClearanceOfficerRole());
        return roles;
    }
}
