package test.example.Javapractice.ArrayList;

//**Create an ArrayList of integers and print only even numbers.**

import java.util.ArrayList;
public class OnlyEven {
    public static void main(String[] args) {
        // Create an ArrayList and add integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(33);
        numbers.add(40);

        System.out.println("Even numbers in the list:");

        // Loop through the ArrayList and print only even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
