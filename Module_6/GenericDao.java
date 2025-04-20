package Module_6;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.List;

public interface GenericDao<E, K> { //Generic interface to represent the data access object 
    List<E> findAll(); //Method to find all entities of type E 
    E findBy(K key); //Method to find an entity of type E by its key of type K 
    void insert(E entity); //Method to insert an entity of type E 
}
