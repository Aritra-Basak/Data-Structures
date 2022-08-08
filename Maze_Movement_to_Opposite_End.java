package technicals;
//IN THIS PROBLEM WE ARE MOVING FROM THE TOP LEFT CORNER OF THE MATRIX TO THE BOTTOM RIGHT CORNER OF THE MATRIX.
import java.util.*;
public class MazeRunner {
	//we are subtracting 1 from row and column instead of adding because we are moving from 3,3 to 1,1 not the vice versa.

	//number of ways :
			static int maze(int r, int c)
			{
				if(r==1||c==1) //when any of the row or column gets to 1 that means we have either reached the end of row or column respectively.
					//so for that row or column there is only one way left to reach the destination either moving only in horizontal or only in vertical.
					//So as soon as we reach 1 for either column or row we get our potential answer and we no need to check further for that particular recursion call
				{
					return 1;
				}
				int right=maze(r-1,c); //for moving right we will just subtract 1 from row.
				int down=maze(r,c-1);//for moving down we will just subtract 1 from column
				return right+down;
			}
			
	
     //printing the possible paths to reach the destination.
		static void maze_permutation(String p, int r, int c)
		{
			if(r==1 && c==1)//when the row or and column both hit 1 that means we have reached the end point so we need to return the answer
			{
				System.out.println(p);
				return;
			}
			//if we are allowed to go diagonally 
			//if(r>1 && c>1)
			//maze_permutation(p+'D',r-1,c-1);
			if (r>1)//when row is greater than 1 that means we have to move Right and we will decrease the no. of row by -1
				maze_permutation(p+'V',r-1,c);
			if(c>1)//when column is greater than 1 that means we have to move Down and we will decrease the no. of column by -1
				maze_permutation(p+'H',r,c-1);
		}
		
		
    //returning the path in the ArrayList
		static ArrayList <String> maze_list(String p, int r, int c)
		{
			if(r==1 && c==1)//when the row or and column both hit 1 that means we have reached the end point so we need to return the answer
			{
				ArrayList <String> list=new ArrayList<>();
				list.add(p);
				return list;
			}
			ArrayList <String> local=new ArrayList<>();
			//if we are allowed to go diagonally 
			//if(r>1 && c>1)
			//local.addAll(maze_permutation(p+'D',r-1,c-1));
			if (r>1)//when row is greater than 1 that means we have to move Right and we will decrease the no. of row by -1
				local.addAll(maze_list(p+'V',r-1,c));
			if(c>1)//when column is greater than 1 that means we have to move Down and we will decrease the no. of column by -1
				local.addAll(maze_list(p+'H',r,c-1));
			return local;
		}
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of rows and columns");
			int row=sc.nextInt();
			int column =sc.nextInt();
			System.out.println("Number of ways needed to move at the end opposite of the maze or matrix:-");
			System.out.println(maze(row,column));
			System.out.println("The paths that can be followed in terms of Right and Down are:-");
			maze_permutation("",row,column);
	       System.out.println("In Form of ArrayList");
	       System.out.println(maze_list(" ",row,column));
		}
	}
