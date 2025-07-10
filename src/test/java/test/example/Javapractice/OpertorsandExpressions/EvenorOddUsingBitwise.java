package test.example.Javapractice.OpertorsandExpressions;

//Find whether a given number is odd or even using bitwise AND operator (&).

public class EvenorOddUsingBitwise {

    public static void main(String[] args) {

        int num = 88;

        //Every even number ends with 0 in binary → (num & 1) gives 0
        //Every odd number ends with 1 in binary → (num & 1) gives 1

        String result = ((num & 1) ==0)? "Even ": "Odd";

        System.out.println(result);

    }
}
