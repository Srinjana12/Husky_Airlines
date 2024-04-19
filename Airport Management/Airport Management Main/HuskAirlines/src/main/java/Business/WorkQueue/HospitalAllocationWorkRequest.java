/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Passenger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class HospitalAllocationWorkRequest extends WorkRequest {

    private Passenger homelessPerson;
    private String department;
    private ArrayList<String> symptoms;
    List<String> diseasesForHomeless;
    String hospitalToBePlaced;

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }

    //private String testResult;
    public Passenger getHomelessPerson() {
        return homelessPerson;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHomelessPerson(Passenger homelessPerson) {
        this.homelessPerson = homelessPerson;
    }

    public List<String> getDiseasesForHomeless() {
        return diseasesForHomeless;
    }

    public void setDiseasesForHomeless(List<String> diseasesForHomeless) {
        this.diseasesForHomeless = diseasesForHomeless;
    }

    public String gethospitalToBePlaced() {
        return hospitalToBePlaced;
    }

    public void sethospitalToBePlaced(String addressToBePlaced) {
        this.hospitalToBePlaced = addressToBePlaced;
    }

    @Override
    public String toString() {
        return getHomelessPerson() != null ? getHomelessPerson().getName() : "No name";
    }
}
