package test.example.Javapractice.ArrayList;

//**Insert an element at the first and last position of an ArrayList.**

import java.util.ArrayList;

public class InsertElements {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(5);

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Custard");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("The list of fruits entered are " + fruits);  //printing the elements as a list

        fruits.add(0, "Gauva");             //inserting element at first position
        fruits.add(fruits.size(), "Dragon fruit" );     //inserting element at last position(index = current size)

        System.out.println("List of fruits after updation are " + fruits);  //printing the elements as a list

        for (String name:fruits)
        {
            System.out.println(name);   //printing the elements one by ine
        }
    }
}
