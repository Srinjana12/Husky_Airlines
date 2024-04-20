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
public class SecurityCheckWorkRequest extends WorkRequest {

    private Passenger passengerPerson;
    private String department;
    private ArrayList<String> allocatedSeat;
    List<String> immigrationDetails;
    String terminalReported;

    public ArrayList<String> getAllocatedSeat() {
        return allocatedSeat;
    }

    public void setAllocatedSeat(ArrayList<String> symptoms) {
        this.allocatedSeat = symptoms;
    }

    //private String testResult;
    public Passenger getPassengerPerson() {
        return passengerPerson;
    }

    public String getDepartmentDetais() {
        return department;
    }

    public void setDepartmentDetails(String department) {
        this.department = department;
    }

    public void setPassengerPerson(Passenger homelessPerson) {
        this.passengerPerson = homelessPerson;
    }

    public List<String> getImmigrationDetails() {
        return immigrationDetails;
    }

    public void setImmigrationDetails(List<String> diseasesForHomeless) {
        this.immigrationDetails = diseasesForHomeless;
    }

    public String getTerminalReported() {
        return terminalReported;
    }

    public void setTerminalReported(String addressToBePlaced) {
        this.terminalReported = addressToBePlaced;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }
}