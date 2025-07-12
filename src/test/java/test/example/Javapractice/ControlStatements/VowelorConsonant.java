package test.example.Javapractice.ControlStatements;

// Conditional Statements  -- Check if a character is a vowel or consonant.

public class VowelorConsonant {
    public static void main(String[] args) {
        char ch = 'I';
        ch = Character.toLowerCase(ch); //converting char to lower case for comparision

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Entered chat is vowel");
        } else {
            System.out.println("Enter char is consonant");
        }

    }
}
