package test.example.Javapractice.ArrayList;

//**Create an ArrayList of custom objects (e.g., Students with `name`, `id`) and print names of all students.**

import java.util.ArrayList;

class Student{
    String name;
    int id;


    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}



public class StudentsList {


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Tywin",1));
        students.add(new Student("Tyrion",2));
        students.add(new Student("Jamie",3));
        students.add(new Student("Cersie",4));

        System.out.println("Student names are: ");

        for(Student s: students)
        {
            System.out.println(s.name);
        }

    }
}
