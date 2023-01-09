import java.io.Serializable;

// Doctor class that extends the Person class and implements the Serializable interface
public class Doctor extends Person implements Serializable {
    // instance variables for the doctor's medical license number and specialisation
    private String medicalLicenseNumber, specialisation;

    // constructor to create a new Doctor object with specified name, surname, dob, mobileNumber, medicalLicenseNumber, and specialisation
    public Doctor(String name, String surname, String dob, int mobileNumber, String medicalLicenseNumber, String specialisation) {
        super(name, surname, dob, mobileNumber); // call the superclass's constructor to set the name, surname, dob, and mobileNumber instance variables
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.specialisation = specialisation;
    }

    // setter method for the medicalLicenseNumber instance variable
    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }
    // getter method for the medicalLicenseNumber instance variable
    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    // setter method for the specialisation instance variable
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    // getter method for the specialisation instance variable
    public String getSpecialisation() {
        return specialisation;
    }

    // override of the toString method to return a string representation of the Doctor object
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
