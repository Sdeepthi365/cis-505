package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class Product { //creating a class named Product 
    private String code; //creating a private variable code of type String 
    private String description; //creating a private variable description of type String 
    private double price; //creating a private variable price of type double 

    //No Argument Constructor
    public Product() //creating a no-argument constructor 
    {
        this.code = ""; //initializing the code to an empty string
        this.description = ""; //initializing the description to an empty string
        this.price = 0.0; //initializing the price to 0.0
    }
    
    //Argument Constructor
    public Product(String code, String description, double price) //creating a constructor that accepts three parameters: code, description, and price
  
    {
        this.code = code; //assigns the value of code to the instance variable code 
        this.description = description; // assigns the value of description to the instance variable description 
        this.price = price; //assigns the value of price to the instance variable price 
    }

    //Accessor Methods
    public String getCode() //returns the code of the product 
    {
        return code; //returns the code of the product 
    }
    public String getDescription() //returns the description of the product 
    {
        return description; //returns the description of the product 
    }
    public double getPrice() //returns the price of the product 
    {
        return price; //returns the price of the product 
    }

    //Mutator Methods
    public void setCode(String code) // accepts a String value code and assigns it to the instance variable code 
    {
        this.code = code; //assigns the value of code to the instance variable code 
    }
    
    public void setDescription(String description) //accepts a String value description and assigns it to the instance variable description 
    {
        this.description = description; //assigns the value of description to the instance variable description 
    }
    public void setPrice(double price) //accepts a double value price and assigns it to the instance variable price 
    {
        this.price = price; //assigns the value of price to the instance variable price 
    }

    //Override the toString method
    @Override
    public String toString() //returns a string representation of the Product object 
    {
        return "  Code: "+ code + "\n" +
        "  Description: " + description + "\n" +
        "  Price: " + price + "\n"; //  returns the string representation of the Product object with the code, description, and price of the product 
    }
}
