package test.example.Javapractice.Arrays;

//Find the sum of all elements in an array

public class SumofElements {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 100;
        numbers[1] = 10;
        numbers[2] = 30;
        numbers[3] = 20;
        numbers[4] = 40;

        int sum = 0;

        for(int i : numbers)
        {
            sum = sum+i;
        }
        System.out.println("Sum of elements in array are "+ sum);


    }
}
