package technicals;
//Optimized Merge Sort, the basic merge sort was creating array objects at every level of recursion call. So here we are working with the index of the array.
import java.util.*;
public class Optimal {
	static void mergeSort(int [] ar,int s,int e)
	{
		if(e-s==1)//if the array length is reached to 1 after breaking into small parts then we return that array to the recursive function from where it was called.
		{
			return ;
		}
		int mid=(e+s)/2;
		mergeSort(ar, s, mid);
		mergeSort(ar, mid,e);
		merging(ar,s,mid,e);//calling the merge function to sort the array in 2 parts and merge them at the last.
	}
	static void merging(int [] ar, int s,int mid, int e)
	{
		int [] ultimate=new int[e-s];
		int i=s,j=mid,k=0;
		while(i<mid && j<e)//we will check till we are done with copying of any of the 2 arrays if their length is different
		{
			if(ar[i]<ar[j])
			{
				ultimate[k]=ar[i];
				i++;
			}
			else
			{
				ultimate[k]=ar[j];
				j++;
			}
			k++;
		}
		//it may happen that the two parts are of different length so we may left out checking of some elements from the bigger part, so with the next steps being triggered we will copy those in the ultimate array.
		while(i<mid)
		{
			ultimate[k++]=ar[i];
			i++;
		}
		
		while(j<e)
		{
			ultimate[k++]=ar[j];
			j++;
		}
		//moving all the elements in the main array by parts
		for(int l=0;l<ultimate.length;l++)
		{
			ar[s+l]=ultimate[l];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n= sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("After sorting");
		mergeSort(ar,0,ar.length);
		System.out.println(Arrays.toString(ar));
		
	}

}
