package test.example.Javapractice.Arrays;

//**Sort an array in ascending and descending order**
//   * Without using built-in methods

public class AscandDesc {
    public static void main(String[] args) {


        int[] arr = {10, 30, 70, 20, 55};

        //Print Original array
        System.out.print("Original array is : ");
        for(int a: arr)
        {
            System.out.print(a + " ");
        }

        System.out.println();

        //Sort in ascending order
        for (int i = 0; i < arr.length -1; i++)
        {
            for(int j = 0; j<arr.length-1-i; j++)
            {
                if( arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Ascending order of array is : ");

        for(int num:arr)
        {
            System.out.print(num + " ");
        }


        System.out.println();
        //Sorting in descending order

        for(int i1 = 0; i1<arr.length-1; i1++)
        {
            for(int j1 = 0; j1 < arr.length - 1 - i1; j1++)
            {
                if (arr[j1]<arr[j1+1])
                {
                    int temp1 = arr[j1];
                    arr[j1] = arr[j1+1];
                    arr[j1+1] = temp1;
                }
            }
        }

        System.out.print("Descending order or arrays is :");
        for(int num1: arr)
        {
            System.out.print(num1+ " ");
        }


    }
}
