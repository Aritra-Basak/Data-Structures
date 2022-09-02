package placements;

import java.util.*;

public class COLLECTION_QUEUE {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue <Integer> queue = new LinkedList<>(); // Internally Queue is an interface which will be implemented by LinkedList
    	System.out.println("Enter the limit");
    	int n = sc.nextInt();
    	for(int i = 1;i<=n;i++)
    	{
    		queue.add(i);
    	}
    	
        System.out.println("Size of the queue is :"+queue.size());
        System.out.println("Head Element is:"+queue.peek());//prints the head of the queue
        System.out.println( "Head element is:"+ queue.element());//also prints the head of the queue
        System.out.println("Elements are");
        
        //iterating in queue
        for (int item: queue) {
            System.out.println(item);
        }
        System.out.println("Removing :"+queue.remove());
        System.out.println("Removing :"+queue.remove());
        System.out.println("After removing elements are");
        for (int item: queue) {
            System.out.println(item);
        }
        //deque:
        //Unlike normal queue(insertion from rear and removal from front) deque(pronounced as 'deck') a kind of queue where we can insert and remove from both the sides.
        Deque<Integer> deque = new ArrayDeque <>(); //its faster than normal queue.
        //ArrayDeque is faster than LinkedList on average. But for adding an element, ArrayDeque takes amortized constant time, and LinkedList takes constant time.
        //The amortized constant time complexity comes from amortized analysis. This kind of analysis is used when we want to evaluate the total complexity of a sequence of operations
          
        System.out.println("DEQUE");
        for(int i =5;i>=1;i--)
          {
        	  deque.addFirst(i);
          }
          for(int i =6;i<=10;i++)
          {
        	  deque.addLast(i);
          }
        
          for(int items:deque)
          {
        	  System.out.println(items);
          }
          System.out.println("Size is :"+deque.size());
          deque.add(100);//when normally added it will be added at the last or rear end of the deque.
          for(int items:deque)
          {
        	  System.out.println(items);
          }
          
         System.out.println("REmoving..:"+deque.removeFirst()); 
         System.out.println("REmoving..:"+deque.removeLast()); 
         System.out.println("REmoving..:"+deque.remove()); //when normally removed the element gets removed from front end.
         System.out.println("Size is :"+deque.size());
         for(int items:deque)
         {
       	  System.out.println(items);
         }
        
	}

}
