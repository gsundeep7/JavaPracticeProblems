package test.example.Javapractice.Arrays;

//**Check if an array is a palindrome**
//* Example: `{1, 2, 3, 2, 1}` → `true`

public class Palindrome {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 1, 7};  // Example array

            boolean isPalindrome = true;

            // Compare elements from both ends
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }

            // Output the result
            if (isPalindrome) {
                System.out.println("The array is a palindrome.");
            } else {
                System.out.println("The array is NOT a palindrome.");
            }
        }


}
