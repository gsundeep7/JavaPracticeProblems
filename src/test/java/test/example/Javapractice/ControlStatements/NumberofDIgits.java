package test.example.Javapractice.ControlStatements;

public class NumberofDIgits {

    public static void main(String[] args) {

        int number = 10758;
        int count = 0;

        if(number == 0){
            count = 1;
        }
        else
        {
            for(;number!=0; number = number/10)
            {
                count++;
            }
        }
        System.out.println("The count of digits of the number is " + count);
    }
}
