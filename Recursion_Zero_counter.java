package technicals;
import java.util.*;
public class Zero {
	static int Count(int a,int count)
	{
		 if (a==0)
			 return count;
		 else if(a%10==0)
			return Count(a/10,count+1);
		else
			return Count(a/10,count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int count=0;
		System.out.println(Count(a,count));

	}

}
