package test.example.Javapractice.ControlStatements;

//Looping Statements --	Find the sum of digits of a number.

public class SumofDigits {

    public static void main(String[] args) {
    int number = 10836;
    int sum = 0;

    while(number!=0)
    {
        int digit = number%10;
        sum = sum+digit;
        number=number/10;

    }
        System.out.println("The sum of digits of " +number + " is " + sum);
    }
}
