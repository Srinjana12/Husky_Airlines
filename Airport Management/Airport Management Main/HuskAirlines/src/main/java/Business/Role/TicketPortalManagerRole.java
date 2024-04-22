/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TicketBooking;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TicketPortalManagerRole.TicketingPortalManagerAreaJPanel;

/**
 *
 * @author 
 */
public class TicketPortalManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TicketingPortalManagerAreaJPanel(userProcessContainer, account, (TicketBooking) organization, enterprise, business);
    }

    public String toString() {
        return "Ticket Portal Manager";
    }

}
