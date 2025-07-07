package test.example.Javapractice.DataypesandVariables;


public class secondsintominutesandhours {

    public static void main(String[] args) {

        int totalseconds = 38000;
        int hours = totalseconds/3600;
        int minutes = (totalseconds%3600)/60;
        int seconds = totalseconds % 60;


        System.out.println("Total hours entered " + totalseconds);
        System.out.println("Total time after conversion is " + hours + " hours " + minutes + " minutes and " + seconds + " seconds");

    }
}
