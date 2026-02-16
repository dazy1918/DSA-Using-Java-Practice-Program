import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        Vector<String> v = new Vector<>();

        v.add("xyz");
        v.add("ram");
        v.add("sita");

        System.out.println(v);            
         // Print whole vector
        
        System.out.println("Size: " + v.size());     
          // Number of elements
        
        System.out.println("Capacity: " + v.capacity()); 
        // Current capacity

        // Traversing using for-each loop
        for(String s : v) {
            System.out.println(s);
        }
    }
}
