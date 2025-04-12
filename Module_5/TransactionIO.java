package Module_5;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    //private string constant data field named FILE_NAME
    private static final String FILE_NAME  = "expenses.txt";
    
    // private File data field named file
    private static File file = new File(FILE_NAME);
    
    
        public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException //Creating a method named bulkInsert that accepts an ArrayList of Transaction objects as a parameter and throws an IOException 
        {
            PrintWriter output = null; //Creating a PrintWriter object named output and initializing it to null 
        try 
        {
            //Checking if the file exists
            if(file.exists())
            {
                output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
                //Append mode
            } 
            else
            {
                output = new PrintWriter(file);
                //This step creates a new file
            }  
            //Iterating over the transactions and writing to the file
            for(Transaction transaction: transactions)
            {
                output.println(transaction.getDate() + "," + transaction.getDescription() + "," + transaction.getAmount());
            }
        } 
        finally{
            if(output != null)
            {
                output.close(); //Closing the writer
            }
        }
        
        
        
    }

    public static ArrayList<Transaction> findAll() throws IOException //Creating a method named findAll that returns an ArrayList of Transaction objects and throws an IOException 
    {
        ArrayList<Transaction> transactions = new ArrayList<>(); //Creating an ArrayList of Transaction objects named transactions 
        File file = new File(FILE_NAME); //Creating a File object named file with the file name FILE_NAME 
        if(!file.exists()) 
        {
            return transactions; //Returning an empty list if the file does not exist
        }
        Scanner input = new Scanner(file); //Creating a Scanner object named input to read the file 
        while(input.hasNextLine()) //Looping through each line of the file 
        {
            String line = input.nextLine(); //Reading the next line of the file 
            String[] data = line.split(","); //Splitting the line into an array of strings using a comma as the delimiter 
            if (data.length == 3) { //Checking if the array has three elements 
                String date = data[0].trim(); //Getting the date from the array and trimming any whitespace 
                String description = data[1].trim(); //Getting the description from the array and trimming any whitespace 
                double amount = Double.parseDouble(data[2].trim()); //Getting the amount from the array, trimming any whitespace, and parsing it to a double 

                transactions.add(new Transaction(date, description, amount)); //Creating a new Transaction object with the date, description, and amount and adding it to the transactions list 
            }
        }
        input.close(); //Closing the Scanner object 
        return transactions; //Returning the transactions list 
    } 

}
