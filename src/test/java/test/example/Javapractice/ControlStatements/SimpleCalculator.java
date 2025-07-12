package test.example.Javapractice.ControlStatements;

//Contional Statement --*Create a simple calculator using switch ( +, -, , /, % ).

public class SimpleCalculator {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        char ch = '+';

        switch (ch){

            case '+':
                System.out.println("Addition " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication " +(num1*num2));
                break;
            case '/':
                System.out.println("Division " +(num1/num2));
                break;

            case '%':
                System.out.println("Modulus " +(num1%num2));
                break;

            default:
                System.out.println("Invalid operator other than +,-,*,/,%");


        }

    }
}
