package test.example.Javapractice.Methods;

// **Create a method that counts the number of vowels in a string.**
//    * Parameter: `String input`
//    * Return type: `int`

public class Numberofvowels {

    public int countofvowels(String name)
    {
        int count = 0;

        for(int i =0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Numberofvowels obj = new Numberofvowels();
        int result = obj.countofvowels("Sundeep is great");
        System.out.println("The number of vowels in the string are "+result);
    }
}
