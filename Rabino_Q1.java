import java.util.Scanner;

public class Rabino_Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing variables
        String course;
        String code;
        int units;
        int totalUnits = 0;
        int unitFee = 1000;

        // Getting Student Information
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Number of Subjects/Courses (Max.: 10): ");
        int numSubs = scanner.nextInt();
        scanner.nextLine();

        // Verifying the number of subjects aligns with the instruction (Maximum of 10 subjects)
        if (numSubs >= 1 && numSubs <= 10) {
            // For loop to get course descriptions
            for (int i = 1; i <= numSubs; i++) {
                System.out.println("\nSubject Course: " + i);
                System.out.print("Course: ");
                course = scanner.nextLine();
                System.out.print("Course Code: ");
                code = scanner.nextLine();
                System.out.print("Number of Units: ");
                units = scanner.nextInt();
                scanner.nextLine();

                // Validation of the Student's number of Units
                if (units >= 1 && units <= 5) {
                    totalUnits += units;
                } else {
                    System.out.println("\nInvalid number of units. Please enter a value between 1 and 5.");
                    break;
                }
            }

            if (totalUnits <= 50 && totalUnits >= 1) {
                // Calculating for the Total Enrollment Fee
                int fee = totalUnits * unitFee;

                // Output the Student's Name and his/her Total Enrollment Fee
                System.out.println("\nSTUDENT INFORMATION:");
                System.out.println("Student Name: " + studentName);
                System.out.println("Total Enrollment Fee: " + fee);

                // Asking for the Student's Payment
                System.out.print("\nEnter Payment Amount: ");
                int payment = scanner.nextInt();

                // Checking if the Payment is sufficient for the Enrollment Fee
                if (payment == fee) {
                    System.out.println("\nFully Paid. Transaction complete. Thank you.:>");
                } else if (payment < fee) {
                    System.out.println("\nPartial Payment. You only paid " + payment + " out of " + fee);
                } else {
                    int excess = payment - fee;
                    System.out.println("\nExcess Payment. You paid " + excess + " more than the Enrollment Fee.");
                }
            } else {
                return;
            }
        } else {
            System.out.println("\nInvalid input. Please enter a value between 1 and 10.");
        }

        scanner.close();
    }
}