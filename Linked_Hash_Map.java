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
	        lhm.put("four", "Italy");
	 
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
	        
	        
	     // Insertion Order iterating
	        System.out.println(
	            "Insertion Order of LinkedHashMap:"
	            + " iterating \n");
	  
	        // getting keySet() into Set, as in Linked Hash Map .keySet(); function is not supported by Iterator
	        Set<String> set = lhm.keySet();
	  
	        // get Iterator from key set
	        Iterator<String> itr = set.iterator();
	  
	        // iterating as per Insertion Order
	        while (itr.hasNext()) {
	            String key = itr.next();
	            System.out.println("Key : " + key + "\t\t"
	                               + "Value : " + lhm.get(key));
	        }
	        
	        // Reverse of Insertion Order iterating
	        System.out.println("\n\nReverse of Insertion Order:"
	                           + " iterating \n");
	  
	        // convert to ArrayList of key set
	        //we are just storing the key set in an ArrayList and reversing that & then with respect to the keys and it's orientation we will print the values.
	        ArrayList<String> alKeys
	            = new ArrayList<String>(lhm.keySet());
	  
	        // reversing the order of keys
	        Collections.reverse(alKeys);
	  
	        // iterate LHM using reverse order of keys
	        for (String strKey : alKeys) //using for loop to print the array list so we can print the keys with their respective values
	        {
	            System.out.println("Key : " + strKey + "\t\t"
	                               + "Value : "
	                               + lhm.get(strKey));
	        }
	        
	        
	    }
	}
