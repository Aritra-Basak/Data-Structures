//The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap
//NULL elements are allowed in HashSet.
//Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
//Duplicate Elements/ Value are not allowed


package placements;
import java.util.*;
public class Hash_Set {

	public static void main(String[] args)
	{
		HashSet<String> hset = new HashSet<>();
		
		//adding elements/values to set
		hset.add("New York");
		hset.add("Iceland");
		hset.add("Tokyo");
		hset.add("Kolkata");
		hset.add("San Fransisco");

		System.out.println(hset);
		hset.add(null);//also support a single null value
		System.out.println(hset);
		
		//checks if a certain value is present in the set or not
		System.out.println("Is null value present in set or not"+hset.contains(null));
		
		
		//removing a value from the Hashset
		hset.remove(null);
		
		System.out.println(hset);
		
		
	   //iterating over set
		System.out.println("Iterating over HashSet");
		for(String val :hset) //as HashSet don't contain any key values so we can use for loops 
		{
			System.out.println("Hello From ! "+val);
		}
		
	}

}
