//performing Binary Search with Recursion.
package technicals;
import java.util.*;
public class Recursive {
	static int bsearch(int[] ar,int target, int start, int end)//we are also passing the start and end value else we have to find in each steps which will be inconvenience.
	 //if we don't pass here then we can't perform recursion as we need end and start value in every steps.
	{
		if(start>end)//it means the element is not found
			return -1;
		int mid =start +(end-start)/2;
		if(target==ar[mid])
			return mid;
		else if(target>mid)
			return(bsearch(ar,target,mid+1,end));//it means the target element is in the right side of mid and the start will be mid+1
		else
			return(bsearch(ar,target,start,mid-1));//it means the target element is in the left side of mid and the start will be mid-1
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n =sc.nextInt();
		int [] ar= new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
System.out.println(Arrays.toString(ar));
System.out.println("Enter the target element");
int target = sc.nextInt();
System.out.println(bsearch(ar,target,0,ar.length-1));
	}

}
