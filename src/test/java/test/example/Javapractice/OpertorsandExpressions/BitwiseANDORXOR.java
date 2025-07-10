package test.example.Javapractice.OpertorsandExpressions;

//Write a java program to demonstrate bitwise AND, OR, XOR operations.

public class BitwiseANDORXOR {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        int ANDresult = a&b;
        int ORresult = a|b;
        int XORresult = a^b;


        System.out.println("Given a = " + a + " (Binary " + Integer.toBinaryString(a) + ")");
        System.out.println("Given b = " + b + " (Binary " + Integer.toBinaryString(b) + ")");

        System.out.println("The value of a AND b = " + ANDresult + " (Binary "+ Integer.toBinaryString(ANDresult) + ")");
        System.out.println("The value of a OR b = " + ORresult + " (Binary "+ Integer.toBinaryString(ORresult) + ")");
        System.out.println("The value of a XOR b = " + XORresult + " (Binary "+ Integer.toBinaryString(XORresult) + ")");
    }
}
