//floor of a number from the array is the greatest number which is equal to or smaller than the target number.
package technicals;
import java.util.*;
public class Floor {
	static int floor(int[]ar,int target)
	{
		int start=0,end=ar.length-1;
		boolean asc;
		if(ar[start]<ar[end])
			asc=true;
		else
			asc=false;
		while(start<=end)
		{
			int mid=start +(end-start)/2;
			if(target==ar[mid])
				return ar[mid];
			else if(asc) //if the array is sorted in ascending order
			{
				 if(target>ar[mid])
					start=mid+1;
				else
					end=mid-1;
			}
			else //if the array is sorted in descending order
			{
				 if(target>ar[mid])
					end=mid-1;
				else
					start=mid+1;
			}
				
		}if(asc)
		return ar[end];//when the floor number is not equal to but only smaller than the target,
	    // so it will be the number just at left side of the last mid element i.e. when the above while loop condition doesn't satisfy(when start >end) 
		else 
			return ar[start];//incase of descending sort
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int a =sc.nextInt();
		int [] ar=new int[a];
		System.out.println("Enter the elements in the array in a sorted manner");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Enter the target element");
		int t=sc.nextInt();
		int ans=floor(ar,t);
		System.out.println("Floor of the target element from the array is: "+ans);


	}

}
