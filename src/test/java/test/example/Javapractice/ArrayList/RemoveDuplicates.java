package test.example.Javapractice.ArrayList;

//**Remove all duplicate elements from an ArrayList.**  --- has different ways to write the code

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("James");
        names.add("Mike");
        names.add("James");
        names.add("Lebron");
        names.add("Tyson");
        names.add("Mike");
        names.add("Chan");


        System.out.println("The list of names defined are " + names);


        ArrayList<String> newlist = new ArrayList<>();
        for(String name: names) {
            if (!newlist.contains(name))
            {
                newlist.add(name);
            }
        }
        names.clear();
        names.addAll(newlist);
        System.out.println("The list containing unique values is : " +names);
    }


}
