package test.example.Javapractice.OOPS.ConstructorPractice;

//Create a class Rectangle with:
//A default constructor that sets length = 1 and width = 1.
//A constructor with one parameter (sets both length and width to the same value).
//A constructor with two parameters (sets length and width separately).
//A method area() to calculate and print the area.

public class Rectangle {

    int length;
    int width;


    // 1. Default Constructor
    Rectangle()
    {
        length = 1;
        width = 1;

    }

    // 2. Parameterised Constructor with same value
    Rectangle(int side)
    {
        length = side;
        width = side;
    }

    // 3. Parameterised Constructor with length & width
    Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7);
        Rectangle r3 = new Rectangle(7,5);

        r1.area();
        r2.area();
        r3.area();

    }

}
