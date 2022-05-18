//Programa para invertir la lista 
import java.util.*;

public class Reverse {
    public static void main(String[] argv)
        throws Exception 
    {
    
        try {
    // Create the LinkedList
    LinkedList<String> price = new LinkedList<String>();
    
    // Add elemnts into the LinkedList with add() method
    price.add("1500");
    price.add("1350");
    price.add("950");
    price.add("800");
    price.add("450");
    price.add("300");
    price.add("150");
    
    // Show all the elements in normal order
    System.out.println("LinkedList:" + price);
    
    Iterator x = price.descendingIterator();
    
    // Show all the elements in descending order
    while (x.hasNext()) {
        System.out.println("Value is : "
                            + x.next());
        }
    }
    
    catch (NullPointerException e) {
        System.out.println("Exception thrown : "
                            + e);
            }
        }    
    }
