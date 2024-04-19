/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        if (null != type) {
            switch (type) {
                case TicketBooking:
                    enterprise = new TicketBookingEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case AirportCheckin:
                    enterprise = new AirportCheckinEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case FlightBoarding:
                    enterprise = new FlightBoardingEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Arrival:
                    enterprise = new ArrivalEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;

                default:
                    break;
            }
        }

        return enterprise;
    }
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
    
    public Enterprise updateEnterprise(Enterprise enterprise, String enterpriseName)
    {
        enterprise.setName(enterpriseName);
        return enterprise;
        
    }
}
