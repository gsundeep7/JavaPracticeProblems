package test.example.Javapractice.Arrays;

//Reverse the elements of an array**
//   * Input: `{1, 2, 3, 4, 5}`
//   * Output: `{5, 4, 3, 2, 1}`

public class ReverseofArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for(int i = arr.length -1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
