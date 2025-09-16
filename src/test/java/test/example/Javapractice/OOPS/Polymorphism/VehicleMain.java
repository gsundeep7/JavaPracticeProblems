package test.example.Javapractice.OOPS.Polymorphism;


// Main Class
public class VehicleMain {
        public static void main(String[] args) {
            // Parent reference, child objects → Runtime Polymorphism
            Vehicle v1 = new Car("Toyota", 120, 4);
            Vehicle v2 = new Bike("Yamaha", 80, true);

            // Runtime polymorphism: method call decided at runtime
            v1.move();
            v2.move();

            // Compile-time polymorphism: method overloading
            v1.displayDetails();
            v2.displayDetails("John");
        }
}
