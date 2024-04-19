/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author 
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        TicketPortalManager("Ticket Portal Manager"), SecurityOfficer("Security Officer"),
        TicketVerificationOfficer("Ticket Verification Officer"), SeatAllocationManager("Seat Allocation Manager"),
        FoodHospitalityManager("Food & Hospitality Manager"), ImmigrationClearanceOfficer("Immigration Clearance Officer"), TransportationSecurityAdministrator("Transportation Security Administrator"),
        JourneyReportCreator("Journey Report Creator");
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

//creating abstract method
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business);

//    @Override
//    public String toString() {
//        return this.getClass().getName();
//    }
}
