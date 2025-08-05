package test.example.Javapractice.Arrays;

//**Copy one array into another array**

public class CopyArraytoanother {

    public static void main(String[] args) {

        //declare original array
        int [] original = {10, 20, 30, 40, 50};

        //initialize copy array
        int [] copy = new int[original.length];

        //copying elements from original to copy using for loop
        for(int i = 0; i<original.length; i++)
        {
            copy[i] = original[i];

        }


        //Print original array
        System.out.print("The elements in original array are :" );
        for (int a = 0; a<original.length; a++)
        {
            System.out.print(original[a] + " ");
        }

        System.out.println();   //line break

        //Print copied array
        System.out.print("The elements of copied array are :");
        for(int b=0; b<copy.length; b++)
        {
            System.out.print(copy[b] + " ");
        }


    }
}
