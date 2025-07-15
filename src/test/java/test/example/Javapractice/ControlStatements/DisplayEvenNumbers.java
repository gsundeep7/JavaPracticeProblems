package test.example.Javapractice.ControlStatements;

//Looping Statements --	Display all even numbers from 1 to 100 using a while loop.

public class DisplayEvenNumbers {

    public static void main(String[] args) {

        int i = 1;
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
