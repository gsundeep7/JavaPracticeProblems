package test.example.Javapractice.OOPS.Polymorphism;

// Main Class
public class EmployeeMain {
    public static void main(String[] args) {
        // Parent reference, child object → Runtime Polymorphism
        Employee e1 = new Manager("Alice", 90000, 5);
        Employee e2 = new Developer("Bob", 80000, "Java");

        // Runtime Polymorphism (calls overridden methods)
        e1.work();
        e2.work();

        // Compile-time Polymorphism (overloading)
        e1.displayDetails();
        e2.displayDetails("IT Department");
    }
}
