//Hash Map can have one Null key and multiple Null values.
//Hash Map is A-synchronized
//The elements/values are stored in a random way

package placements;
import java.util.*;
public class Hash_Map {

	public static void main(String[] args) {
		
		 // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
  
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);//(key,value)
        map.put("sachin", 30);
        map.put("vaibhav", 20);
  
        // Print size of the Map
        System.out.println("Size of map is:- "
                           + map.size());
  
        // Printing elements in object of Map
        System.out.println(map);
  
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {
  
            // Mapping
            Integer a = map.get("vishal");
  
            // Printing value for the corresponding key
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a);
        }
        map.put("sachin", 15);//if we insert a value with a duplicate key then the key value will be updated to the latest value.
        System.out.println(map);
        
        HashMap<String, Integer> map2 = new HashMap<>(map); //we are creating another Hash Map with all the values of map just by passing map's object reference
                                                           //we are just performing cloning.
        System.out.println("Hash Map 2");
        System.out.println(map2);
        
       //iterating through the hash map
        
        System.out.println("While Iterating");
        Iterator <String> itr = map.keySet().iterator(); //getting all the key values and set an iterate for iterating over the fetched key set
        while(itr.hasNext())
        {
        	String key = itr.next(); // the itr start with a null then with .next() it fetch the next key from the set.
        	System.out.println("The value of key: "+ key+ " is: "+map.get(key));
        }
    }
}
