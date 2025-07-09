package test.example.Javapractice.OpertorsandExpressions;

//Rewrite the following if-else as a ternary expression:
//if (a > b)
//   max = a;
//else
//   max = b;

public class IfelsetoTernary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a>b)? a:b;

        System.out.println("The max number is " +max);

    }
}
