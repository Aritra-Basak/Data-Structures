//N Queens or movement of Queen in chess.
package technicals;
//A Queen can move in every direction so in a board we have to place the queens in such a way that it doesn't cancel each other 
//Actually we are trying to fill the matrix with the max number of queens 
import java.util.*;

public class Queens {
	
	static int queens(boolean[][] board, int row)
	{
		if(row==board.length)
		{
			display(board); //for printing the board
			System.out.println();
		     return 1; //for counting the number of ways
		}
		int count =0;
		//making the element true if its safe to place a queen and later on in the true position the queen will be placed
		for(int col = 0;col<board.length;col++)
		{
			if(isSafe(board,row,col))
			{
				board[row][col]=true;//if its safe to place the queen after checking each and every column of a row then make it true
				count=count+queens(board, row+1);//when we are done checking for the current row we move on to next row using recursion, whose potential answer will be return to the calling function
				board[row][col]=false;//after getting the potential ans we are making that position of row and col false (back-tracking), so we can check for other potential ans without any problem of already received ans.
			}
		}
		
		return count;
		
	}
	private static void display(boolean [][] board)
	{
		for(boolean[] every_row:board)
		{
			for(boolean element:every_row)
			{
				if(element) //if the element among all false is true then that's the position Queen will be placed
					System.out.print("Q ");
				else
					System.out.print("X ");
			}
			System.out.println();
		}
	}
	private static boolean isSafe(boolean [][] board , int row, int col)
	{
		//check in the  column  of given row
		for(int i =0;i<row;i++)
		{
			if(board[i][col])
			{
				return false;
				
			}
		}
		//diagonal left
		int maxLeft=Math.min(row, col);//for diagonal left we will move the minimum value of current position.
		//like if we are in [2,3] position we will move only 2 position diagonally left
		//like if we are in [1,2] we will move only 1 position diagonally
		for(int i =1;i<=maxLeft;i++)
		{
			if(board[row-i][col-i])
				return false;
		}
		//diagonal right
		int maxRight =  Math.min(row, board.length-col-1);
		for(int i =1;i<=maxRight;i++)
		{
			if(board[row-i][col+i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows and columns");
		int n= sc.nextInt();
		boolean board[][]= new boolean[n][n];
		System.out.println(queens(board,0));//as its a square matrix so we don't need to pass column we can do all our work with row only

	}

}
//Time complexity is O(N!)
