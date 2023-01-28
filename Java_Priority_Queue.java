package placements;
import java.util.*;

/*A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.  */

/*
 * A few important points on Priority Queue are as follows: 

PriorityQueue doesn’t permit null.
We can’t create a PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It provides O(log(n)) time for add and poll methods.
It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class.*/

public class Priority_Solution {

	public static void main(String[] args)
	{
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(15);
		p.add(10);
		p.add(20);
		p.add(10);
		
		System.out.println(p); //while printing the output doesn't maintain the order in what it got input
		
		  // Printing the top element of PriorityQueue
        System.out.println("top element in the queue:"+p.peek()); //10 is the top element because it's occurrence naturally is earlier
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(p.poll());//removes the 10 as it was in top 
  
        // Printing the top element again
        System.out.println("top element in the queue after removing the earlier top element:"+p.peek()+"\n");
        
        //Best way to iterate the queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
  
        Iterator iterator = pq.iterator();
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

	}

}
