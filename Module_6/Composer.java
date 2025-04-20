package Module_6;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
public class Composer { //Class to represent a Composer object
    //Class variables to represent the properties of a composer
    //Private data fields id, name, and genre
    private int id;
    private String name;
    private String genre;

    //No-Argument Constructor
    public Composer() //Default constructor to initialize the properties of a composer 
    { 
        //Default values for the properties of a composer   
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    //Argument Constructor
    public Composer(int id,String name, String genre) //Parameterized constructor to initialize the properties of a composer 
    {
        //Initialize the properties of a composer with the given values 
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    //Accessor Methods
    public int getID() //Method to get the id of the composer
    {
        return id;
    }  

    public String getName() //Method to get the name of the composer 
    {
        return name;
    }
    public String getGenre() //Method to get the genre of the composer 
    {
        return genre;
    }

    //Override the toString() method
    @Override
    public String toString() //Method to return a string representation of the composer object 
    {
        return "  ID: " + id + "\n" +
        "  name: " + name + "\n" +
        "  genre: " + genre ; //String representation of the composer object 
    }
}
