package test.example.Javapractice.Arrays;

//Find the maximum and minimum element in an array

public class MaxandMin {

    public static void main(String[] args) {


    int [] arr = {10,20,30,40,50};

    int max = arr[0];
    int min = arr[0];

    for(int i = 1; i<arr.length; i++)
    {
        if(arr[i]>max)
        {
            max = arr[i];
        }

        if(arr[i] < min)
        {
            min = arr[i];
        }
    }

        System.out.println("Max of the array is "+max +" Min of the array is "+min);

    }

}
