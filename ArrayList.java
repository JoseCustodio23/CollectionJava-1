import java.util.ArrayList;

public class RandomNumber {
    
    public static void main(String[] args) {
        
        ArrayList rnumber = new ArrayList();
        rnumber.add("One");
        rnumber.add("Two");
        rnumber.add("Three");
        rnumber.add("Four");
        rnumber.add("Five");
        rnumber.add("Six");
        rnumber.add("Seven");
        rnumber.add("Eight");
        rnumber.add("Nine");
        rnumber.add("Ten");
        
        int a = (int) (Math.random() * 10);
        
        System.out.println("Number selected: "+rnumber.get(a));
    }
}
