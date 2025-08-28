package test.example.Javapractice.OOPS;

//Create a class Car with properties like brand, color, and methods like drive() and brake().

import java.sql.SQLOutput;

public class Car {

    //Instance variables
    String brand;
    String color;

    //Creating drive method
    void drive()
    {
        System.out.println("The " + brand + " car of " + color + " color is driving");
    }

    //Creating brake method
    void brake()
    {
        System.out.println("The " + brand + " car of " + color + " color is stopped");
    }


    public static void main(String[] args) {

        //Creating first object
        Car car1 = new Car();
        car1.brand = "Hyundai";
        car1.color = "White";

        //Creating second object
        Car car2 = new Car();
        car2.brand = "Mahindra";
        car2.color = "Black";

        //Access methods for each object
        car1.drive();
        car1.brake();

        car2.drive();
        car2.brake();
        }

}
