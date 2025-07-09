package test.example.Javapractice.OpertorsandExpressions;

// Accept three numbers and find the largest using relational and logical operators.

public class LargestofThreenumbers {

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 70;
        int num3 = 90;
        int largest;

        if((num1>num2) && (num1>num3)){
            largest = num1;
        }
        else if ((num2>num1) && (num2>num3)) {
            largest = num2;
        }
        else {
            largest = num3;
        }

        System.out.println("largest is " + largest);
    }
}
