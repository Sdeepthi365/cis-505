package Module_4;
/*
 Suddala, Deepthi. (2025). CIS 505 Intermediate Java Programming.
 Bellevue University.
*/

public class ProductDB { //creating a class named ProductDB 
    public static GenericQueue<Product> getProducts(String code) //accepts a String value code and returns a GenericQueue of type Product 
    { 
        GenericQueue<Product> products = new GenericQueue<Product>(); 

        if(code.equalsIgnoreCase("b")) 
        {
            Ball ball1 = new Ball("B100", "Black Widow 1.0" , 111.95, "Black");
            Ball ball2 = new Ball("B200", "Black Widow 2.0" , 122.95, "Pink");
            Ball ball3 = new Ball("B300", "Black Widow 3.0" , 133.95, "Blue");
            Ball ball4 = new Ball("B400", "Black Widow 4.0" , 144.95, "Red");
            Ball ball5 = new Ball("B500", "Black Widow 5.0" , 155.95, "White");
            products.enqueue(ball1);
            products.enqueue(ball2);
            products.enqueue(ball3);
            products.enqueue(ball4);
            products.enqueue(ball5); 
            
        }
        if(code.equalsIgnoreCase("s"))
        {
            Shoe shoe1 = new Shoe("S100", "Formal Shoe 1.0" , 222.95, 8.5);
            Shoe shoe2 = new Shoe("S200", "Formal Shoe 2.0" , 333.95, 9.5);
            Shoe shoe3 = new Shoe("S300", "Formal Shoe 3.0" , 444.95, 10.5);
            Shoe shoe4 = new Shoe("S400", "Formal Shoe 4.0" , 555.95, 6.5);
            Shoe shoe5 = new Shoe("S500", "Formal Shoe 5.0" , 666.95, 7.5);
            products.enqueue(shoe1);
            products.enqueue(shoe2);
            products.enqueue(shoe3);
            products.enqueue(shoe4);
            products.enqueue(shoe5);
        }
        if(code.equalsIgnoreCase("a"))
        {
            Bag bag1 = new Bag("A100", "Torry Burch 1.0" , 234.95, "Sling");
            Bag bag2 = new Bag("A200", "Torry Burch 2.0" , 334.95, "Sling");
            Bag bag3 = new Bag("A300", "Torry Burch 3.0" , 434.95, "Sling");
            Bag bag4 = new Bag("A400", "Torry Burch 4.0" , 534.95, "Sling");
            Bag bag5 = new Bag("A500", "Torry Burch 5.0" , 634.95, "Sling");
            products.enqueue(bag1);
            products.enqueue(bag2);
            products.enqueue(bag3);
            products.enqueue(bag4);
            products.enqueue(bag5);
        }
        return products; 
    }
}
