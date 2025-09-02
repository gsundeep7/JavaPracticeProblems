package test.example.Javapractice.OOPS.Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Dog();    //Polymorphism
        Animal a2 = new Cat();

        a1.sound();

        a2.sound();
    }

}
