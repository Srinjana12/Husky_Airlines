/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SecurityCheckin;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SecurityOfficerRole.SecurityOfficerWorkAreaJPanel;

/**
 *
 * @author 
 */
public class SecurityOfficer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SecurityOfficerWorkAreaJPanel(userProcessContainer, account, (SecurityCheckin) organization, enterprise, business);
    }

    public String toString() {
        return "Security Officer";
    }

}
