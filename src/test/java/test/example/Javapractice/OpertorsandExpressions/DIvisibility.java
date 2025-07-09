package test.example.Javapractice.OpertorsandExpressions;

//Check if a number is divisible by both 3 and 5.

public class DIvisibility {

    public static void main(String[] args) {

        int number = 21;

        if((number%3 ==0) && (number%5==0)){

            System.out.println("The number is divisible by 3 & 5");
        }
        else{
            System.out.println("The number is not divisible by 3 & 5");
        }
    }
}
