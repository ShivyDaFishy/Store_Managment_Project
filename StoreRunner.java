import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {    

/*
 * Creates all the tester objects
 */
    
Candy x = new Candy ("York", 5.99, "Large");
Candy z = new Candy ("Skittles", 7.50, "Small");
Candy y = new Candy ();

    York c = new York ("York", 5.98, "Large", "Mint filled");
    York g = new York ("York", 4.82, "Small", "Chocolate filled");
    York f = new York ();  

      Skittles n = new Skittles ("Skittles", 5.92, "Large", "Lemon");
      Skittles k = new Skittles ("Skittles", 3.72, "Small", "Orange");
      Skittles p = new Skittles ();

/*
 * Prints out the information about the tester objects.
 */

    
    System.out.println(x);
    System.out.println(z);
    System.out.println(y);

    System.out.println(c);
    System.out.println(g);
    System.out.println(f); 

    System.out.println(n);
    System.out.println(k);
    System.out.println(p);
    


    
    
    
  }
}