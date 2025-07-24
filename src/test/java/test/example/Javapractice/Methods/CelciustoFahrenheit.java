package test.example.Javapractice.Methods;

//Create a method to convert temperature from Celsius to Fahrenheit.**
//    * Parameter: `double celsius`
//    * Return type: `double`

public class CelciustoFahrenheit {

    public  double check(double cel)
    {
        double fah;
        fah = (cel*9/5) + 32;

        return fah;
    }

    public static void main(String[] args) {

        CelciustoFahrenheit obj = new CelciustoFahrenheit();
        double result = obj.check(77);
        System.out.println("The value of Celcius to Fah is "+ result);
    }
}
