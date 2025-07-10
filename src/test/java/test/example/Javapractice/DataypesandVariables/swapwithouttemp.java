package test.example.Javapractice.DataypesandVariables;

//Write a program to swap two numbers without using a temporary variable.

public class swapwithouttemp {

    public static void main(String[] args)
    {
        int a1 = 10;
        int b1 = 40;

        System.out.println("The value of a before swap is "+ a1);
        System.out.println("The value of b before swap is "+ b1);

        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;

        System.out.println("The value of a after swap is "+ a1);
        System.out.println("The value of b after swap is "+ b1);
    }
}
