package test.example.Javapractice.ArrayList;

//**Remove an element by index and by value from an ArrayList.**

import java.util.ArrayList;

public class RemoveanElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(7);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        System.out.println("Numbers in the list are " + numbers);

        numbers.remove(3);              //Removing element by index
        numbers.remove(Integer.valueOf(50));        //Removing element by value

        System.out.println("Numbers after removing elements are " + numbers);
    }
}
