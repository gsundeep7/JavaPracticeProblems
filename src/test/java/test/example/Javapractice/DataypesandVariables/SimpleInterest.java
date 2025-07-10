package test.example.Javapractice.DataypesandVariables;

//Write a program to calculate Simple Interest. ➝ Formula: SI = (P * T * R) / 100

public class SimpleInterest {

    public static void main(String[] args)
    {
        double p = 75000;
        double t = 4;
        double r = 0.5;

        double SimpleInterest = (p*t*r)/100;

        System.out.println("The principle amount is " + p);
        System.out.println(t + "is the time given");
        System.out.println(r + "is the rate of interest");
        System.out.println("The SI amount is " + SimpleInterest);
    }
}
