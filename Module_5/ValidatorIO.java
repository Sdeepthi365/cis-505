package Module_5;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.Scanner;

public class ValidatorIO { //creating a class named ValidatorIO 
    public static int getInt(Scanner sc, String prompt) //  Creating a method named getInt that accepts a Scanner object and a String prompt as parameters 
    {
        int input = 0; //creating an integer variable named input and initializing it to 0 
        boolean isValid = false; //creating a boolean variable named isValid and initializing it to false 

        while(!isValid) //looping until the user enters a valid integer value 
        {
            System.out.println(prompt); //prompting the user to enter an integer value 
            if(sc.hasNextInt()) //checking if the user has entered an integer value 
            {
                input = sc.nextInt(); //getting the integer value entered by the user 
                isValid = true; //setting the isValid variable to true 
            }
            else 
            {
                System.out.println("Error! Invalid integer value."); //displaying an error message if the user enters an invalid integer value 
            }
        }

        return input; //returning the integer value entered by the user 
    }
    
    public static double getDouble(Scanner sc, String prompt) //Creating a method named getDouble that accepts a Scanner object and a String prompt as parameters 
    {
        double input = 0.0; //creating a double variable named input and initializing it to 0.0 
        boolean isValid = false; //creating a boolean variable named isValid and initializing it to false 

        while(!isValid) //looping until the user enters a valid double value 
        {
            System.out.println(prompt); //prompting the user to enter a double value 
            if(sc.hasNextDouble()) //checking if the user has entered a double value 
            {
                input = sc.nextDouble(); //getting the double value entered by the user 
                isValid = true; //setting the isValid variable to true 
            }
            else
            {
                System.out.println("Error! Invalid integer value."); //displaying an error message if the user enters an invalid double value 
            }
        }

        return input; //returning the double value entered by the user 
    }

    public static String getString(Scanner sc, String prompt) //Creating a method named getString that accepts a Scanner object and a String prompt as parameters 
    {
        String input = ""; //creating a String variable named input and initializing it to an empty string 
        boolean isValid = false; //creating a boolean variable named isValid and initializing it to false 

        while(!isValid) //looping until the user enters a valid string value 
        {
            System.out.println(prompt); //prompting the user to enter a string value 
            if(sc.hasNext()) //checking if the user has entered a string value 
            {
                input = sc.next(); //getting the string value entered by the user 
                isValid = true; //setting the isValid variable to true 
            }
            else
            {
                System.out.println("Error! Invalid integer value."); //displaying an error message if the user enters an invalid string value 
            }
        }

        return input; // returning the string value entered by the user 
    }
    
}
