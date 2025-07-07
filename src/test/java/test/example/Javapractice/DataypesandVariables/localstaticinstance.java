package test.example.Javapractice.DataypesandVariables;

public class localstaticinstance {

    String s = "Sundeep";
    static String company = "Testitute";

    public void local1()
    {
        int age= 27;
        System.out.println("The name of instance variable is " + s);
        System.out.println("The name of static variable is " + company);
        System.out.println("The value of local variable is " + age);
    }

    public static void main(String[] args)
    {
        localstaticinstance example = new localstaticinstance();
        example.local1();
    }

}
