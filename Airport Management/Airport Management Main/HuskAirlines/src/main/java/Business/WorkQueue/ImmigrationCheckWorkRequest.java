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
    private List<List<String>> diseasedetails;

    public Passenger getPassengerPerson() {
        return passengerPerson;
    }

    public void setHomelessPerson(Passenger homelessPerson) {
        this.passengerPerson = homelessPerson;
    }

    public SecurityCheckWorkRequest gethospitalAllocationWorkRequest() {
        return securityCheckWorkRequest;
    }

    public void sethospitalAllocationWorkRequest(SecurityCheckWorkRequest hospitalAllocationWorkRequest) {
        this.securityCheckWorkRequest = hospitalAllocationWorkRequest;
    }

    public List<List<String>> getDiseasedetailsForHomeless() {
        return diseasedetails;
    }

    public void setDiseasedetailsForHomeless(List<List<String>> addressesForHomeless) {
        this.diseasedetails = addressesForHomeless;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }

}
