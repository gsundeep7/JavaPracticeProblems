package test.example.Javapractice.OOPS.ConstructorPractice;

//Create a class BankAccount with:
//A default constructor that initializes balance = 0.
//A constructor with only account number.
//A constructor with account number and initial balance.
//A method display() to print details.

public class BankAccount {

    double balance;
    int accountnumber;

    // 1. Default Constructor
    BankAccount()
    {
        accountnumber = 0;
        balance = 0.0;
    }

    // 2. Parameterised Constructor with only account number
    BankAccount(int accnum)
    {
        accountnumber = accnum;
        balance = 0.0;
    }

    // 3. Parameterised Constructor with account number and initial balance
    BankAccount(double intialbalance, int accnum)
    {
        balance = intialbalance;
        accountnumber = accnum;
    }

    void display()
    {
        System.out.println("Balance for account number " + accountnumber + " is " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(12345);
        BankAccount b3 = new BankAccount(7729.97, 78907);

        b1.display();
        b2.display();
        b3.display();
    }

}
