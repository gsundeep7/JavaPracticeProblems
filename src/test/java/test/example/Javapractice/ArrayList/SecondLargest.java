package test.example.Javapractice.ArrayList;

//**Find the second largest element in an ArrayList of integers.**

import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(32);
        numbers.add(24);
        numbers.add(73);
        numbers.add(38);
        numbers.add(82);
        numbers.add(39);
        numbers.add(70);

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i : numbers) {
            if (i > largest) {
                secondlargest = largest;
                largest = i;
            }
        }
        System.out.println("The second largest of the arraylist is " + secondlargest);
    }
}
