package Module_3.CustomerAccountApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.Scanner; //importing the Scanner class from the java.util package 

public class TestCustomerAccountApp { //creating a class named TestCustomerAccountApp 
    public static void main(String[] args) //main method 
    {
        Scanner scan = new Scanner(System.in); //creating a Scanner object to read input from the user 
        System.out.println("Welcome to the Customer Account App"); //prints a welcome message 
        
        System.out.println("Enter a Customer Number between 1007 to 1009"); //prints a message to enter a customer number between 1007 to 1009 
        int customerNumber = scan.nextInt(); //accepts an integer input from the user 
        scan.nextLine(); // consumes the newline character left by nextInt() 

        Customer customer = CustomerDB.getCustomer(customerNumber); //  calls the getCustomer method of the CustomerDB class to get a Customer object based on the customer number entered by the user 
        Account account = new Account(); //creating a new Account object 
        String choice; //creating a String variable choice to store the user's choice 
        do{ // starts a do-while loop 
            account.displayMenu(); //displays the menu options to the user 
            choice = scan.nextLine(); //accepts a String input from the user 

            switch(choice.toLowerCase()) //converts the choice to lowercase and checks the value of choice 
            {
                case "d": //case "D": //checks if the choice is d or D 
                    System.out.println("  Enter deposit amount:"); // prints a message to enter the deposit amount 
                    double depositAmount = scan.nextDouble(); //accepts a double input from the user 
                    scan.nextLine(); //consumes the newline character left by nextDouble() 
                    account.deposit(depositAmount); // calls the deposit method of the Account class to deposit the amount entered by the user 
                break; // breaks out of the switch statement 
                case "w": //case "W": //checks if the choice is w or W 
                    System.out.println("  Enter withdrawal amount:"); // prints a message to enter the withdrawal amount 
                    double withdrawalAmount = scan.nextDouble(); //accepts a double input from the user 
                    scan.nextLine(); //consumes the newline character left by nextDouble() 
                    account.withdraw(withdrawalAmount); // calls the withdraw method of the Account class to withdraw the amount entered by the user 
                break; //breaks out of the switch statement 
                case "b": //case "B": //checks if the choice is b or B 
                    System.out.printf("  Current Balance is $%,6.2f\n", account.getBalance()); //prints the current balance in a formatted manner 
                    break; //breaks out of the switch statement 
                default: // default case 
                    System.out.println("  Error: Invalid option");  //prints an error message if the user enters an invalid option 
            }
            System.out.println("  Continue? (y/n): "); //prints a message to continue or not 
            choice = scan.nextLine(); //accepts a String input from the user 
        }while(choice.equalsIgnoreCase("y")); //ends the do-while loop if the user enters y or Y 

        System.out.println("  Customer Details"); // prints a message to display the customer details 
        System.out.println(customer.toString()); //prints the customer details by calling the toString() method of the Customer class 
        System.out.println("  Balance as of " + account.getTransactionDate() + " is "+ account.getBalance());  //prints the balance as of the current date by calling the getTransactionDate() method of the Account class 
        System.out.println("Enf of line..."); // prints a message to indicate the end of the program
        scan.close(); //closes the Scanner object 
    } 
}