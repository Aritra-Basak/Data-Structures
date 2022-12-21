package technicals;
/*
 * You are given  pairs of strings. Two pairs  and  are identical if  and . That also implies  is not same as . After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

Input Format

In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.


Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3
Explanation

After taking the first input, you have only one pair: (john,tom)
After taking the second input, you have two pairs: (john, tom) and (john, mary)
After taking the third input, you still have two unique pairs.
After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
After taking the fifth input, you still have three unique pairs.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class UniqueStringsCount {

	public static void main(String[] args) throws IOException 
	{
	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	int n= Integer.parseInt(inp.readLine()); //buffered reader for integer input
	LinkedHashSet<String> l1 = new LinkedHashSet<String>();
	LinkedHashSet<String> l2 = new LinkedHashSet<String>();
	
	for(int i=0;i<n;i++)
	{
		
	String name = inp.readLine();
	String names[] = name.split(" ");
	l1.add(names[0]);
	l2.add(names[1]);
	System.out.println(Math.max(l1.size(), l2.size()));
		
	}

}
}
