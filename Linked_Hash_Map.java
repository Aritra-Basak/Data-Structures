//The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
//It contains only unique elements.
//It may have one null key and multiple null values.
//It is non-synchronized.

package placements;
import java.util.*;
public class L_Hash_Map {

	 public static void main(String a[])
	    {
	 
	        // Creating an empty LinkedHashMap
	        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
	 
	        // Adding entries in Map
	        // using put() method
	        lhm.put("one", "New York");
	        lhm.put("two", "Iceland");
	        lhm.put("three", "Tokyo");
	 
	        // Printing all entries inside Map
	        System.out.println(lhm);
	 
	        // Note: It prints the elements in same order
	        // as they were inserted
	 
	        // Getting and printing value for a specific key
	        System.out.println("Getting value for key 'one': "
	                           + lhm.get("one"));
	 
	        // Getting size of Map using size() method
	        System.out.println("Size of the map: "
	                           + lhm.size());
	 
	        // Checking whether Map is empty or not
	        System.out.println("Is map empty? "
	                           + lhm.isEmpty());
	 
	        // Using containsKey() method to check for a key
	        System.out.println("Contains key 'two'? "
	                           + lhm.containsKey("two"));
	 
	        // Using containsKey() method to check for a value
	        System.out.println(
	            "Contains value 'Tokyog'? "
	            + lhm.containsValue("Tokyo"));
	        
	        //Adding a Null key with a Null Value
	        lhm.put(null, null);//.put(key, value)
	        System.out.println("Modified :-"+lhm);
	
	 
	        // Removing entry using remove() method
	        System.out.println("delete element 'null': "
	                           + lhm.remove(null)); //.remove(object key)
	 
	        // Printing mappings to the console
	        System.out.println("Mappings of LinkedHashMap : "
	                           + lhm);
	    }
	}
