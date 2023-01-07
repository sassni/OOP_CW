public class Person {
    private String name, surname, dob;
    private int mobileNumber;

    public Person(String name, String surname, String dob, int mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public  String getSurname() {
        return surname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public  String getDob() {
        return dob;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public  int getMobileNumber() {
        return mobileNumber;
    }
}
