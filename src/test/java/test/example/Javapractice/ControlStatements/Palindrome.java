package test.example.Javapractice.ControlStatements;

//Looping Statements --	Check if a number is a palindrome.

public class Palindrome {

    public static void main(String[] args) {

        int number = 4248424;
        int original = number;
        int reverse = 0;

        while(number!=0)
        {
            int digit = number%10;                  //leaves remainder -- last digit
            reverse = reverse*10 + digit;       //adding the digit to the number
            number = number/10;                       //removing the last digit
        }
        if(reverse == original)
        {
            System.out.println("The number " + original + " is palindrome");
        }
        else
        {
            System.out.println("The number " + original + " is not palindrome");
        }

    }
}
