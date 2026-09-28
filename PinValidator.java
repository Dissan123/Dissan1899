import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin;

        do {
            System.out.print("Enter a 4-digit Mobile Money PIN: ");

            
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter digits only.");
                input.next();
                System.out.print("Enter a 4-digit Mobile Money PIN: ");
            }

            pin = input.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println("PIN must be between 1000 and 9999.");
            }

        } while (pin < 1000 || pin > 9999);

        System.out.println("Valid PIN accepted: " + pin);
        input.close();
    }
}