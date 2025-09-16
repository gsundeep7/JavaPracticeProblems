package test.example.Javapractice.OOPS.Polymorphism;

//Example Project: Create a Vehicle class with child classes Car, Bike. Each should have constructors,
// methods, overridden methods like move(). Create objects and demonstrate polymorphism.

// Parent Class
public class Vehicle {
        String brand;
        int speed;

        // Constructor
        Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        void move() {
            System.out.println(brand + " vehicle is moving at speed " + speed + " km/h");
        }

        // Overloaded method (compile-time polymorphism)
        void displayDetails() {
            System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
        }

        void displayDetails(String owner) {
            System.out.println("Owner: " + owner + ", Brand: " + brand + ", Speed: " + speed + " km/h");
        }
    }

    // Child Class 1
    class Car extends Vehicle {
        int doors;

        Car(String brand, int speed, int doors) {
            super(brand, speed);
            this.doors = doors;
        }

        @Override
        void move() {
            System.out.println(brand + " car is driving smoothly at " + speed + " km/h with " + doors + " doors.");
        }
    }

    // Child Class 2
    class Bike extends Vehicle {
        boolean hasGear;

        Bike(String brand, int speed, boolean hasGear) {
            super(brand, speed);
            this.hasGear = hasGear;
        }

        @Override
        void move() {
            System.out.println(brand + " bike is running at " + speed + " km/h. Gear available: " + hasGear);
        }

}
