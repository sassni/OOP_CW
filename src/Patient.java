public class Patient extends Person {
    // instance variable for the patient's ID
    private String patientId;

    // constructor to create a new Patient object with specified name, surname, dob, mobileNumber, and patientId
    public Patient(String name, String surname, String dob, int mobileNumber, String patientId) {
        super(name, surname, dob, mobileNumber); // call the superclass's constructor to set the name, surname, dob, and mobileNumber instance variables
        this.patientId = patientId;
    }

    // setter method for the patientId instance variable
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // getter method for the patientId instance variable
    public String getPatientId() {
        return patientId;
    }
}
