import java.io.Serializable;

public class Doctor extends Person implements Serializable {
    private String medicalLicenseNumber, specialisation;

    public Doctor(String name, String surname, String dob, int mobileNumber, String medicalLicenseNumber, String specialisation) {
        super(name, surname, dob, mobileNumber);
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.specialisation = specialisation;
    }

    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }
    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    public String getSpecialisation() {
        return specialisation;
    }

    @Override
    public String toString() {
        return "Doctor {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", medicalLicenseNumber='" + medicalLicenseNumber + '\'' +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }


}
