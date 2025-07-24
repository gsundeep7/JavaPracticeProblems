package test.example.Javapractice.Methods;

//Write a method that returns the maximum of three numbers.**
//   * Parameters: `int a, int b, int c`
//   * Return type: `int`

public class Maxofthree {

    public int check(int a, int b, int c){
        int max;
        if(a>b && a>c){
            max = a;
        }
        else if(b>a && b>c)
        {
            max = b;
        }
        else {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Maxofthree obj = new Maxofthree();
        int result = obj.check(44,55,66);
        System.out.println("The max of 3 numbers is " + result);
    }

}
