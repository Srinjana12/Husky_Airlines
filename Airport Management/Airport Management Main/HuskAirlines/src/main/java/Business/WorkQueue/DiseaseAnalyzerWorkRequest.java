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
public class DiseaseAnalyzerWorkRequest extends WorkRequest {

    private Passenger homelessPerson;
    private HospitalAllocationWorkRequest hospitalAllocationWorkRequest;
    private List<List<String>> diseasedetails;

    public Passenger getHomelessPerson() {
        return homelessPerson;
    }

    public void setHomelessPerson(Passenger homelessPerson) {
        this.homelessPerson = homelessPerson;
    }

    public HospitalAllocationWorkRequest gethospitalAllocationWorkRequest() {
        return hospitalAllocationWorkRequest;
    }

    public void sethospitalAllocationWorkRequest(HospitalAllocationWorkRequest hospitalAllocationWorkRequest) {
        this.hospitalAllocationWorkRequest = hospitalAllocationWorkRequest;
    }

    public List<List<String>> getDiseasedetailsForHomeless() {
        return diseasedetails;
    }

    public void setDiseasedetailsForHomeless(List<List<String>> addressesForHomeless) {
        this.diseasedetails = addressesForHomeless;
    }

    @Override
    public String toString() {
        return getHomelessPerson() != null ? getHomelessPerson().getName() : "No name";
    }

}
