package test.example.Javapractice.ArrayList;

//**Filter strings in an ArrayList that start with a specific letter.**

import java.util.*;

public class FilterByLetter {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot"));

            char letter = 'A'; // filter letter
            ArrayList<String> filteredList = new ArrayList<>();

            for (String item : list) {
                if (item.startsWith(String.valueOf(letter))) {
                    filteredList.add(item);
                }
            }

            System.out.println("Filtered list: " + filteredList);
        }


}
