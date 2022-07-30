package technicals;
//bubble sort using recursion
import java.util.*;
public class Solutions {
	static void bubble(int [] ar,int i, int index)
	{
		if(i==0) // when i reaches to 0 it means all the elements are sorted.
			return ;
		else if(i>index)
		{
			if(ar[index]>ar[index+1])
			{
				ar[index]=ar[index+1]+ar[index];
				ar[index+1]=ar[index]-ar[index+1];
				ar[index]=ar[index]-ar[index+1];
			}
			bubble(ar,i,index+1);
		}
		else
		{
		bubble(ar,i-1,0);//when i ==index that it reaches to last index where it has no one to compare so it moves to 2nd iteration.
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n =sc.nextInt();
		int [] ar= new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Arrays after sorting");
	 bubble(ar,ar.length-1,0);
	 System.out.println(Arrays.toString(ar));
	
}
}
