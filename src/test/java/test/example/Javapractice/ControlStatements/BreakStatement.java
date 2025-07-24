package test.example.Javapractice.ControlStatements;

//Jump Statements -- 	Print numbers from 1 to 10 but stop when number is 6 (use break).

public class BreakStatement {

    public static void main(String[] args) {

        for(int i= 1; i<=10; i++)
        {
            if(i==6)
            {
                break;
            }
            System.out.println(i);
        }




    }
}
