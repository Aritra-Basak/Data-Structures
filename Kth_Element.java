package technicals;
import java.util.*;
public class Kth_Largest {
	static int find(int [] ar, int k)
	{
	 Arrays.sort(ar);
	 return ar[k-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println("Enter the value of K");
		int k =sc.nextInt();
		System.out.println(find(ar,k));

	}

}
