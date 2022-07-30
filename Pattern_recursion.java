package technical;

import java.util.Scanner;

//pattern with recursion
public class Main {

	static void pattern(int r, int c)
	{
		if(r==0) // we are starting the row from N and c from 0 if row comes to 0 that's mean its done printing
			return ;
		else if(r>c) //till column is less than row it will keep printing
		{
			System.out.print("*");
			pattern(r,c+1);
		}
		else
		{//if column == row then we will move to the next row and start with a fresh column
			System.out.println();
		pattern(r-1,0);
		}
	}
	static void pattern2(int r, int c)
	{
		if(r==0)
			return ;
		else if(r>c)
		{
			pattern2(r,c+1);
			System.out.print("*");//this line will be executed when the above function called done its own execution
			//like we are currently in (4,0), the print statement will be executed when the function called i.e.(4,1) is executed.
			
		}
		else
		{
			pattern2(r-1,0);
			System.out.println();
		
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	 pattern(4,0);
	 pattern2(4,0);
	}
	
}
		
