public class Consultation {
    String date, time, note;
    double cost;
    Doctor doctor;
    Patient patient;

    public Consultation(String date, String time, String note, double cost, Doctor doctor, Patient patient) {
        this.date = date;
        this.time = time;
        this.note = note;
        this.cost = cost;
        this.doctor = doctor;
        this.patient = patient;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public String getNote() {
        return note;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Patient getPatient() {
        return patient;
    }
}
