package test.example.Javapractice.OpertorsandExpressions;

//Find the absolute value of a number using a ternary operator.

public class AbsoluteUsingTernary {

    public static void main(String[] args) {

        int num = -7;

        //If num is negative (< 0), it multiplies by -1 (i.e., -num). Otherwise, it keeps the number as is

        int absolute = (num<0)? -num:num;
        System.out.println("The absolute value of the number is " +absolute);
    }
}
