package technicals;

import java.util.*;

public class LL_Solution {

	public static void main(String[] args) {
	
    	
    	//In a linkedlist we can iterate using a for loop , for each loop , iterator and also a while loop.
    	LinkedList<Integer> l1 = new LinkedList<>();
    	LinkedList<Integer> l2 = new LinkedList<>();
    	for(int i =1;i<=10;i++)
    	{
    		l1.add(i);
    		l2.add(i*2);
    	}
    	//printing the linkedlist
    	System.out.println(l1);
    	System.out.println(l2);
    	
    	//printing the linkedlist using for each loop
    	l1.forEach(
    			(element)-> System.out.println(element));
    	l2.forEach(
    			(element)-> System.out.println(element));
    	
    	//printing using for loop
    	for(int i:l1)
    	{
    		System.out.println(i);
    	}
    	
    	for(int i:l2)
    	{
    		System.out.println(i);
    	}
    	
  
    	
    	int s1=0,s2=0;
    	
    	//Iterating using an Iterator()
    	Iterator<Integer>itr1=l1.iterator();
    	Iterator<Integer>itr2=l2.iterator();
    	while(itr1.hasNext())
    	{
    		int a= itr1.next();
    		s1=s1+a;
    	}
    	while(itr2.hasNext())
    	{
    		int a= itr2.next();
    		s2=s2+a;
    	}
    	
    	
    	//using for loop
    	int s3=0,s4=0;
    	for(int i:l1)
    	{
    		s3=s3+i;
    	}
    	System.out.println(s3);
    	for(int i:l1)
    	{
    		s4=s4+i;
    	}
    	System.out.println(s4);
  
    	
    	
	}

}
