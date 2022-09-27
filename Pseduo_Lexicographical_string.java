package technicals;
/*
 * Checking a string is Pseudo Lexicographical or not . 
 * This Program is also called Pseudo Equal String
 * First the two strings must be of same length and of same case
 * First we need to check that the given strings are pseudo or not. A string is said to be pseudo if in both the strings the common character's frequency is <= 3
 * Second we have to check which of the 2 pseudo checked string is lexicographically small. Lexicographical means the word appears in the order of the dictionary like: dam and dom, dam will appear first because a comes before o 
 * If all the conditions are not satisfied it is not a pseudo lexicographical string and just print -1*/

import java.util.*;
public class Pseudo {

	static LinkedHashMap<Character,Integer> freq(String x)
	{
		
		char [] ch = x.toLowerCase().toCharArray();
		LinkedHashMap <Character,Integer> res = new LinkedHashMap<>();
		for(char c:ch)
		{
			if(res.containsKey(c))
				res.put(c, res.get(c)+1);
			else
				res.put(c, 1);

		}
		System.out.println(res);
		return res;
	}

	 public static void main(String[] args)     
     {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 strings of same length and of same case");
		String a =sc.next();
		String b =sc.next();
		boolean check =false;
		if(a.length()!=b.length())
		{
			System.out.println("Cannot be performed with different length of strings");
			System.exit(0);
		}
		// checking the frequency of characters in both the strings
		
		LinkedHashMap <Character, Integer> list1 =freq(a);
		LinkedHashMap <Character, Integer> list2 =freq(b);
		
		// checking the pseudo property
		
		   Set<Character> set1 = list1.keySet();//creating a set of keys from the HashMap
		   Set<Character> set2 = list2.keySet();
			  
	        // get Iterator from key set
	        Iterator<Character> itr1 = set1.iterator();
	        Iterator<Character> itr2 = set2.iterator();
	  
	        // iterating as per Insertion Order
	        while (itr1.hasNext() && itr2.hasNext()) {
	            Character key1 = itr1.next();
	            Character key2 = itr2.next();
	            if(key1==key2)
	            {
	            	if((list1.get(key1)-list2.get(key2)<=3) || (list2.get(key2)-list1.get(key1)<=3))
	            	{
	            		check=true;
	            		
	            	}
	            		
	            	else
	            	{
	            		check=false;
	            		break;
	            	}
	            		
	            }
	            
	            
	        }
	        
	        //checking which string is lexicographically ahead.
	        if(check==true)
	        {
	        	if(a.compareTo(b)<0)
	        	{
	        		System.out.println(a + " is the pseudo lexicographical string");
	        	}
	        	else if (a.compareTo(b)>0)
	        	{
	        		System.out.println(b + " is the pseudo lexicographical string");
	        	}
	        	else
	        		System.out.println("both are similar");
	        }
	        else
	        	System.out.println(-1);
	        
	        
		
	}
 }
	
