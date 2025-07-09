package test.example.Javapractice.OpertorsandExpressions;

//Accept 5 subject marks, calculate percentage, and print grade using expressions and conditions.

public class Percentage {

    public static void main(String[] args) {

        int sub1 = 81;
        int sub2 = 98;
        int sub3 = 86;
        int sub4 = 89;
        int sub5 = 99;
        int total = sub1+ sub2+sub3+sub4+sub5;
        String grade;

        float percentage = total/5f;

        if(percentage>90){
            grade = "A+";
        }
        else if (percentage>80 && percentage<90){
            grade = "A";
        }
        else if (percentage>70 && percentage<80){
            grade = "B";
        }
        else if (percentage>60 && percentage<70){
            grade = "C";
        }
        else if (percentage>50 && percentage<60){
            grade = "D";
        }

        else if (percentage>40 && percentage<50){
            grade = "E";
        }
        else{
            grade = "f";
        }

        System.out.println("Total marks obtained are " +total);
        System.out.println("Percentage gained is " +percentage);
        System.out.println("Grade acquired is " +grade);
    }
}
