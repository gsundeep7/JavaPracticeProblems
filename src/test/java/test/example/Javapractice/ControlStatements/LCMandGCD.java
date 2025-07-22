package test.example.Javapractice.ControlStatements;

//Control Statements -- Find LCM and GCD of two numbers using loop.

public class LCMandGCD {

    public static void main(String[] args) {

        int num1 = 12;
        int num2= 18;
        int gcd = 1;


        //For loop to find GCD
        for( int i = 1; i< Math.min(num1, num2); i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }

        int lcm = (num1*num2)/gcd;

        System.out.println("Given two numbers are " + num1 + " and " + num2);
        System.out.println("GCD of two numbers is " + gcd);
        System.out.println("LCM of two numbers is " + lcm);



    }
}
