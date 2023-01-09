public class Person {
    // instance variables for a person's name, surname, date of birth, and mobile number
    String name, surname, dob;
    int mobileNumber;

    // constructor to create a new Person object with specified name, surname, dob, and mobileNumber
    public Person(String name, String surname, String dob, int mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
    }

    // setter method for the name instance variable
    public void setName(String name) {
        this.name = name;
    }
    // getter method for the name instance variable
    public String getName() {
        return name;
    }

    // setter method for the surname instance variable
    public void setSurname(String surname) {
        this.surname = surname;
    }
    // getter method for the surname instance variable
    public  String getSurname() {
        return surname;
    }

    // setter method for the dob instance variable
    public void setDob(String dob) {
        this.dob = dob;
    }

    // getter method for the dob instance variable
    public  String getDob() {
        return dob;
    }

    // setter method for the mobileNumber instance variable
    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    // getter method for the mobileNumber instance variable
    public  int getMobileNumber() {
        return mobileNumber;
    }
}
