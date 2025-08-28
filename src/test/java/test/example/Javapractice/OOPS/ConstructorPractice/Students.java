package test.example.Javapractice.OOPS.ConstructorPractice;

//Create multiple students using parameterized constructor.

public class Students {

    String name;
    int marks;

    Students(String n, int m)
    {
        name = n;
        marks = m;
    }

    void display()
    {
        System.out.println("Student name is " + name + " and marks are " + marks);
    }


    public static void main(String[] args) {
        Students s1 = new Students("Sundeep", 77);
        Students s2 = new Students("James", 15);
        Students s3 = new Students("Bond", 62);
        Students s4 = new Students("John", 66);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
