package test.example.Javapractice.ControlStatements;

//Looping Statements -- Calculate the sum of the first N natural numbers.

public class SumofFirstNnaturalnumbers {

    public static void main(String[] args) {


        int sum = 0;
        for(int i = 1; i<=7; i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
