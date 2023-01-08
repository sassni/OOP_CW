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
            System.out.println("Westminster Skin Consultation Manager");
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

    private void addDoctor() {
        if (doctors.size() == 10) {
            System.out.println("Cannot add more doctors. The maximum number of doctors has been reached.");
            return;
        }

        scanner.nextLine(); // Consume newline character

        System.out.print("Enter doctor's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter doctor's surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter doctor's date of birth: ");
        String dob = scanner.nextLine();

        System.out.print("Enter doctor's mobile number: ");
        int mobileNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter doctor's medical licence number: ");
        String medicalLicenseNumber = scanner.nextLine();

        System.out.print("Enter doctor's specialisation: ");
        String specialisation = scanner.nextLine();

        Doctor doctor = new Doctor(name, surname, dob, mobileNumber, medicalLicenseNumber, specialisation);
        doctors.add(doctor);

        System.out.println("Doctor added successfully.");
    }

    private void deleteDoctor() {
        System.out.print("Enter doctor's medical licence number: ");
        String medicalLicenseNumber = scanner.next();

        Doctor doctorToDelete = null;
        for (Doctor doctor : doctors) {
            if (doctor.getMedicalLicenseNumber().equals(medicalLicenseNumber)) {
                doctorToDelete = doctor;
                break;
            }
        }

        if (doctorToDelete != null) {
            doctors.remove(doctorToDelete);
            System.out.println("Deleted doctor's information: " + doctorToDelete);
        } else {
            System.out.println("Doctor with licence number " + medicalLicenseNumber + " not found.");
        }
        System.out.println("Total number of doctors in the centre: " + doctors.size());
    }

//    private void printDoctors() {
//        // Sort the list of doctors alphabetically by surname
//        doctors.sort(new Comparator<Doctor>() {
//            @Override
//            public int compare(Doctor d1, Doctor d2) {
//                return d1.getName().split(" ")[1].compareTo(d2.getName().split(" ")[1]);
//            }
//        });
//
//        // Print list of doctors
//        for (Doctor doctor : doctors) {
//            System.out.println(doctor);
//        }
//    }

    private void printDoctors() {
        // Sort doctors by surname
        doctors.sort(Comparator.comparing(Doctor::getSurname));

        // Print list of doctors
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }


    private void saveDoctorsToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("doctors.txt", true))) {
            out.writeObject(doctors);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void loadDoctorsFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("doctors.txt"))) {
            doctors = (List<Doctor>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // File not found or invalid format, ignore and start with an empty list of doctors
        }
    }

    public static void main(String[] args) {
        WestminsterSkinConsultationManager manager = new WestminsterSkinConsultationManager();
        manager.run();
    }

}
