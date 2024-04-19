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
public class ReportGenerationWorkRequest extends WorkRequest {

    private Passenger homelessPerson;
    private HospitalAllocationWorkRequest hospitalAllocationWorkRequest;
    private List<String> diseasesForHomeless;
    private String finalmedicines;

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
        return getHomelessPerson() != null ? getHomelessPerson().getName() : "No name";
    }

}
