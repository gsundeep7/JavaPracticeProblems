package test.example.Javapractice.Methods;

//**Write a method to reverse a string.**
//   * Parameter: `String str`
//   * Return type: `String`

public class ReverseofString {


    public String reversed(String name)
    {
        String rev = "";
        for(int i =name.length()-1 ;i>=0;i--)
        {
            rev = rev+ name.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        ReverseofString obj = new ReverseofString();
        String result = obj.reversed("Sundeep");
        System.out.println("Reversed string is " +result);

    }
}
