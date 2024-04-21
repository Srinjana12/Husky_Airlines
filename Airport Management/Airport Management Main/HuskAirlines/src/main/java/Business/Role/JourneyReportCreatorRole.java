/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.JourneyReport.JourneyReportWorkAreaJPanel;

/**
 *
 * @author 
 */
public class JourneyReportCreatorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new JourneyReportWorkAreaJPanel(userProcessContainer, account, (JourneyReport) organization, business, enterprise);
    }

    public String toString() {
        return "Journey Report Creator";
    }

}
