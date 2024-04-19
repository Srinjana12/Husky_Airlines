/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.SecurityCheckin.getValue())) {
            organization = new SecurityCheckin();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TicketVerification.getValue())) {
            organization = new TicketVerification();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SeatAllocation.getValue())) {
            organization = new SeatAllocation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FoodAllocation.getValue())) {
            organization = new FoodAllocation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Immigration.getValue())) {
            organization = new Immigration();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LuggageCheckout.getValue())) {
            organization = new LuggageCheckout();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.JourneyReport.getValue())) {
            organization = new JourneyReport();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TicketBookingOrganization.getValue())) {
            organization = new TicketBooking();
            organizationList.add(organization);
        }
        return organization;
    }
     public void deleteOrganization(Organization organization)
    {
        organizationList.remove(organization);
    }
    
    public void updateOrganization(Organization organization, String name)
    {
        organization.setName(name);
    }

}
