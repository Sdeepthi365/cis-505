package Module_3.CustomerAccountApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class CustomerDB //creating a class named CustomerDB 
{
    public static Customer getCustomer(int id) //accepts an integer id and returns a Customer object based on the id 
    {
        if(id == 1007) //checks if the id is 1007 
        {
            return new Customer("John Doe", "123 Main St", "Springfield", "12345"); //returns a new Customer object with the specified parameters 
        }
        else if(id == 1008) //checks if the id is 1008 
        {
            return new Customer("Jane Smith", "456 Oak Ave", "Rivertown", "67890"); // returns a new Customer object with the specified parameters 
        }
        else if(id == 1009) //checks if the id is 1009 
        {
            return new Customer("Sam Johnson", "789 Pine Rd", "Lakeside", "11223"); // returns a new Customer object with the specified parameters 
        }
        else
        {
            return new Customer(); //returns a new Customer object with default values 
        }
    }
}
