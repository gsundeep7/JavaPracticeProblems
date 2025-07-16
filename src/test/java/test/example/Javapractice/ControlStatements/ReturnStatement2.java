package test.example.Javapractice.ControlStatements;

//Jump statement --	Use a method to check if a number is prime or not using return.

public class ReturnStatement2 {

        // Method to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;  // 0 and 1 are not prime numbers
            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;  // Not prime if divisible by any number other than 1 and itself
                }
            }

            return true;  // Number is prime
        }

        public static void main(String[] args) {
            int num = 29;  // You can change this to test other numbers

            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }



}
