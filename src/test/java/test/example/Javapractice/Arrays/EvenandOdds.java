package test.example.Javapractice.Arrays;

//Count even and odd numbers in an array

public class EvenandOdds {


    public static void main(String[] args) {


        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 7;
        arr[2] = 108;
        arr[3] = 73;
        arr[4] = 103;
        arr[5] = 77;
        int even = 0;
        int odd = 0;

        for(int i : arr)
        {
            if(i%2==0)
            {
                even = even + 1;
            }
            else {
                odd = odd + 1;
            }
        }

        System.out.println("Number of even numbers in the array are "+even);
        System.out.println("Number of odd numbers in the array are "+odd);
    }
}
