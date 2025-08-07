package test.example.Javapractice.ArrayList;

//**Create an ArrayList of Strings and add 5 names. Print them using a loop.**

import java.util.ArrayList;

public class PrintStrings {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(5);

        names.add("Apple");
        names.add("Banana");
        names.add("Custard");
        names.add("Fruit");
        names.add("Mango");

        System.out.println(names);      //Prints arraylist values in a list
        for (String name : names)
        {
            System.out.println(name);   //Prints arraylist values one by one
        }

    }
}
