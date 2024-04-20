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
public class LuggageCheckOutWorkRequest extends WorkRequest {

    private Passenger passengerPerson;
    private SecurityCheckWorkRequest securityCheckWorkRequest;

    public Passenger getPassengerPerson() {
        return passengerPerson;
    }

    public void setHomelessPerson(Passenger homelessPerson) {
        this.passengerPerson = homelessPerson;
    }

    public SecurityCheckWorkRequest getHospitalAllocationWorkRequest() {
        return securityCheckWorkRequest;
    }

    public void setHospitalAllocationWorkRequest(SecurityCheckWorkRequest hospitalAllocationWorkRequest) {
        this.securityCheckWorkRequest = hospitalAllocationWorkRequest;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }

}