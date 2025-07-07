package test.example.Javapractice.DataypesandVariables;

public class areaofelements {
    public static void main(String [] args) {

        double radius = 7;
        double areaofcircle = Math.PI * radius * radius;


        double length = 24;
        double width = 31;
        double areaofrect = length * width;


        double base = 7;
        double height = 10;
        double areaoftri = 0.5 * base * height;

        System.out.println("The area of circle is " + areaofcircle);
        System.out.println("The area of rectangle is " + areaofrect);
        System.out.println("The area of triangle is " + areaoftri);
    }

}
