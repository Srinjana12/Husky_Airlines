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
    private String terminalReported;
    private SecurityCheckWorkRequest securityCheckWorkRequest;

    public Passenger getPassengerPerson() {
        return passengerPerson;
    }

    public void setPassengerPerson(Passenger passengerPerson) {
        this.passengerPerson = passengerPerson;
    }

    public String getTerminalReported() {
        return terminalReported;
    }

    public void setTerminalReported(String addressToBePlaced) {
        this.terminalReported = addressToBePlaced;
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
