/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodHospitalityManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class FoodAllocation extends Organization {

    public FoodAllocation() {
        super(Organization.Type.FoodAllocation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodHospitalityManagerRole());
        return roles;
    }

}
