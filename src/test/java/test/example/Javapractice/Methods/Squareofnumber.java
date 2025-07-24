package test.example.Javapractice.Methods;

//*Write a method to calculate the square of a number.**
//   * Parameter: `int num`
//   * Return type: `int`

public class Squareofnumber {

    public int square(int num)
    {
        return num*num;

    }

    public static void main(String[] args) {

        Squareofnumber obj = new Squareofnumber();
        int result = obj.square(7);
        System.out.println("Square of given number is " + result);
    }
}
