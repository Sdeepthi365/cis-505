package Module_5;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction { //creating a class named Transaction 
    //Private Data fields date, description, and amount
   private String date;
    private String description;
    private double amount;

    //No Argument Constructor
    public Transaction()
    { 
        this.date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        this.description = "";
        this.amount = 0.0; 
        //creating a no-argument constructor that initializes the date to the current date, description to an empty string, and amount to 0.0 
    }

    //Argument Constructor
    public Transaction(String date,String description, double amount)
    {
        this.date = date;
        this.description = description;
        this.amount = amount;
        //creating a constructor that accepts three parameters: date, description, and amount and assigns them to the instance variables date, description, and amount respectively
    }
    //Accessor Methods
    public String getDate()
    {
        return date; //returns the date of the transaction 
    }
    public String getDescription()
    {
        return description; //returns the description of the transaction 
    }
    public double getAmount()
    {
        return amount; //returns the amount of the transaction 
    }

    //Mutator Methods
    public void setDate(String date)
    {
       this.date = date;  //accepts a String value date and assigns it to the instance variable date 
    }
    public void setDescription(String description)
    {
       this.description = description; //accepts a String value description and assigns it to the instance variable description  
    }
    public void setAmount(double amount)
    {
        this.amount = amount;   //accepts a double value amount and assigns it to the instance variable amount 
    }

    //Override the toString() method, returning the description of the transaction with all three data fields, in separate line
    @Override
    public String toString() //returns a string representation of the Transaction object 
    {
        return "  Date: " + date + "\n" +
        "  Description: " + description + "\n" +
        "  Amount: $" + String.format("%.2f",amount); //returns the string representation of the Transaction object with the date, description, and amount formatted to two decimal places 
    }
}
