package test.example.Javapractice.Methods;

//Write a method to print the Fibonacci series up to N terms.**
//    * Parameter: `int n`
//    * Return type: `void`

public class Fibonacci {

    public void fib(int n)
    {
        int first = 0, second =1;
        for(int i = 1; i<=n; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.fib(7);

    }
}
