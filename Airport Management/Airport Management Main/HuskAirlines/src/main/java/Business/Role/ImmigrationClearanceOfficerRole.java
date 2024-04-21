/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Immigration;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ImmigrationClearanceOfficerRole.ImmigrationClearanceOfficerWorkAreaJPanel;

/**
 *
 * @author 
 */
public class ImmigrationClearanceOfficerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ImmigrationClearanceOfficerWorkAreaJPanel(userProcessContainer, account, (Immigration) organization, business, enterprise);
    }

    public String toString() {
        return "Immigration Clearance Officer";
    }

}
