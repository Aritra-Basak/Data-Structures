package technicals;
//Linear Search using Recursion
import java.util.*;
public class Main {

	static ArrayList <Integer> check(int[] ar,int index,int t,ArrayList <Integer> list) //we are passing index as an argument because we need the index for every recursive steps to compare
	{
		if(index==ar.length-1)
		{
			return list;
		}
	    if(t==ar[index])
	{
		list.add(index);//we are adding inside a list so if the target element appears more than 1 time then the index values will be stored in the list
	}
		 return check(ar,index+1,t,list);
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
    ArrayList <Integer> list = new ArrayList<>();
    check(ar,index,t,list);
    System.out.println(list);
   
}
}
