package Module_6;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.ArrayList;
import java.util.List;

class MemComposerDao implements ComposerDao { //Class to represent the data access object for Composer 
    private List<Composer> composers; //List to store the composers in memory 
    public MemComposerDao() //Constructor to initialize the list of composers    
    {
        composers = new ArrayList<>(); //Initialize the list of composers 
        composers.add(new Composer(1, "Ludwig van Beethoven", "Classical")); //Add composers to the list with their id, name, and genre 
        composers.add(new Composer(2, "Wolfgang Amadeus Mozart", "Classical")); //Add composers to the list with their id, name, and genre 
        composers.add(new Composer(3, "Johann Sebastian Bach", "Baroque")); //Add composers to the list with their id, name, and genre 
        composers.add(new Composer(4, "Frederic Chopin", "Romantic")); //Add composers to the list with their id, name, and genre 
        composers.add(new Composer(5, "Igor Stravinsky", "Modern")); //Add composers to the list with their id, name, and genre 
    }
    @Override
    public List<Composer> findAll() { //Method to find all composers in the list 
        return composers;
    }

    @Override
    public Composer findBy(Integer id) { //Method to find a composer by its id in the list 
        return composers.stream().filter(c -> c.getID() == id).findFirst().orElse(null);
    }

    @Override
    public void insert(Composer composer) { //Method to insert a composer into the list 
        composers.add(composer);
    }
}
