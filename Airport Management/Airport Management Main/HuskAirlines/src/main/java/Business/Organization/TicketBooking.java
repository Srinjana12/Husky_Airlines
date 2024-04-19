/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TicketPortalManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class TicketBooking extends Organization{

    public TicketBooking() {
        super(Organization.Type.TicketBookingOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TicketPortalManagerRole());
        return roles;
    }
    
}