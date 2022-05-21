import java.util.*;

public class Copy {
    public static void main(String[] args) 
    throws Exception 
{
    try {
        
        // Create an object of Source list and destination List
        List<String> srclst = new ArrayList<String>(3);
        List<String> destlst = new ArrayList<String>(3);
        
        // Adding element to srclst
        srclst.add("Arroz");
        srclst.add("Habichuela");
        srclst.add("Carne");
        
        // Adding elemtn to destlst 
        destlst.add("1");
        destlst.add("2");
        destlst.add("3");
        
        // printing the srclst 
        System.out.println("Valure of source list: " + srclst);
        
        // printing the destlst
        System.out.println("Valure of destination list: " + destlst);
        
        System.out.println("\nAfter copying:\n");
        
        // copy element into destlst
        Collections.copy(destlst, srclst);
        
        // Printing the srcklst 
        System.out.println("Valure of sourse list: " + srclst);
        
        // Printing the destlst
        System.out.println("Valure of destination list: " + destlst);
    }
    catch (IllegalArgumentException e) {
         System.out.println("Exception thrown: " + e);
    }
    catch (IndexOutOfBoundsException e) {
        System.out.println("Exception thrown: " + e);
            }
        }     
    } 
    
