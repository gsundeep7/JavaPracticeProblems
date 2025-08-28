package test.example.Javapractice.OOPS.ConstructorPractice;

//Create a class Car with:
//A default constructor that sets brand = "Unknown" and color = "White".
//A constructor with only brand.
//A constructor with brand and color.
//A method display() to show car details.

public class Car {

    String brand;
    String color;


    // 1. Default Constructor
    Car()
    {
        brand = "Unknown";
        color = "White";
    }

    // 2. Parameterised Constructor with only brand
    Car(String b)
    {
        brand = b;
        color = "Black";
    }

    // 3. Parameterised Constructor with brand and color
    Car(String b, String c)
    {
        brand = b;
        color = c;
    }

    void display()
    {
        System.out.println("Brand is " + brand + " and color is " + color);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Hyundai");
        Car c3 = new Car("Audi","Green");

        c1.display();
        c2.display();
        c3.display();
    }

}
