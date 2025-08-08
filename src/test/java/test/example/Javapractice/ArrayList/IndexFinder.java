package test.example.Javapractice.ArrayList;

//**Find the index of a specific element in an ArrayList.**

import java.util.ArrayList;

public class IndexFinder {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Eddard");
        names.add("Catelyn");
        names.add("Robert");
        names.add("Sansa");
        names.add("Arya");

        System.out.println("Elements of the arraylist are: " + names);

        System.out.println("The index of Arya in the lst of names is: " + names.indexOf("Arya"));

    }
}
