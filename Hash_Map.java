//Hash Table is class which implements Hash Table and it is a part of Java Collection Framework
//Hash Table stores key/value pair in hash table.
//In Hash Table we specify an object that is used as a key, and the value we want to associate to that key. 
//The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
//Hash Table is Synchronized
//In Hash Table we can neither store null in key nor in value.
//We can't repeat keys they must be unique but the values can be repeated.

package placements;
import java.util.*;
public class Hash_Table {

	public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
  
        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, "four");
  
   
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        
        //getting value from table using .get() method
        String value = ht1.get(1);
        System.out.println(value);
        
       
        
        Iterator<Integer> itr=ht1.keySet().iterator(); //we are using the Iterator to iterate or traverse inside the HashTable
         //Iterator< Key's Data type' Wrapper Class> itr =ht1.keySet().iterator();
        //we are using keys to help us with key iteration
       //The keySet() method is used to get a Set view of the keys contained in this Hashtable.
      //getting all the key values and set an iterate for iterating over the fetched key set
     
        System.out.println("The keys in the Hash Table are: "+ht1.keySet());
        
        while(itr.hasNext())//this hasNext() will check if there is any element present in the next set or not.
        {
        	Integer key =itr.next(); // the itr start with a null then with .next() it fetch the next key from the set.
        	System.out.println("Key: "+ key + ", Value: "+ht1.get(key));
        }
        
        //removing with a key value using .remove() method
        ht1.remove(3);
        System.out.println(ht1);
        
        //adding a value in the key 3
        ht1.put(3, "New");
        System.out.println(ht1);
       
        //changing the value in the key 3
        ht1.replace(3, "Three");
        System.out.println(ht1);
        
    }
}
