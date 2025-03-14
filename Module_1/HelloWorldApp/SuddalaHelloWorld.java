package Module_1.HelloWorldApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/

public class SuddalaHelloWorld
{
    /** 
    * Method with two arguments, used to print Hello World from the firstname Deepthi and the lastname Suddala
    * @param firstName String
    * @param lastName String
    * @return prints the results to the console window.
    */
    public static void helloworld(String firstName, String lastName)
    {
        System.out.print(String.format("Hello World from %s %s", firstName, lastName));
    } //end helloWorld
    public static void main(String[] args)
    {
        helloworld("Deepthi","Suddala"); //Call helloWorld method with the values "Deepthi" and "Suddala"
    } //end main
} //end SuddalaHelloWorld
