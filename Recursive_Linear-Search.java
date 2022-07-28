package technicals;
//Linear Search using Recursion
import java.util.*;
public class Searching {
	static ArrayList <Integer> list = new ArrayList<>();
	static void check(int[] ar,int index,int t) //we are passing index as an argument because we need the index for every recursive steps to compare
	{
		if(index==ar.length-1)
		{
			return;
		}
	    if(t==ar[index])
	{
		list.add(index);//we are adding inside a list so if the target element appears more than 1 time then the index values will be stored in the list
	}
		 check(ar,index+1,t);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the array");
		int n = sc.nextInt();
		int[] ar= new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
      int index=0;
      System.out.println("Enter the element to be searched");
      int t =sc.nextInt();
      check(ar,index,t);
      System.out.println(list);
     
  }
}
