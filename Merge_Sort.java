package technical;
///Basic Merge Sort
import java.util.*;
public class Solutions 
{
	static int[] mergeSort(int [] ar)
	{
		if(ar.length==1)//if the array length is reached to 1 after breaking into small parts then we return that array to the recursive function from where it was called.
		{
			return ar;
		}
		int mid=ar.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(ar, 0, mid));
		//this Arrays.copyofRange copies the mentioned array into another array from the given position(0 here) till the last position mentioned(mid here).
		int [] right=mergeSort(Arrays.copyOfRange(ar, mid,ar.length));
		return merge(left,right);//calling the merge function to merge these 2 arrays in a sorted manner.
	}
	static int[] merge(int [] left, int [] right)
	{
		int [] ultimate=new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)//we will check till we are done with copying of any of the 2 arrays if their length is different
		{
			if(left[i]<right[j])
			{
				ultimate[k]=left[i];
				i++;
			}
			else
			{
				ultimate[k]=right[j];
				j++;
			}
			k++;
		}
		//it may happen that the two arrays are of different length so we may left out checking of some elements from the bigger array, so with the next steps being triggered we will copy those in the main array.
		while(i<left.length)
		{
			ultimate[k++]=left[i];
			i++;
		}
		
		while(j<right.length)
		{
			ultimate[k++]=right[j];
			j++;
		}
		return ultimate;
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
		int [] ar2=mergeSort(ar);
		System.out.println(Arrays.toString(ar2));
		
	}

}
