package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class Ball extends Product { //creating a class named Ball that extends the Product class
    private String color = ""; //   creating a private variable color of type String and initializing it to an empty string

    //No Argument Constructor
    public Ball() { }

    //Argument Constructor
    public Ball(String code, String description, double price,String color ) //creating a constructor that accepts four parameters: code, description, price, and color
    { 
        super(code, description, price); //calls the constructor of the superclass Product with the parameters code, description, and price 
        this.color = color;// //assigns the value of color to the instance variable color 
    }

    //Accessor Method
    public String getColor() //returns the color of the ball 
    {
        return color; //    returns the color of the ball 
    }

    //Mutator Methods
    public void setColor(String color) //accepts a String value color and assigns it to the instance variable color 
    {
        this.color = color; //    assigns the value of color to the instance variable color 
    }

    //Override the toString()
    public String toString() // returns a string representation of the Ball object  
    {
        return super.toString() + "\n" + 
        "  Color :" + color; //returns the string representation of the Ball object by calling the toString() method of the superclass Product and appending the color of the ball 
    }
}
