package test.example.Javapractice.ArrayList;

//**Convert an ArrayList to an Array and vice versa.** ---- has different ways to write the code


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));

        // Convert to Array
        String[] array = list.toArray(new String[0]);

        // Print array
        System.out.println("Array: " + Arrays.toString(array));



        //------------Array to ArrayList

        String[] array1 = {"Apple", "Banana", "Mango"};

        // Convert to ArrayList
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(array1));

        System.out.println("ArrayList: " + list1);
    }
}
