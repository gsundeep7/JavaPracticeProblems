package test.example.Javapractice.ArrayList;

//**Iterate over an ArrayList using:**
//   * `for` loop
//   * `for-each` loop
//   * `Iterator`

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterators {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Gauva");
        fruits.add("Gooseberry");
        fruits.add("Banana");

        //1. Using for loop
        for(int i =0; i< fruits.size(); i++)
        {
            System.out.println(fruits.get(i));
        }

        //2. Using for each loop(enhanced for loop)
        for(String fruit: fruits)
        {
            System.out.println( fruit);
        }


        //3. Using Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
