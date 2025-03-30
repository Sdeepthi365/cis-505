package Module_3.CustomerAccountApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/

public class Account //creating a class named Account
{    

    private double balance = 200; //creating a private variable balance of type double and initializing it to 200

    //Accessor method
    public double getBalance() //returns the balance of the account
    {
        return balance;
    }

    //deposit method
    public void deposit(double amt) //accepts a double value amt and adds it to the balance if amt is greater than 0
    {
        if(amt > 0) //checks if the amount is greater than 0
        {
            balance += amt; //adds the amount to the balance
        }
        
    }

    //withdraw method
    public void withdraw(double amt) //accepts a double value amt and subtracts it from the balance if the balance is greater than or equal to amt
    {
        if(balance >= amt) //checks if the balance is greater than or equal to the amount
        {
            balance -= amt; //subtracts the amount from the balance
        }
        else
        {
            System.out.println("Insufficient balance!"); //prints a message if the balance is less than the amount
        }
    }
    public void displayMenu() //displays the menu options to the user
    {
        System.out.println("  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
        System.out.println("  Enter option>: ");

    }

    public String getTransactionDate() //returns the current date in MM-dd-yyyy format
    {
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("MM-dd-yyyy"); //creating a SimpleDateFormat object with the specified format
        return formatter.format(new java.util.Date()); //  returns the current date in the specified format
    }
}

