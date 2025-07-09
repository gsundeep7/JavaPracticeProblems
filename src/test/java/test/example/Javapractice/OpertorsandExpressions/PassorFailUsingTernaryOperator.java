package test.example.Javapractice.OpertorsandExpressions;

//Accept marks and assign pass/fail using the ternary operator.

public class PassorFailUsingTernaryOperator {

    public static void main(String[] args) {

        int Marks = 37;

        String result = (Marks>=35)? "Pass":"Fail";

        System.out.println("The result is " + result);
    }
}
