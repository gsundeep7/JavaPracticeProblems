package test.example.Javapractice.OpertorsandExpressions;

//Find the absolute value of a number using a ternary operator.

public class AbsoluteUsingTernary {

    public static void main(String[] args) {

        int num = -7;

        int absolute = (num<0)? -num:num;
        System.out.println("The absolute value of the number is " +absolute);
    }
}
