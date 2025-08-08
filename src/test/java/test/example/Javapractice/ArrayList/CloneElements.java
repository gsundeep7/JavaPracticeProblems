package test.example.Javapractice.ArrayList;
import java.util.ArrayList;

//Clone an ArrayList into another ArrayList.**

public class CloneElements {
    public static void main(String[] args) {
        // Original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        // Clone the original list into a new list
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        // Print both lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }


}
