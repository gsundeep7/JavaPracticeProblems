package test.example.Javapractice.ArrayList;


import java.util.*;

public class ArrayListToHashSet {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Apple");
        fruits.add("Battayi");


        // Convert ArrayList to HashSet (removes duplicates automatically)
        HashSet<String> set = new HashSet<>(fruits);

        System.out.println("Original List: " + fruits);
        System.out.println("HashSet (Duplicates Removed): " + set);
    }
}

