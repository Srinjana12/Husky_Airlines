/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Passenger;

/**
 *
 * @author 
 */
public class SymptomsCheckWorkRequest extends WorkRequest {

    private Passenger homelessPerson;
    private HospitalAllocationWorkRequest hospitalAllocationWorkRequest;

    public Passenger getHomelessPerson() {
        return homelessPerson;
    }

    public void setHomelessPerson(Passenger homelessPerson) {
        this.homelessPerson = homelessPerson;
    }

    public HospitalAllocationWorkRequest getHospitalAllocationWorkRequest() {
        return hospitalAllocationWorkRequest;
    }

    public void setHospitalAllocationWorkRequest(HospitalAllocationWorkRequest hospitalAllocationWorkRequest) {
        this.hospitalAllocationWorkRequest = hospitalAllocationWorkRequest;
    }

    @Override
    public String toString() {
        return getHomelessPerson() != null ? getHomelessPerson().getName() : "No name";
    }

}
