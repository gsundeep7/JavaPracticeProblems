package test.example.Javapractice.OpertorsandExpressions;

//Evaluate the result of a complex expression combining arithmetic, logical, and relational operators.

public class ComplexExpressionsDemo {

        public static void main(String[] args) {
            int a = 10, b = 5, c = 20;

            // Arithmetic Expression
            int arithmeticResult = (a + b * c) / 5 % 4;

            // Relational Expressions
            boolean isAGreater = a > b;
            boolean isCEqual = c == 20;

            // Logical Expression combining relational and arithmetic
            boolean finalResult = (arithmeticResult > 2) && isAGreater || !isCEqual;

            // Display Results
            System.out.println("Arithmetic Result = " + arithmeticResult);
            System.out.println("Is a > b? " + isAGreater);
            System.out.println("Is c == 20? " + isCEqual);
            System.out.println("Final Logical Result = " + finalResult);

    }

}
