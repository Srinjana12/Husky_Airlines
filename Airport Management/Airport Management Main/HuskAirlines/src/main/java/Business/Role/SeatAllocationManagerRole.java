/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SeatAllocation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SeatAllocationRole.SeatAllocationWorkAreaJPanel;

/**
 *
 * @author 
 */
public class SeatAllocationManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SeatAllocationWorkAreaJPanel(userProcessContainer, account, (SeatAllocation) organization, enterprise, business);
    }

    public String toString() {
        return "Seat Allocation";
    }

}
