package test.example.Javapractice.OOPS.ConstructorPractice;

//Create a class Student with:
//A default constructor (initialize name = "Unknown" and marks = 0)
//A parameterized constructor with name only
//A parameterized constructor with name and marks
//A method display() to print details.

import javax.imageio.stream.ImageInputStream;

public class Students1 {

    String name;
    int marks;

    // 1. Default Constructor
    Students1(){
        name = "Unknown";
        marks = 0;
    }

    // 2. Parameterised Constructor only name
    Students1(String n)
        {
            name = n;
            marks = 0;  // default marks
        }

    // 3. Parameterised Constructor with name and marks
    Students1(String n, int m)
        {
            name = n;
            marks = m;
        }

        void display()
        {
            System.out.println("Student name is " + name + " and marks are " + marks);
        }
    public static void main(String[] args) {
        Students1 s1 = new Students1();
        Students1 s2 = new Students1("Sundeep");
        Students1 s3 = new Students1("Mark", 77);

        s1.display();
        s2.display();
        s3.display();

    }
}
