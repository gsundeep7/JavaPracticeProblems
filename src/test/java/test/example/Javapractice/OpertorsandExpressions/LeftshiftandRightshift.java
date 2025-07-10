package test.example.Javapractice.OpertorsandExpressions;

//Left shift and right shift a number by 2 positions and display the result.

public class LeftshiftandRightshift {

    public static void main(String[] args) {

        int number = 7;

        int leftshift = number<<2;
        int rightshift = number>>2;

        System.out.println("Given number = " + number + " (Binary " + Integer.toBinaryString(number) + ")");
        System.out.println("After left shift the number = " + leftshift + " (Binary " + Integer.toBinaryString(leftshift) + ")");
        System.out.println("After left shift the number = " + rightshift + " (Binary " + Integer.toBinaryString(rightshift) + ")");
    }
}
