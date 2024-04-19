/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.TicketVerification;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TicketVerificationRole.TicketVerificationWorkAreaJPanel;

/**
 *
 * @author 
 */
 // class TicketVerificationOfficerRole extends Role
public class TicketVerificationOfficerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TicketVerificationWorkAreaJPanel(userProcessContainer, account, (TicketVerification) organization, enterprise, business);
    }

    public String toString() {
        return "Ticket Verification Officer";
    }

}
