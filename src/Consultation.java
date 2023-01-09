public class Consultation {
    // instance variables for the date, time, note, cost, doctor, and patient for a consultation
    String date, time, note;
    double cost;
    Doctor doctor;
    Patient patient;

    // constructor to create a new Consultation object with specified date, time, note, cost, doctor, and patient
    public Consultation(String date, String time, String note, double cost, Doctor doctor, Patient patient) {
        this.date = date;
        this.time = time;
        this.note = note;
        this.cost = cost;
        this.doctor = doctor;
        this.patient = patient;
    }

    // setter method for the date instance variable
    public void setDate(String date) {
        this.date = date;
    }
    // getter method for the date instance variable
    public String getDate() {
        return date;
    }

    // setter method for the time instance variable
    public void setTime(String time) {
        this.time = time;
    }
    // getter method for the time instance variable
    public String getTime() {
        return time;
    }

    // setter method for the note instance variable
    public void setNote(String note) {
        this.note = note;
    }
    // getter method for the note instance variable
    public String getNote() {
        return note;
    }

    // setter method for the cost instance variable
    public void setCost(double cost) {
        this.cost = cost;
    }
    // getter method for the cost instance variable
    public double getCost() {
        return cost;
    }

    // setter method for the doctor instance variable
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    // getter method for the doctor instance variable
    public Doctor getDoctor() {
        return doctor;
    }

    // setter method for the patient instance variable
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    // getter method for the patient instance variable
    public Patient getPatient() {
        return patient;
    }
}
