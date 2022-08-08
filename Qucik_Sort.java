//Quick Sort 
package technicals;
import java.util.*;
public class Main {
	//here we are neither returning any value nor printing anything because we are using object references to change the real object i.e. the arrays.
	static void sort(int [] ar, int low , int high)
	{
		if(low>=high)//base case , when the low pointer index gets higher than higher.
		{
			return;
		}
		int s=low;
		int e=high;
		int mid=s+(e-s)/2;
		int pivot=ar[mid];
		while(s<=e)
		{
			//due to this three checks, if the array is already sorted it will not perform sorting and this is the reason for which we prefer Quick Sort over Merge Sort.
			while(ar[s]<pivot)//checking the elements present in the left side is less than pivot or not
			{
				s++;
			}
			while(ar[e]>pivot)//checking the elements present in the right side is greater than pivot or not.
			{
				e--;
			}
			//when above two conditions not satisfied that means the order is not same so we have to arrange them.
			//But we will arrange them only when the start is <= end or else this will rearrange the already properly arranged elements
			if(s<=e)
			{
				int temp=ar[e];
				ar[e]=ar[s];
				ar[s]=temp;
				s++;
				e--;
			}
		}
		//after this arrangement the start(s) and end(e) will together point the pivot element.
		//NExt we will perform recursion using the (low and e) and (s and high).
		//At every iterations the gap between the (low and e) and (s and high) will get reduce
		//Now lets perform quick sort for elements lower than pivot and higer than pivot respectively
		sort(ar,low,e);
		sort(ar,s,high);
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit");
		int n = sc.nextInt();
		int [] ar= new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		sort(ar,0,ar.length-1);
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(ar));

	}

}
