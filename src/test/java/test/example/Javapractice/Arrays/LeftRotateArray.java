package test.example.Javapractice.Arrays;

//**Left rotate the elements of an array by 1 or k positions**
//* Input: `{1, 2, 3, 4, 5}`, k=2 → Output: `{3, 4, 5, 1, 2}`

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Original array
        int k = 2;  // Number of rotations

        int n = arr.length;

        // Normalize k if it's more than array length
        k = k % n;

        // Step 1: Store first k elements in a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Copy the temporary elements to the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // Step 4: Print the rotated array
        System.out.print("Array after left rotation by " + k + " positions: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
