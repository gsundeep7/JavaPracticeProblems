package test.example.Javapractice.Methods;

//*Write a method to calculate the factorial of a number.**
//   * Parameter: `int n`
//   * Return type: `long`

public class Factorial {


    public long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        long res = obj.fact(4);
        System.out.println("The factorial is "+res);

    }

}
