package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.Scanner; 

public class TestBowlingShopApp { //Test class for the Bowling Shop application
    public static void main(String[] args) //Main method to run the application
    {
        Scanner scan = new Scanner(System.in); //Scanner object to read user input 
        String choice; //Variable to store user choice 
        System.out.println("Welcome to the Bowling Shop"); //Welcome message 
        do{ //Display menu and prompt user for choice 
            displayMenu(); //Display menu method 
            System.out.println("  Please choose an option:"); //Prompt user for choice 
            choice = scan.nextLine().toLowerCase(); //Read user input and convert to lowercase 
            GenericQueue<Product> products = ProductDB.getProducts(choice); //Get products based on user choice 
            if(products.size() > 0) //If products are available for the chosen category 
            {
                System.out.println("\n Product List:");
                while(products.size() > 0) //While there are products in the queue 
                {
                    Product product = products.dequeue(); //Dequeue product from the queue 
                    System.out.println(product); //Display product details 
                }
                
            }
            else if(choice.equals("x")) //If user chooses to exit
            {
                System.out.println("\n Product List:"); //Display product list header 
                while(products.size() > 0) //While there are products in the queue 
                {
                    Product product = products.dequeue(); //Dequeue product from the queue 
                    System.out.println(product); //Display product details 
                } 
                {
                    Product product = products.dequeue(); //Dequeue product from the queue
                    System.out.println(product); //Display product details 
                }
                
            }
            else if(!choice.equals("x")) //If user enters an invalid choice 
            {
                System.out.println("Invalid choice!"); //Display invalid choice message 
            } 
        }while(!choice.equals("x")); //Repeat until user chooses to exit 
        scan.close(); //Close scanner object 
    }
    public static void displayMenu() //Display menu method  
    {
        //Menu Display
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> To exit"); 
        
    }
}
