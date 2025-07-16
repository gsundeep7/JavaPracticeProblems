package test.example.Javapractice.ControlStatements;

//Jump Statement --	Use a method to find square of a number (use return).

public class ReturnStatement1 {

    //Method to return square of number
    public static int square(int number)
    {
        return number* number;
    }


    public static void main(String[] args) {

        int num = 7;
        int result =  square(num);

        System.out.println("Square of number " + num + " is " + result);
    }
}
