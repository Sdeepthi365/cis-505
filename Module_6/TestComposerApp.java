package Module_6;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.List;
import java.util.Scanner;

public class TestComposerApp { //Main class to test the Composer application 
    public static void main(String[] args) //Method to start the application 
    {
        Scanner scan = new Scanner(System.in); //Scanner object to read user input 
        MemComposerDao composerDao = new MemComposerDao(); //Create an instance of MemComposerDao to access the list of composers 
        boolean running = true; //Boolean variable to control the loop for the menu options 
        
        while(running) //Loop to display the menu options and perform actions based on user input 
        {
            displayMenu(); //Display the menu options to the user 
            int choice = scan.nextInt(); //Get the user's choice from the menu options 
            scan.nextLine(); // Consume newline 

            switch (choice) { //Switch case to perform actions based on user input 
                case 1: // View all composers 
                    List<Composer> composers = composerDao.findAll(); //Get the list of all composers 
                    composers.forEach(System.out::println); //Print each composer in the list 
                    break;
                case 2: // Find a composer by ID 
                    System.out.print("Enter Composer ID: "); //Prompt the user to enter the ID of the composer to find 
                    int id = scan.nextInt(); //Get the ID of the composer to find 
                    scan.nextLine(); // Consume newline
                    Composer composer = composerDao.findBy(id); //Find the composer by ID 
                    System.out.println((composer != null) ? composer : "Composer not found."); //Print the composer if found, otherwise print "Composer not found." 
                    break;
                case 3: // Add a new composer 
                    System.out.print("Enter Composer ID: "); //Prompt the user to enter the ID of the new composer 
                    int newId = scan.nextInt(); //Get the ID of the new composer 
                    scan.nextLine(); // Consume newline
                    System.out.print("Enter Composer Name: "); //   Prompt the user to enter the name of the new composer 
                    String name = scan.nextLine(); //Get the name of the new composer 
                    System.out.print("Enter Composer Genre: "); //Prompt the user to enter the genre of the new composer 
                    String genre = scan.nextLine(); //Get the genre of the new composer 
                    composerDao.insert(new Composer(newId, name, genre)); //Insert the new composer into the list 
                    System.out.println("Composer added successfully."); //Print success message 
                    break;
                case 4: //  Exit the application 
                    running = false; //Set the running variable to false to exit the loop 
                    System.out.println("Exiting application."); //Print exit message 
                    break;
                default: //Invalid choice 
                    System.out.println("Invalid choice. Please try again."); //Print error message for invalid choice 
            }
            
        }
        scan.close(); //Close the Scanner object to prevent resource leaks 
    }
    public static void displayMenu() //Displaying the menu options  
    {
        System.out.println("  Welcome to the Composer App"); //Print welcome message 
        System.out.println("  MENU OPTIONS"); //Print menu options 
        System.out.println("    1. View Composers"); //Print option to view all composers 
        System.out.println("    2. Find Composer"); //Print option to find a composer by ID 
        System.out.println("    3. Add Composer"); //Print option to add a new composer 
        System.out.println("    4. Exit"); //Print option to exit the application 
        System.out.println("  Please choose an option"); //Prompt the user to choose an option 
    }
    
}
