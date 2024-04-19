/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TicketVerificationOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class TicketVerification extends Organization {

    public TicketVerification() {
        super(Organization.Type.TicketVerification.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TicketVerificationOfficerRole());
        return roles;
    }

}
