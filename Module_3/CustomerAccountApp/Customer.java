package Module_3.CustomerAccountApp;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
// This class represents a customer with attributes such as name, address, city, and zip code.
public class Customer { //creating a class named Customer
    private String name; //creating a private variable name of type String
    private String address; //creating a private variable address of type String
    private String city; //creating a private variable city of type String
    private String zip; //creating a private variable zip of type String

    //No Argument Constructor
    public Customer() //creating a no-argument constructor
    {
        this.name = ""; //initializing the name to an empty string
        this.address = ""; //initializing the address to an empty string 
        this.city = ""; //initializing the address to an empty string
        this.zip = ""; // 
    }
    // argument constructor
    public Customer(String name, String address, String city,String zip) //creating a constructor with parameters name, address, city and zip
    {
        this.name = name; // initializing the name with the parameter name
        this.address = address; //initializing the address with the parameter address
        this.city = city; //initializing the city with the parameter city
        this.zip = zip; //initializing the zip with the parameter zip
    }

    //Accessor Methods
    public String getName() // returns the name of the customer
    {
        return name; //returns the name of the customer
    }
    public String getAddress() //returns the address of the customer  
    {
        return address;
    }
    public String getCity() //returns the city of the customer
    {
        return city;
    }
    public String getZip() //returns the zip code of the customer
    {
        return zip;
    }

    //Overriding the toString() method
    @Override //overriding the toString() method to return a string representation of the customer object 
    public String toString() //returns a string representation of the customer object 
    {
        return "  Name: " + name + "\n" +
        "  Address: " + address + "\n" +
        "  City: " + city + "\n" +
        "  Zip: " + zip; //returns the string representation of the customer object 
    }
}



