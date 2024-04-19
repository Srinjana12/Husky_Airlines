/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SeatAllocationManagerRole;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class SeatAllocation extends Organization {

    public SeatAllocation() {
        super(Organization.Type.SeatAllocation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SeatAllocationManagerRole());
        return roles;
    }

}
