package test.example.Javapractice.ArrayList;

//**Split an ArrayList into two halves.**

import java.util.ArrayList;

public class SpliyArrayIntoTwo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(32);
        numbers.add(24);
        numbers.add(73);
        numbers.add(77);
        numbers.add(38);
        numbers.add(82);
        numbers.add(39);
        numbers.add(70);

        int mid = numbers.size()/2;
        ArrayList<Integer> firsthalf = new ArrayList<>();
        ArrayList<Integer> secondhalf = new ArrayList<>();

        for(int i =0; i<numbers.size(); i++)
        {
            if(i<mid)
            {
                firsthalf.add(numbers.get(i));
            }
            else
            {
                secondhalf.add(numbers.get(i));
            }
        }

        System.out.println("Firsthalf : "+ firsthalf);
        System.out.println("Secondhalf : "+ secondhalf);

    }
}
