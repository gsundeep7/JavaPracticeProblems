package test.example.Javapractice.Arrays;
import java.util.Scanner;

//**Check if a given element is present in the array**
//   * Use linear search

public class ElementPresent {

        public static void main(String[] args) {
            // Declare and initialize the array
            int[] arr = {10, 20, 30, 40, 50};

            // Create Scanner object to take user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number to search: ");
            int target = scanner.nextInt();

            // Linear search logic
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    found = true;
                    System.out.println("Element " + target + " found at index " + i);
                    break;
                }
            }

            if (!found) {
                System.out.println("Element " + target + " not found in the array.");
            }

    }

}
