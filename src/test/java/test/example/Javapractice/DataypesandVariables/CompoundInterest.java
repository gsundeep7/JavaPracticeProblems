package test.example.Javapractice.DataypesandVariables;


public class CompoundInterest {

    public static void main(String [] args) {


        double principle = 10000;
        double rate = 5;
        double time = 2;

        double amount = principle * Math.pow((1 +(rate / 100)),  time);
        double CI = amount - principle;

        System.out.println("The amount after interest is " + amount);
        System.out.println("The CI is " + CI);


    }



}
