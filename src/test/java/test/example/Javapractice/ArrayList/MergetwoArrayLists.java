package test.example.Javapractice.ArrayList;

// **Create two ArrayLists and merge them.**

import java.util.ArrayList;

public class MergetwoArrayLists {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        ArrayList<String> merged = new ArrayList<>();

        arr1.add("James");
        arr1.add("Max");
        arr1.add("John");

        arr2.add("Ned");
        arr2.add("Cat");
        arr2.add("Robb");

        System.out.println("The list of element in arr1 are: " +arr1);
        System.out.println("The list of element in arr2 are: " +arr2);


        //arr1.addAll(arr2);    -- Merging array 2 into array1
        //System.out.println(arr1);

        merged.addAll(arr1);
        merged.addAll(arr2);

        System.out.println("The arraylist after merging into new arraylist is: " + merged);

    }
}
