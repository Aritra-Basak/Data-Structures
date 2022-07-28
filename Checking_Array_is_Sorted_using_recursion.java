package technicals;
import java.util.*;
public class Main {
	static boolean check(int[] ar,int index) //we are passing index as an argument because we need the index for every recursive steps to compare
	{
		if(index==ar.length-1)
			return true; //this means after successfully checking throughout the array the index value has come to the last index.
		                 //now it has nothing to compare so it will return true
		else
			return (ar[index]<ar[index+1])&& check(ar,index+1); //it return the and product of ar[index]<ar[index+1] && the same step from recursive call of index+1
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
        System.out.println(check(ar,index));
       
    }
}
