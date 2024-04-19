/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class LuggageCheckout extends Organization {

    public LuggageCheckout() {
        super(Organization.Type.LuggageCheckout.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportationSecurityAdministratorRole());
        return roles;
    }
}
