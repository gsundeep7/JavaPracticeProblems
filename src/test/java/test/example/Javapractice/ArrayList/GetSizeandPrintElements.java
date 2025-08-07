package test.example.Javapractice.ArrayList;

//**Get the size of the ArrayList and print all elements.**

import java.util.ArrayList;

public class GetSizeandPrintElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("James");
        names.add("Tyson");
        names.add("Walker");
        names.add("Lebron");
        names.add("Cameron");

        System.out.println("The size of the arraylist is " + names.size());

        for (String name:names)
        {
            System.out.println(name);
        }
    }
}
