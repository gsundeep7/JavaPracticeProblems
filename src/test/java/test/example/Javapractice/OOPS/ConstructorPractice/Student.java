package test.example.Javapractice.OOPS.ConstructorPractice;

//Create a class Student with a default constructor to initialize name and marks.

public class Student {

        String name;
        int marks;


        Student(){
            name = "Sundeep";       //assigning default values
            marks = 77;             //assigning default values

        }

        void display()
        {
            System.out.println("The name of the student is " + name + " and he secured " + marks + " marks");
        }


    public static void main(String[] args) {
            Student s1 = new Student();
            s1.display();


    }
}
