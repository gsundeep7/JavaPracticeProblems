package test.example.Javapractice.DataypesandVariables;

public class mintuestohoursminutes {

    public static void main(String [] args)
    {
        int totalminutes = 150;

        int hours = totalminutes/60;

        int  minutes = totalminutes%60;

        System.out.println("The minutes entered are " + totalminutes);
        System.out.println("After converting the minutes into hours and minutes, the result is " + hours + " hours and " +minutes + " minutes");


    }



}
