package test.example.Javapractice.Methods;

//*Create a method that checks if a number is even or odd.**
//   * Parameter: `int number`
//   * Return type: `String` (return "Even" or "Odd")

public class EvenorOdd {

    public String check(int num)
    {
        if(num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        EvenorOdd obj = new EvenorOdd();
        String result = obj.check(24);
        System.out.println("The given number is " + result);
    }
}
