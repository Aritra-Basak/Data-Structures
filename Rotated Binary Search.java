package technical;
//Rotated Binary Search with Recursion.......
import java.util.*;
public class RBC {
	static int search(int [] ar,int target, int s,int e)
	{
	if(s>e)
		return -1;//the element is not found
	int mid=s+(e-s)/2;
	if(ar[mid]==target)
		return mid;
	if(ar[s]<=ar[mid])//the first half or the left part is sorted 
	{
		if(target>=ar[s] && target<=ar[mid])
			return search(ar,target,s,mid-1);//if the element lies in this range then we will call the method with this range.
		else
			return search(ar,target,mid+1,e);
	}
    if(target>=ar[mid] && target<=ar[e])
	{
    	return search(ar,target,mid+1,e);
	}
        return search(ar,target,s,mid-1);

	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] ar= {5,6,7,8,9,1,2,3};
		System.out.println("Enter the target element");
		int target=sc.nextInt();
		System.out.println(search(ar,target,0,ar.length-1));
		
		
     
  }
}
