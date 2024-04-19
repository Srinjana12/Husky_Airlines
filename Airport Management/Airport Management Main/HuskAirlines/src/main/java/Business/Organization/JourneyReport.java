/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class JourneyReport extends Organization {

    public JourneyReport() {
        super(Organization.Type.JourneyReport.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new JourneyReportCreatorRole());
        return roles;
    }
}
