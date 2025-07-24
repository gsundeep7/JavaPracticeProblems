package test.example.Javapractice.Methods;

//Write a method that takes a name as input and prints "Hello, \[name]!"**
//   * Parameter: `String name`
//   * Return type: `void`

public class PrintName {

    public void sayHello(String name){
        System.out.println("Hello, " + name + " !");
    }

    public static void main(String[] args) {

        PrintName obj = new PrintName();
        obj.sayHello("Sundeep");
    }
}
