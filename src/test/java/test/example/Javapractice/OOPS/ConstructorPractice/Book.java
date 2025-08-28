package test.example.Javapractice.OOPS.ConstructorPractice;

//Create a class Book with:
//A default constructor that sets title = "No Title", price = 0.
//A constructor with only title.
//A constructor with title and price.
//A method display() to print book details.

public class Book {

    String title;
    int price;


    // 1. Default Constructor
    Book()
    {
        title = "No Title";
        price = 40;
    }

    // 2. Parameterised Constructor with only title
    Book(String t)
    {
        title = t;
        price = 50;
    }

    // 3. Parameterised Constructor with brand and color
    Book(String t, int pri)
    {
        title = t;
        price = pri;
    }

    void display()
    {
        System.out.println("Title of the book is " + title + " and price is " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Discipline");
        Book b3 = new Book("Procastination",170);

        b1.display();
        b2.display();
        b3.display();
    }
}
