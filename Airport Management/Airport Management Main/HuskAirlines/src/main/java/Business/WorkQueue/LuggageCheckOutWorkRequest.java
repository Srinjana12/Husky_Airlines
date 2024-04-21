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

    public void setPassengerPerson(Passenger passengerPerson) {
        this.passengerPerson = passengerPerson;
    }

    public SecurityCheckWorkRequest getSecurityCheckWorkRequest() {
        return securityCheckWorkRequest;
    }

    public void setSecurityCheckWorkRequest(SecurityCheckWorkRequest securityCheckWorkRequest) {
        this.securityCheckWorkRequest = securityCheckWorkRequest;
    }

    @Override
    public String toString() {
        return getPassengerPerson() != null ? getPassengerPerson().getName() : "No name";
    }

}
