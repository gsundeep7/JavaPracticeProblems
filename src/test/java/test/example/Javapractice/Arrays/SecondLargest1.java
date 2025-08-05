package test.example.Javapractice.Arrays;

//**Find the second largest element in an array**

public class SecondLargest1 {

    public static void main(String[] args) {

        int [] arr = {10, 30, 49, 59, 69};


        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = 0; j<arr.length-1-i; j++)
            {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The second largest element in the array is :" + arr[1]);
    }
}
