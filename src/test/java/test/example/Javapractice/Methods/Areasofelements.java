package test.example.Javapractice.Methods;

//**Create overloaded methods for calculating area:**

//* `area(int side)` → for square
//* `area(int length, int breadth)` → for rectangle
//* `area(double radius)` → for circle

import java.sql.SQLOutput;

public class Areasofelements {

    public int square(int side)
    {
        return side*side;
    }

    public int square(int length, int breadth)
    {
        return length*breadth;
    }

    public double square(double radius)
    {
        return Math.PI*(radius*radius);
    }

    public static void main(String[] args) {
        Areasofelements obj = new Areasofelements();
        //int areaofsquare = obj.square(7);
        //int areaofrect = obj.square(10,20);
        //double areaofcircle = obj.square(20);
        //System.out.println("Area of square is "+areaofsquare);
        //System.out.println("Area of rectangle is "+areaofrect);
        //System.out.println("Area of circle is "+areaofcircle);


        System.out.println("Area of square is "+obj.square(7));
        System.out.println("Area of rect is "+obj.square(10,20));
        System.out.println("Area of circle is "+obj.square(15.0));


    }


}
