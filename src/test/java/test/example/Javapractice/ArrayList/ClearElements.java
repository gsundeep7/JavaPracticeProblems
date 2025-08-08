package test.example.Javapractice.ArrayList;
import java.util.ArrayList;

//**Clear all elements from an ArrayList.**

public class ClearElements {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Before clearing: " + fruits);

        // Clear all elements
        fruits.clear();

        System.out.println("After clearing: " + fruits);
    }


}
