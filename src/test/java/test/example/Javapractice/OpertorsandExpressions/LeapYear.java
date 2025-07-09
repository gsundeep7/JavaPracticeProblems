package test.example.Javapractice.OpertorsandExpressions;

//Accept a year and check whether it is a leap year using logical operators.

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        if (( year%4 == 0 && year%100 != 0) || (year%400==0) )
        {
            System.out.println("The entered year is leap year");
        }
        else{
            System.out.println("The entered year is not leap year");
        }
    }
}
