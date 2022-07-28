package placements;

import java.util.Scanner;
public class Solutions {
	static int count(int a)
	{
		if(a==0)
			return 0;
		else
			return(a%10)+count(a/10);
	}
	static int product(int a)
	{
		if(a%10==a)//if it is a single digit number
			return a;
		else
			return (a%10)*product(a/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =sc.nextInt();
		System.out.println("Sum is :"+count(a));
		System.out.println("Product is :"+product(a));
	}

}
//time complexity is O(logN)
