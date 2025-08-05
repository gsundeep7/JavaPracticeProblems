package test.example.Javapractice.Arrays;

//**Find the second largest element in an array**

public class SecondLargest2 {

        public static void main(String[] args) {
            int[] arr = {12, 45, 67, 23, 89, 89, 34}; // sample input

            // Assume minimum possible values
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            // Loop through the array
            for (int i = 0; i < arr.length; i++) {
                // Update largest and second largest
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            // Display result
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element found (all elements may be same).");
            } else {
                System.out.println("Second largest element: " + secondLargest);
            }
        }


}
