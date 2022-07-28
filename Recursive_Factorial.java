package Recursion;
import java.util.*;

public class Factorial {
	static int fact(int x)// as it is a static method so we have defined it within the same class with main, and we also don't need to create any object to call this method.
	
	{
	 if(x<=1)
		 return 1;
	 else
		 return fact(x-1)*x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which u have to find factorial:");
		int n = sc.nextInt();
		 System.out.println("The factorial of "+ n + " is "+ fact(n));
	}

}
