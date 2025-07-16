package test.example.Javapractice.ControlStatements;

//Jump Statement --	Print numbers from 1 to 10 but skip multiples of 3 (use continue).

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i = 1; i<=10; i++)
        {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
