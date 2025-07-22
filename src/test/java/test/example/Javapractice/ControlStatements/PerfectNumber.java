package test.example.Javapractice.ControlStatements;

//Control Statments -- Check if a number is perfect.

public class PerfectNumber {

    public static void main(String[] args) {

        int num = 24;
        int originalnumber = num;
        int sum = 0;

        for (int i = 1; i<= num/2; i++)
        {
            if(num%i==0)
            {
                sum = sum+i;
            }
        }

        System.out.println("Original Number is " + originalnumber);
        if(sum == originalnumber)
        {
            System.out.println("The number is perfect number");
        }
        else
        {
            System.out.println("The number is NOT perfect number");
        }
    }
}
