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
public class JourneyReportGenerationWorkRequest extends WorkRequest {

    private Passenger passengerPerson;
    private SecurityCheckWorkRequest securityCheckWorkRequest;
    private List<String> diseasesForHomeless;
    private String finalmedicines;

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

    public List<String> getDiseasesForHomeless() {
        return diseasesForHomeless;
    }

    public void setDiseasesForHomeless(List<String> diseasesForHomeless) {
        this.diseasesForHomeless = diseasesForHomeless;
    }

    public String getFinalmedicines() {
        return finalmedicines;
    }

    public void setFinalmedicines(String scheme) {
        this.finalmedicines = scheme;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }

}
