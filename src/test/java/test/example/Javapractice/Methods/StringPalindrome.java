package test.example.Javapractice.Methods;

//**Write a method to check whether a given string is a palindrome.**
//    * Parameter: `String str`
//    * Return type: `boolean`

import test.example.Javapractice.ControlStatements.Palindrome;

public class StringPalindrome {

    public boolean Palindrome(String name)
    {
        int length = name.length();
        for(int i = 0; i<length/2; i++)   //loop checking to half of string, no need to check full string
        {
            if (name.charAt(i) != name.charAt(length - 1 - i)) {
                return false;
            }
        }
        return  true;


    }

    public static void main(String[] args) {
        StringPalindrome obj = new StringPalindrome();
        boolean result = obj.Palindrome("racecar");
        System.out.println("The given string is a palindrome - "+result);


    }




}
