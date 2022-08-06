package technicals;
import java.util.*;
public class Maze_runner2 {
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
		if(r<maze.length-1)
			run(p+'H',maze,r+1,c);
		if(c<maze[0].length-1)
			run(p+'V',maze,r,c+1);
		
	}

	//for returning 
	public static void main(String[] args) {
		boolean [][] maze= {{true, true,true}, 
		                    {true, false,true}, //here false is the obstacle so we have dodge that and move in other directions
		                    {true, true,true}};
		run("",maze,0,0);//we will start our journey from 0,0 starting index.
		System.out.println(path);
	}

}
