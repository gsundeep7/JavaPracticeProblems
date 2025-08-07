package test.example.Javapractice.ArrayList;

//**Replace the second element of an ArrayList with a new value.**

import java.util.ArrayList;

public class ReplaceSecondElement {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(5);

        names.add("Mark");
        names.add("Bark");
        names.add("Clarke");
        names.add("Dark");
        names.add("Eark");

        System.out.println("The list of names in the arraylist are " + names);

        names.set(1, "Zuck");      //replacing the second element(index 1) by another element

        System.out.println("List of names in the arraylist after replacing are " + names);
    }
}
