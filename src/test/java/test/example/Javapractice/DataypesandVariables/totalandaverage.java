package test.example.Javapractice.DataypesandVariables;

//Write a program to calculate the total and average marks of 5 subjects.

public class totalandaverage {

    int subject1;
    int subject2;
    int subject3;
    int subject4;
    int subject5;


    totalandaverage(int s1, int s2, int s3,int s4, int s5)
    {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
        subject5 = s5;

    }


    int gettotal(){
        return subject1+subject2+subject3+subject4+subject5;
    }

    int getaverage(){
        return (subject1+subject2+subject3+subject4+subject5)/5;
    }


    public static void main(String[ ] args){
        totalandaverage totandavg = new totalandaverage(10,20,30,40,50);

        System.out.println("Marks in subject1 are " + totandavg.subject1);
        System.out.println("Marks in subject2 are " + totandavg.subject2);
        System.out.println("Marks in subject3 are " + totandavg.subject3);
        System.out.println("Marks in subject4 are " + totandavg.subject4);
        System.out.println("Marks in subject5 are " + totandavg.subject5);
        System.out.println("Total of all subjects are " + totandavg.gettotal());
        System.out.println("Average of all subjects are " + totandavg.getaverage());




    }
}
