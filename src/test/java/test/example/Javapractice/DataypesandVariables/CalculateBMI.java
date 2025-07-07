package test.example.Javapractice.DataypesandVariables;

public class CalculateBMI {
    public static void main(String[] args)
    {
        double height = 1.74;
        double weight = 73;

        double BMI = weight/(height*height);

        System.out.println("The BMI is " + BMI);
    }
}
