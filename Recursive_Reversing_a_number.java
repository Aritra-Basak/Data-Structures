package technicals;

import java.util.Scanner;

public class Solutions {
	static int rev(int a)
	{
	int digit=(int)Math.log10(a)+1;
	return helper(a,digit);
	}
	static int helper(int a,int digit)
	{
		if(digit==1)
			return a;
		return (a%10)*(int)(Math.pow(10,digit-1))+helper(a/10,digit-1);//calling the function each time with the digit-1 and number/10
	}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a =sc.nextInt();
    System.out.println(rev(a));

	}

}
