package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String choice;
        System.out.println("Welcome to the Bowling Shop");
        do{
            displayMenu();
            System.out.println("  Please choose an option:");
            choice = scan.nextLine().toLowerCase();
            GenericQueue<Product> products = ProductDB.getProducts(choice);
            if(products.size() > 0)
            {
                System.out.println("\n Product List:");
                while(products.size() > 0)
                {
                    Product product = products.dequeue();
                    System.out.println(product);
                }
                
            }
            else if(!choice.equals("x"))
            {
                System.out.println("Invalid choice!");
            }
        }while(!choice.equals("x"));
        scan.close();
    }
    public static void displayMenu()
    {
        //Menu Display
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> To exit");
        
    }
}
