package test.example.Javapractice.DataypesandVariables;

//Write a program to calculate BMI (Body Mass Index). ➝ Formula: BMI = weight / (height * height)

public class CalculateBMI {
    public static void main(String[] args)
    {
        double height = 1.74; //metres
        double weight = 73; //kgs

        double BMI = weight/(height*height);

        System.out.println("The BMI is " + BMI);
    }
}
