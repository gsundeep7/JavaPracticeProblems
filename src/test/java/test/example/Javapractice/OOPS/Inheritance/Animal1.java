package test.example.Javapractice.OOPS.Inheritance;

//Implement common and specific behaviors.

// Parent class
public class Animal1 {

        void eat() {
            System.out.println("Animal eats food");
        }

        void sleep() {
            System.out.println("Animal sleeps");
        }

        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class Dog
    class Dog1 extends Animal1 {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }

        void guard() {
            System.out.println("Dog guards the house");
        }
    }

    // Child class Cat
    class Cat1 extends Animal1 {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }

        void climb() {
            System.out.println("Cat climbs a tree");
        }
    }

