package test.example.Javapractice.OOPS.Inheritance;

//Access parent methods from child.
//Here we are not declaring anything as public. Hence we kept everything in single program
//This program has examples of using this and super keyword

class Animal2 {
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
class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void showParentMethods() {
        // Directly calling parent methods
        eat();      // inherited from Animal
        sleep();    // inherited from Animal

        // Calling parent version of overridden method
        super.sound(); // Animal's sound()

        // Calling child's overridden method
        this.sound();  // Dog's sound()
    }
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.showParentMethods();
    }
}
