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
    
	}

}
