package test.example.Javapractice.DataypesandVariables;

//Write a program to show how boolean variables work with logical operations

public class booleanwithlogicaloperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        boolean result1 = a && b;
        System.out.println("true AND false = " + result1); // false

        // Logical OR (||)
        boolean result2 = a || b;
        System.out.println("true OR false = " + result2); // true

        // Logical NOT (!)
        boolean result3 = !a;
        boolean result4 = !b;
        System.out.println("NOT true = " + result3);  // false
        System.out.println("NOT false = " + result4); // true

        // Combining multiple conditions
        boolean result5 = (5 > 2) && (8 > 4);  // true && true => true
        boolean result6 = (3 < 1) || (7 == 7); // false || true => true

        System.out.println("(5 > 2) AND (8 > 4): " + result5);
        System.out.println("(3 < 1) OR (7 == 7): " + result6);
    }
}
