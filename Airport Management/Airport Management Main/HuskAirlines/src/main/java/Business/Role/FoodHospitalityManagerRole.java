/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodAllocation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FoodAllocation.FoodAllocationTestWorkAreaJPanel;

/**
 *
 * @author 
 */
public class FoodHospitalityManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FoodAllocationTestWorkAreaJPanel(userProcessContainer, account, (FoodAllocation) organization, business, enterprise);
    }

    public String toString() {
        return "Food Hospitality Manager";
    }

}
