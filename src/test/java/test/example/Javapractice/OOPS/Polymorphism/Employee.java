package test.example.Javapractice.OOPS.Polymorphism;

//Create a class hierarchy like Employee → Manager, Developer.

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working as an employee.");
    }

    // Compile-time Polymorphism (Overloaded method)
    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    void displayDetails(String department) {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }
}

// Child Class 1
class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(name + " is managing a team of " + teamSize + " people.");
    }
}

// Child Class 2
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}
