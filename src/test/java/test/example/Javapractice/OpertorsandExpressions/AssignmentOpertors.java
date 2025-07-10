package test.example.Javapractice.OpertorsandExpressions;

//Write a program to demonstrate the use of +=, -=, *=, /=, and %= with integer variables.

public class AssignmentOpertors {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("The number given is " + number);

        number += 5; //10+5 = 15

        System.out.println("The value of number after number+=5 is " +number);

        number -= 3; //15-3 = 12

        System.out.println("The value of number after number-=3 is " +number);

        number *= 2; //12*2 = 24

        System.out.println("The value of number after number*=2 is " +number);

        number /= 4; //24/4 = 6

        System.out.println("The value of number after number/=4 is " +number);

        number %= 3; //6%3 = 0

        System.out.println("The value of number after number%=3 is " +number);

    }
}
