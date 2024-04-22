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
 * @author rishisehgal
 */
public class JourneyReportGenerationWorkRequest extends WorkRequest {

    private Passenger passengerPerson;
    private SecurityCheckWorkRequest securityCheckWorkRequest;
    private List<String> immigrationDetails;
    private String numberOfLuggage;

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

    public List<String> getImmigrationDetails() {
        return immigrationDetails;
    }

    public void setImmigrationDetails(List<String> immigrationDetails) {
        this.immigrationDetails = immigrationDetails;
    }

    public String getNumberOfLuggage() {
        return numberOfLuggage;
    }

    public void setNumberOfLuggage(String scheme) {
        this.numberOfLuggage = scheme;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }

}
