package test.example.Javapractice.DataypesandVariables;

//Program to calculate area and perimeter of rectangle using instance varibles

public class RectangleR {

    int length;
    int width;

    RectangleR (int l, int w)       //Constructor name should always be class name
    {
        length = l;
        width = w;
    }

    int getarea(){
        return length*width;
    }

    int getperimeter(){
        return 2*(length * width);
    }



    public static void main(String[] args)
    {

        RectangleR rect = new RectangleR(20, 40);

        System.out.println("The length of the rectangle is "+rect.length);
        System.out.println("The width of the rectangle is "+rect.width);
        System.out.println("The length of the rectangle is "+rect.getarea());
        System.out.println("The length of the rectangle is "+rect.getperimeter());
    }

}
