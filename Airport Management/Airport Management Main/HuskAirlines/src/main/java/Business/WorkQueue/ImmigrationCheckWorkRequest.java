/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Passenger;
import java.util.List;

/**
 *
 * @author 
 */
public class ImmigrationCheckWorkRequest extends WorkRequest {

    private Passenger passengerPerson;
    private SecurityCheckWorkRequest securityCheckWorkRequest;
    private List<List<String>> immigrationDetails;

    public Passenger getPassengerPerson() {
        return passengerPerson;
    }

    public void setPassengerPerson(Passenger passengerPerson) {
        this.passengerPerson = passengerPerson;
    }

    public SecurityCheckWorkRequest getsecurityCheckWorkRequest() {
        return securityCheckWorkRequest;
    }

    public void setsecurityCheckWorkRequest(SecurityCheckWorkRequest securityCheckWorkRequest) {
        this.securityCheckWorkRequest = securityCheckWorkRequest;
    }

    public List<List<String>> getImmigrationDetails() {
        return immigrationDetails;
    }

    public void setImmigrationDetails(List<List<String>> detailsForPassenger) {
        this.immigrationDetails = detailsForPassenger;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }

}
