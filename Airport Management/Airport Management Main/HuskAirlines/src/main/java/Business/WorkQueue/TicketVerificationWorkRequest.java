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
public class TicketVerificationWorkRequest extends WorkRequest {

    private Passenger passengerPerson;
    private String hospitalToBePlaced;
    private SecurityCheckWorkRequest securityCheckWorkRequest;

    public Passenger getPassengerPerson() {
        return passengerPerson;
    }

    public void setPassengerPerson(Passenger passengerPerson) {
        this.passengerPerson = passengerPerson;
    }

    public String gethospitalToBePlaced() {
        return hospitalToBePlaced;
    }

    public void sethospitalToBePlaced(String addressToBePlaced) {
        this.hospitalToBePlaced = addressToBePlaced;
    }

    public SecurityCheckWorkRequest getHospitalAllocationWorkRequest() {
        return securityCheckWorkRequest;
    }

    public void setHospitalAllocationWorkRequest(SecurityCheckWorkRequest allocationWorkRequest) {
        this.securityCheckWorkRequest = allocationWorkRequest;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }
}
