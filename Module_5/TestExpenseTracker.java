package Module_5;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker { //creating a class named TestExpenseTracker
    public static void main(String[] args) throws IOException //Main method
    {
        Scanner scan = new Scanner(System.in); //creating a Scanner object named scan to read input from the user 
        boolean continueProgram = true; //creating a boolean variable named continueProgram and initializing it to true 
        while(continueProgram) //looping until the user chooses to exit the program 
        {
            displayMenu(); //displaying the menu options to the user 
            int choice = ValidatorIO.getInt(scan, "Please choose an option"); //getting the user's choice from the menu options 
            switch(choice) //Switch case
            {
                case 1:
                    viewTransactions(); //viewing the transactions made by the user
                    break;
                case 2: 
                    addTransactions(scan); //  adding transactions made by the user 
                    break;
                case 3:
                    viewTotalExpenses(); //viewing the total expenses made by the user 
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using Expense Tracker!");
                    continueProgram = false; //exiting the program 
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4."); //displaying an error message if the user enters an invalid choice 
            }
            if (continueProgram) { //if the user chooses to continue the program 
                System.out.print("\nWould you like to return to the main menu? (yes/no): "); //prompting the user to return to the main menu 
                String response = scan.next().trim().toLowerCase(); //getting the user's response 
                if (!response.equals("yes")) { //if the user does not want to return to the main menu 
                    continueProgram = false; //setting the continueProgram variable to false 
                    System.out.println("Exiting... Thank you for using Expense Tracker!"); //exiting the program 
                }
            }
        }
        scan.close(); //closing the Scanner object 
        
    }
    public static void displayMenu() //Displaying the menu options 
    {
        System.out.println("  Welcome to the Expense Tracker");
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. View Transactions");
        System.out.println("    2. Add Transactions");
        System.out.println("    3. View Expense");
    }
    private static void viewTransactions() throws IOException { //Viewing the transactions made by the user 
        ArrayList<Transaction> transactions = TransactionIO.findAll(); //finding all the transactions made by the user 
        if (transactions.isEmpty()) { //checking if the transactions list is empty 
            System.out.println("\nNo transactions found."); //if the transactions list is empty 
        } else { //if the transactions list is not empty 
            System.out.println("\nTransaction History:"); //displaying the transaction history 
            for (Transaction t : transactions) { //looping through each transaction in the transactions list 
                System.out.printf("  Date: %s%n  Description: %s%n  Amount: $%,6.2f%n%n",
                        t.getDate(), t.getDescription(), t.getAmount()); //displaying the transaction details 
            }
        }
    }
    private static void addTransactions(Scanner sc) throws IOException { //Adding transactions made by the user 
        boolean addMore = true; //creating a boolean variable named addMore and initializing it to true 
        ArrayList<Transaction> transactions = new ArrayList<>(); // creating an ArrayList of Transaction objects named transactions 

        while (addMore) { //looping until the user chooses to stop adding transactions 
            System.out.println("\nEnter Transaction Details:"); //prompting the user to enter the transaction details 
            String date = ValidatorIO.getString(sc, "Enter Date (MM-DD-YYYY): "); //getting the date of the transaction 
            String description = ValidatorIO.getString(sc, "Enter Description: "); //getting the description of the transaction 
            double amount = ValidatorIO.getDouble(sc, "Enter Amount: "); //getting the amount of the transaction 

            transactions.add(new Transaction(date, description, amount)); //creating a new Transaction object with the entered details and adding it to the transactions list 

            System.out.print("\nWould you like to add another transaction? (yes/no): "); //prompting the user to add another transaction 
            String response = sc.next().trim().toLowerCase(); //getting the user's response 
            addMore = response.equals("yes"); //if the user wants to add another transaction 
        }
 
        TransactionIO.bulkInsert(transactions); //saving the transactions to the file 
        System.out.println("Transactions saved successfully!"); //displaying a success message 
    }

    private static void viewTotalExpenses() throws IOException { //Viewing the total expenses made by the user 
        ArrayList<Transaction> transactions = TransactionIO.findAll(); //finding all the transactions made by the user 
        double totalExpense = 0.0; //creating a variable named totalExpense and initializing it to 0.0 

        for (Transaction t : transactions) { //looping through each transaction in the transactions list 
            totalExpense += t.getAmount(); //adding the amount of each transaction to the totalExpense variable 
        }

        System.out.printf("\nTotal Expenses: $%,6.2f%n", totalExpense); //displaying the total expenses made by the user 
    }


}

