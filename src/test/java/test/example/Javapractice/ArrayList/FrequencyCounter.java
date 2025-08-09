package test.example.Javapractice.ArrayList;

//**Find the frequency of an element in an ArrayList.**  --- has different ways to write the code

import java.util.ArrayList;

public class FrequencyCounter {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("James");
        names.add("Mike");
        names.add("James");
        names.add("Lebron");
        names.add("Tyson");
        names.add("Mike");
        names.add("Chan");

        String target = "Mike";
        int count = 0;

        for (String item : names) {
            if (item.equals(target)) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);


    }
}
