package test.example.Javapractice.ControlStatements;

//Looping Statements -- Reverse a number using a while loop.

public class ReverseofNumber {

    public static void main(String[] args) {

        int num = 1234567;
        int reverse = 0;

        while(num!=0)
        {
            int digit = num%10;                  //leaves remainder -- last digit
            reverse = reverse*10 + digit;       //adding the digit to the number
            num = num/10;                       //removing the last digit
        }
        System.out.println("Reverse of number is " + reverse);

    }
}
