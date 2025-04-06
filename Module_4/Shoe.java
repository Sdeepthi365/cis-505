package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class Shoe extends Product { 
    private double size;

    //No Argument Constructor
    public Shoe(){ } 
    // Argument Constructor
    public Shoe(String code, String description, double price,double size ) 
    { 
        super(code, description, price);
        this.size = size;
    }

    //Accessor Method
    public double getSize()
    {
        return size;
    }

    //Mutator Methods
    public void setSize(double size)
    {
        this.size = size;
    }

    //Override the toString()
    public String toString()
    {
        return super.toString() + "\n" + 
        "  Size :" + size;
    }
}
