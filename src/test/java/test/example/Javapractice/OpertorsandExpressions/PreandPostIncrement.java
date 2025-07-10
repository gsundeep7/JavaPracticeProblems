package test.example.Javapractice.OpertorsandExpressions;

//Demonstrate pre-increment and post-increment operators and print the values before and after.


public class PreandPostIncrement {

    public static void main(String[] args) {
        int a = 5;
        int b;

        System.out.println("Initial value of a: " + a);

        // Post-increment
        b = a++;
        System.out.println("\nAfter post-increment (b = a++):");
        System.out.println("Value of b: " + b); // b gets the old value of a
        System.out.println("Value of a: " + a); // a is incremented after assignment

        // Reset a
        a = 5;

        // Pre-increment
        b = ++a;
        System.out.println("\nAfter pre-increment (b = ++a):");
        System.out.println("Value of b: " + b); // b gets the incremented value of a
        System.out.println("Value of a: " + a); // a is incremented before assignment
    }
}
