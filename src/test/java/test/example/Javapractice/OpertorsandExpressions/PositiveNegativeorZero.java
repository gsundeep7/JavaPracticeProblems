package test.example.Javapractice.OpertorsandExpressions;

//Check if a number is positive, negative, or zero using if-else or ternary operator.

public class PositiveNegativeorZero {

    public static void main(String[] args) {

        int num = 7;

        //Using Ternary Operator as if else confition

        String result = (num>0)? "Positive" : (num<0)? "Negative" : "Zero";

        System.out.println("The entered number is " + result);


    }
}
