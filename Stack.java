import java.util.*;

public class LastDay {
    public static void main(String[] args){
    
    // Create the Stack
    Stack<String> Days = new Stack<String>();
    
    // Add elemnts into the Stack with add() method
    Days.add("Monday");
    Days.add("Tuesday");
    Days.add("Wednesday");
    Days.add("Thursday");
    Days.add("Friday");
    Days.add("Saturday");
    Days.add("Sunday");
    
    // Show all the elements of the Stack
    System.out.println("Stack: " + Days);
    
    // Last element from the list, using lastElement() method
    System.out.println("The last day is: " + Days.lastElement());
    }
}
