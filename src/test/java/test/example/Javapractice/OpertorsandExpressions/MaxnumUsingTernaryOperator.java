package test.example.Javapractice.OpertorsandExpressions;

//Find the maximum of two numbers using the ternary operator.

public class MaxnumUsingTernaryOperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String result =  (a>b)? "Max number is a" : "Max number is b";

        System.out.println(result);
    }
}
