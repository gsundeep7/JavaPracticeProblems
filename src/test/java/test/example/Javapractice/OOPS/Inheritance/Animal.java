package test.example.Javapractice.OOPS.Inheritance;

//Create a parent class Animal and child classes like Dog, Cat.

//We can create 4 seperate classes - 1.Animal, 2.Dog, 3.Cat, 4.Main or we can have everything in a single program
//For small practice programs → keep everything in one file (easy & quick).
//For bigger projects / interviews / industry practice → separate into multiple files (cleaner, scalable).

public class Animal {

    void eat()
    {
        System.out.println("Animal is eating");
    }

    void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    void sound()
    {
        System.out.println("Animal is making sound");
    }
}
