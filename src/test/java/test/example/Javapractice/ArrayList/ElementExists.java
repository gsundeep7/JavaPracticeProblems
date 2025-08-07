package test.example.Javapractice.ArrayList;

import java.util.ArrayList;

//**Check if a specific element exists in an ArrayList.**

public class ElementExists {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(5);

        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Gauva");
        fruits.add("Gooseberry");
        fruits.add("Banana");

        System.out.println("List of fruits present "+ fruits);

        System.out.println("Does fruits contain Orange? " + fruits.contains("Orange"));  //returns boolean

        if(fruits.contains("Grape"))            //you can print whatever you want bases on the element exist condition
        {
            System.out.println("Grape exists");
        }
        else if (fruits.contains("Gauva"))
        {
            System.out.println("Guava exists");
        }
        else {
            System.out.println("Grape or Gauva does not exist");
        }
    }
}
