package technicals;
import java.util.*;
//Here we Can move in 4 Directions of the array i.e. we can move in upwards , left , downwards and right.
public class Back_Tracking {

	static ArrayList <String> path = new ArrayList<>();
	static void run(String p,boolean[][]maze, int r,int c)
	{
		if(r==maze.length-1 && c==maze[0].length-1)//if the r and c due to recursive calls reaches their max values then we will print them and stop further recursions
			//here maze[0].length signifies the column value i.e. the length of array inside each row 
		{
			System.out.println(p);
			path.add(p);
			return;
		}
		
		if(maze[r][c]==false)
			return;
		
		//Recursion block starts
		// when the recursion block starts we will make that cell of the matrix false
		maze[r][c]=false;
		if(r<maze.length-1)
			run(p+'H',maze,r+1,c);//moving horizontally right
		if(c<maze[0].length-1)
			run(p+'V',maze,r,c+1);//moving vertically down
		if(c>0)
			run(p+'U',maze,r,c-1);//moving vertically up
		if(r>0)
			run(p+'L',maze,r-1,c);//moving horizontally left
		//Recursion Block Ends
		//So before the function gets removed or ends we have to all the changes made while starting/calling the function
		maze[r][c]=true;
	}

	//for returning 
	public static void main(String[] args) {
		boolean [][] maze= {{true, true,true}, 
		                    {true, true,true},
		                    {true, true,true}};
		run("",maze,0,0);//we will start our journey from 0,0 starting index.
		System.out.println(path);
	}
//if we haven't used backtracking then we have got error because steps would be repeated infinite times because while moving down we are adding +1 to column 
	//again while moving upward we are making column -1 this will keep on going forever.
}
