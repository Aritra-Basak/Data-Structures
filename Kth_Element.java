package technicals;
import java.util.*;
public class Kth_Largest {
	static int method1(int [] ar, int k)
	{
	 Arrays.sort(ar);
	 return ar[k-1]; // for kth largest just print the ar[ar.length-k];
	}
	static int method2(int [] ar , int k) //Using TreeSet<> of java
	{
		// for storing elements in sorted form
        // in set we will use TreeSet
        Set<Integer> s = new TreeSet<Integer>();
 
        // Adding elements to set
        for (int i = 0; i < ar.length; i++)
            s.add(ar[i]);
 
        // Use iterator method of Iterator
        // for the traversal
        Iterator<Integer> itr = s.iterator();

        while (k-1 > 0) {
            itr.next();
            k--;
        } // itr points to the Kth element in the set
        return itr.next();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println("Enter the value of K");
		int k =sc.nextInt();
		System.out.println("Method 1: "+method1(ar,k));
		System.out.println("Method 2: "+method2(ar,k));

	}

}
