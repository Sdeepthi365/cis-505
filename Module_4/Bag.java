package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class Bag extends Product { //creating a class named Bag that extends the Product class
    private String type; //creating a private variable type of type String

    //No Argument Constructor
    public Bag(){ } //creating a no-argument constructor
    public Bag(String code, String description, double price,String type ) // creating a constructor that accepts four parameters: code, description, price, and type
    { 
        super(code, description, price); //calls the constructor of the superclass Product with the parameters code, description, and price
        this.type = type; //assigns the value of type to the instance variable type
    }

    //Accessor Method
    public String getType() //returns the type of the bag
    {
        return type; //returns the type of the bag
    }

    //Mutator Methods
    public void setType(String type) //accepts a String value type and assigns it to the instance variable type
    {
        this.type = type; //    assigns the value of type to the instance variable type
    }

    //Override the toString()
    public String toString() //returns a string representation of the Bag object   
    {
        return super.toString() + "\n" + 
        "  Type :" + type; //returns the string representation of the Bag object by calling the toString() method of the superclass Product and appending the type of the bag
    }
}
