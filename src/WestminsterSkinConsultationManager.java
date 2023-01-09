import java.util.*;
import java.io.*;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    // List of doctors in the consultation centre
    private List<Doctor> doctors;

    // Scanner object to read input from the user
    private final Scanner scanner;

    public WestminsterSkinConsultationManager() {
        doctors = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        // Load doctors from file
        loadDoctorsFromFile();

        while (true) {
            // Display menu
            System.out.println("\nWestminster Skin Consultation Manager\n");
            System.out.println("1. Add a new doctor");
            System.out.println("2. Delete a doctor");
            System.out.println("3. Print list of doctors");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1 - 4): ");

            // Read user's choice
            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume the invalid input
                continue;
            }

            if (choice == 1) {
                // Add a new doctor
                addDoctor();
            } else if (choice == 2) {
                // Delete a doctor
                deleteDoctor();
            } else if (choice == 3) {
                // Print list of doctors
                printDoctors();
            } else if (choice == 4) {
                // Quit
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        // Save doctors to file
        saveDoctorsToFile();
    }

    // Add doctor
    public void addDoctor() {
        if (doctors.size() == 10) {
            System.out.println("Cannot add more doctors. The maximum number of doctors has been reached."); // If doctors more than 10
            return;
        }

        scanner.nextLine(); // Consume newline character

        System.out.print("Enter doctor's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter doctor's surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter doctor's date of birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("Enter doctor's mobile number: ");
        int mobileNumber = 0;
        if (scanner.hasNextInt()) { // If input is integer
            mobileNumber = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number."); // Else input is not an integer
            scanner.nextLine(); // consume the invalid input
            return;
        }

        System.out.print("Enter doctor's medical licence number: ");
        scanner.nextLine(); // Consume newline character
        String medicalLicenseNumber = scanner.nextLine();

        System.out.print("Enter doctor's specialisation: ");
        String specialisation = scanner.nextLine();

        Doctor doctor = new Doctor(name, surname, dob, mobileNumber, medicalLicenseNumber, specialisation);
        doctors.add(doctor);

        System.out.println("Doctor added successfully."); // Display output message
    }

    // Delete doctor
    public void deleteDoctor() {
        System.out.print("Enter doctor's medical licence number: ");
        String medicalLicenseNumber = scanner.next();

        Doctor doctorToDelete = null;
        for (Doctor doctor : doctors) {
            if (doctor.getMedicalLicenseNumber().equals(medicalLicenseNumber)) {
                doctorToDelete = doctor;
                break;
            }
        }

        if (doctorToDelete != null) { // If there is doctor it will be removed
            doctors.remove(doctorToDelete);
            System.out.println("Deleted doctor's information: " + doctorToDelete);
        } else { // else if there is no doctor this message will be showed
            System.out.println("Doctor with licence number " + medicalLicenseNumber + " not found.");
        }
        System.out.println("Total number of doctors in the centre: " + doctors.size()); // Display the total number of doctors in the centre

    }

    // Print the list of doctors
    public void printDoctors() {
        // Sort doctors by surname
        doctors.sort(Comparator.comparing(Doctor::getSurname));

        // Print list of doctors
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }


    // Add data to file
    private void saveDoctorsToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("doctors.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(doctors);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Added successfully");
    }


    // Load data from file
    private void loadDoctorsFromFile() {
        try {
            FileInputStream fis = new FileInputStream("doctors.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            doctors = (List<Doctor>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            // File not found or invalid format, ignore and start with an empty list of doctors
        }
    }



    public static void main(String[] args) {
        // create a new WestminsterSkinConsultationManager object
        WestminsterSkinConsultationManager manager = new WestminsterSkinConsultationManager();
        manager.run(); // run the manager
    }

}
