import java.util.Scanner;

public class ExamEligibility{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double studentAttendancePercentage;
        System.out.print("Enter the student's attendance percentage: ");
        studentAttendancePercentage = input.nextDouble();

        if (studentAttendancePercentage >= 75) {
            System.out.println("Eligible for the exam.");
        }

        else if (studentAttendancePercentage >= 60 && studentAttendancePercentage < 75) {
            System.out.println("Eligible for the exam with a warning letter.");
        }
        
        else {
            System.out.println("Not eligible, see Dean of Students.");
        }

    }
}