package test.example.Javapractice.ControlStatements;

public class Armstrong {
        public static void main(String[] args) {
            int number = 124;  // You can change this to test other numbers
            int original = number;
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;        // Extract last digit
                sum += digit * digit * digit;   // Add cube of digit to sum
                number /= 10;                   // Remove last digit
            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
        }


}
