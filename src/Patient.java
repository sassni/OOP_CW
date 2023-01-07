public class Patient extends Person {
    private String patientId;
    public Patient(String name, String surname, String dob, int mobileNumber, String patientId) {
        super(name, surname, dob, mobileNumber);
        this.patientId = patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public String getPatientId() {
        return patientId;
    }
}
