package test.example.Javapractice.Methods;

//Create a method to add two numbers and return the result.**
//   * Parameters: `int a, int b`
//   * Return type: `int`

public class AdditionofTwo {

    public int addition(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        AdditionofTwo obj = new AdditionofTwo();
        int result = obj.addition(5,7);
        System.out.println("Addition of two numbers is " + result);
    }
}
