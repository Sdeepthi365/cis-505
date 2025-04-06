package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/
import java.util.LinkedList;

public class GenericQueue<T> { //creating a generic class named GenericQueue that accepts a type parameter T 
    //private generic link list data field
    private LinkedList<T> list  = new LinkedList<T>(); //creating a private LinkedList object named list that accepts the type parameter T 

    //Constructor
    public GenericQueue() //creating a constructor for the GenericQueue class  
    {
        list = new LinkedList<>(); //initializing the list object with a new LinkedList object 
    }
    //A public method - enqueue
    public void enqueue(T item) //accepts a generic type item and adds it to the list 
    {
        list.addFirst(item); //Adding item to the list using addFirst method
    }

    //A public method - dequeue
    public T dequeue() //accepts a generic type and removes the first object from the list 
    {
        if(!list.isEmpty()) //checks if the list is not empty 
        {
            return list.removeFirst();//Removing the first object using the removeFirst method
        }
        else 
        {
            return null; //returns null if the list is empty 
        }
    }

    //A public method - size
    public int size() //returns the size of the list 
    {
        return list.size(); //returning the size of the queue using the size method
    }    
}
