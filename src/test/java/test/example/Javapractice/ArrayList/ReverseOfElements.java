package test.example.Javapractice.ArrayList;

// **Reverse the elements of an ArrayList without using built-in methods.**  ----- has 3 different ways to write the code

import java.util.ArrayList;

public class ReverseOfElements {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(32);
        numbers.add(24);
        numbers.add(73);
        numbers.add(38);
        numbers.add(82);
        numbers.add(39);
        numbers.add(70);

        System.out.println("The list of numbers before reversal are : " + numbers);

        ArrayList<Integer> reversedlist = new ArrayList<>();
        for(int i = numbers.size() - 1; i>=0; i--)
        {
            reversedlist.add(numbers.get(i));
        }

        numbers.clear();
        numbers.addAll(reversedlist);

        System.out.println("The list of numbers after reversal are :" + numbers);

    }

}
