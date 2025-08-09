package test.example.Javapractice.ArrayList;

//**Swap two elements in an ArrayList (e.g., 2nd and 4th element).**

import java.util.ArrayList;

public class SwappingofTwoElements {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Custard");
        fruits.add("Dragon");

        System.out.println("List of fruits before swapping: " + fruits);

        String temp = fruits.get(1);        //Storing 2 nd element
        fruits.set(1, fruits.get(3));       //Sets 4th element in second position
        fruits.set(3, temp);

        System.out.println("List of fruits after swapping: " + fruits);

    }
}
