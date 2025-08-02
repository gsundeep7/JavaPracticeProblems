package test.example.Javapractice.Arrays;

//Print all elements of an array**
//   int[] numbers = {10, 20, 30, 40, 50};

public class PrintElements {

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};

        for(int i = 0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
