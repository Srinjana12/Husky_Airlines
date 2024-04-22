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
    private String passportExpiry;
    private String seatPreference;
    private String foodPreference;
    private String emergencyName;
    private String emergencyNo;
    private String gender;
    private boolean hasCriminalRecord;
    private boolean preconditions;
    private boolean anyMedication;
    private boolean accomodationRequired;
    private String address;
    private static int counter = 0;

    public Passenger(String name, String dob, String Destinationcity, String SourceLoc, String passportNo, String contactNo, String emailAddress, String passportExpiry, String seatPreference, String foodPreference, String emergencyName, String emergencyNo, String gender, boolean hasCriminalRecord, boolean preconditions, boolean anyMedication, boolean accomodationRequired, String address) {
        this.name = name;
        this.dob = dob;
        this.Destinationcity = Destinationcity;
        this.SourceLoc = SourceLoc;
        this.passportNo = passportNo;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
        this.passportExpiry = passportExpiry;
        this.seatPreference = seatPreference;
        this.foodPreference = foodPreference;
        this.emergencyName = emergencyName;
        this.emergencyNo = emergencyNo;
        this.gender = gender;
        this.hasCriminalRecord = hasCriminalRecord;
        this.preconditions = preconditions;
        this.anyMedication = anyMedication;
        this.accomodationRequired = accomodationRequired;
        this.address = address;
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

    public String getPassportExpiry() {
        return passportExpiry;
    }

    public void setPassportExpiry(String dependents) {
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

    public String getEmergencyNo() {
        return emergencyNo;
    }

    public void setEmergencyNo(String income) {
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
