package test.example.Javapractice.DataypesandVariables;

//Write a program to swap two numbers using a temporary variable.

public class swapwithtemp {

    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("The value of a before swap is "+ a);
        System.out.println("The value of b before swap is "+ b);

        int temp = a;
        a = b;
        b=temp;

        System.out.println("The value of a after swap is "+ a);
        System.out.println("The value of b after swap is "+ b);

    }
}
