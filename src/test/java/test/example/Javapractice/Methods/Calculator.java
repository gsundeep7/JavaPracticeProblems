package test.example.Javapractice.Methods;

//**Create a calculator class with methods for add, subtract, multiply, and divide.**
//    * Each method takes two numbers and returns a result

public class Calculator {

    public int addition(int a, int b)
    {
        return a+b;
    }

    public int subtraction(int a, int b)
    {
        return a-b;
    }

    public int multiplication(int a, int b)
    {
        return a*b;
    }

    public double division(double a,  double b)
    {
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two numbers is "+calc.addition(35,77));
        System.out.println("Subtraction of two numbers is "+calc.subtraction(77,55));
        System.out.println("Multiplication of two numbers is "+calc.multiplication(22,66));
        System.out.println("Division of two numbers is "+calc.division(45,3));

    }



}
