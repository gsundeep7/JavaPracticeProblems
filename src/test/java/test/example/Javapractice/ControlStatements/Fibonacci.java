package test.example.Javapractice.ControlStatements;

//Control Statments -- Generate Fibonacci series up to N terms.

public class Fibonacci {

    public static void main(String[] args) {

        int num = 10;

        int firstnum = 0;
        int secondnum = 1;

        System.out.println("Fibonacci series of " + num + " terms are " );

        for(int i = 1; i<=num; i++)
        {
            System.out.print(firstnum + " ");

            int next = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = next;
        }


    }
}
