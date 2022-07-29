/*For Searching in a Mountain array we are just finding the peak value then with that we are checking for the target element
 in the right hand i.e the ascending part and if not found we are considering the peak value as our start point and searching 
 till the ar.length-1
 */
package technicals;
import java.util.*;
public class Mountain {
	static int bsearch(int[] ar,int target)
	{
		int p=peak(ar);
		int index=binary(ar,target,0,p);
		if(index!=-1)//if we get value from the above search then simply returning the index 
			return index;
		else
		{
		index=binary(ar,target,p,ar.length-1);
		return index;
	    }
	}
	static int peak(int [] ar)
	{
		int start=0;
		int end=ar.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(ar[mid]>ar[mid+1])
				end=mid;
			else
				start=mid+1;
			
		}
		return start;//return end;
	}
	static int binary(int[] ar, int target, int start, int end)
	{
	boolean sorttype=ar[start]<ar[end];//checking whether ascending order or descending order
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(ar[mid]==target)
				return mid;
			else if(sorttype)//for searching in ascending part
			{
			if (target>ar[mid])
				start=mid+1;
			else
				end=mid-1;
		    }
			else//for searching in descending part
			{
				if (target>ar[mid])
					end=mid-1;
				else
					start=mid+1;
			}
			
			}
		return -1;
		
		}


	public static void main(String[] args) 
	{
		int [] ar= {-1,0,1,2,3,5,7,9,8,6,4};
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(ar));
		System.out.println("Enter the number to be searched");
		int t=sc.nextInt();
		System.out.println("index is: "+bsearch(ar,t));

	}

}
