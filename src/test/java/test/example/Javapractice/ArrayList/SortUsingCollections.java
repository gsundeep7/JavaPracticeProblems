package test.example.Javapractice.ArrayList;

//Sort an ArrayList in ascending and descending order.** (Using `Collections.sort()`)

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollections {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(77);
        numbers.add(15);
        numbers.add(67);
        numbers.add(172);
        numbers.add(24);

        //sort in ascending order using collections.sort()
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        //sort in descending order using collections.sort()
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " +numbers);



    }
}
