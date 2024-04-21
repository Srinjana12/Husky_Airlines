package Business;

/**
 *
 * @author
 */
public class Passenger {

    private int PersonID;
    private String name;
    private String dob;
    private String Destinationcity;
    private String SourceLoc;
    private String passportNo;
    private String contactNo;
    private String emailAddress;
    private int passportExpiry;
    private String seatPreference;
    private String foodPreference;
    private String emergencyName;
    private int emergencyNo;
    private String gender;
    private boolean hasCriminalRecord;
    private boolean preconditions;
    private boolean anyMedication;
    private boolean accomodationRequired;
    private String address;
    private static int counter = 0;

    public Passenger(String name, String dob, String city, String address, String SSNNo, String contactNo, String emailAddress, int dependents, String qualifications, String accomplishments, String employmentStatus, int income, String gender, boolean hasCriminalRecord, boolean majorIllness, boolean carrierDisease, boolean geneticDisease, String prefLocation) {
        this.name = name;
        this.dob = dob;
        this.Destinationcity = city;
        this.SourceLoc = address;
        this.passportNo = SSNNo;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
        this.passportExpiry = dependents;
        this.seatPreference = qualifications;
        this.foodPreference = accomplishments;
        this.emergencyName = employmentStatus;
        this.emergencyNo = income;
        this.gender = gender;
        this.hasCriminalRecord = hasCriminalRecord;
        this.preconditions = majorIllness;
        this.anyMedication = carrierDisease;
        this.accomodationRequired = geneticDisease;
        this.address = prefLocation;
        PersonID = counter;
        ++counter;
    }

    public int getPersonID() {
        return PersonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDestinationCity() {
        return Destinationcity;
    }

    public void setDestinationCity(String city) {
        this.Destinationcity = city;
    }

    public String getSourceLocation() {
        return SourceLoc;
    }

    public void setSourceLocation(String currentAddress) {
        this.SourceLoc = currentAddress;
    }

    public String getPassportNumber() {
        return passportNo;
    }

    public void setPassportNumber(String SSNNo) {
        this.passportNo = SSNNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPassportExpiry() {
        return passportExpiry;
    }

    public void setPassportExpiry(int dependents) {
        this.passportExpiry = dependents;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String qualifications) {
        this.seatPreference = qualifications;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String accomplishments) {
        this.foodPreference = accomplishments;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String employmentStatus) {
        this.emergencyName = employmentStatus;
    }

    public int getEmergencyNo() {
        return emergencyNo;
    }

    public void setEmergencyNo(int income) {
        this.emergencyNo = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasCriminalRecord() {
        return hasCriminalRecord;
    }

    public void setHasCriminalRecord(boolean hasCriminalRecord) {
        this.hasCriminalRecord = hasCriminalRecord;
    }

    public boolean isPreConditions() {
        return preconditions;
    }

    public void setPreConditions(boolean majorIllness) {
        this.preconditions = majorIllness;
    }

    public boolean isMedication() {
        return anyMedication;
    }

    public void setMedication(boolean carrierDisease) {
        this.anyMedication = carrierDisease;
    }

    public boolean isAccomodationReq() {
        return accomodationRequired;
    }

    public void setAccomodationReq(boolean geneticDisease) {
        this.accomodationRequired = geneticDisease;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String preferredLocation) {
        this.address = preferredLocation;
    }

    public String toString() {
        return name;
    }

}
