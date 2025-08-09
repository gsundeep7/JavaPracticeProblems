package test.example.Javapractice.ArrayList;

//**Find the sum and average.**

import java.util.ArrayList;

public class SumAndAverage {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(33);
        numbers.add(40);

        int sum =0;
        for(int i:numbers)
        {
            sum = sum + i;
        }

        int avg = sum/numbers.size();

        System.out.println("The sum of elements in the list is: "+sum);
        System.out.println("The average of the elements in the list is: " + avg);
    }
}
