/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class TicketBookingEnterprise extends Enterprise {

    public TicketBookingEnterprise(String name) {
        super(name, EnterpriseType.TicketBooking);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Type> getSupportedOrganizationType() {

        ArrayList<Type> types = new ArrayList<>();
        types.add(Type.TicketBookingOrganization);

        return types;
    }

}
