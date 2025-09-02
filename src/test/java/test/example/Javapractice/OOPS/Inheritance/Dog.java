package test.example.Javapractice.OOPS.Inheritance;

public class Dog extends Animal{

    @Override
    void sound()
    {
        System.out.println("Dog is barking");
    }
    void guard()
    {
        System.out.println("Dog is guarding");
    }

}
