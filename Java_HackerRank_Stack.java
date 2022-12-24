package technicals;

/*
 * A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()

Output 
true

({()})
true

{}(
false
 * */


import java.io.*;
import java.util.Stack;

public class JStack {

	public static void main(String[] args) throws IOException 
	{
	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	
		System.out.println(isBalanced(inp.readLine()));
	}
	


static boolean isBalanced(String parentheses) 
{
	Stack<Character> stack = new Stack<Character>();
	for (int i = 0; i < parentheses.length(); i++) 
	{
		char ch = parentheses.charAt(i);
		if (ch == '(' || ch == '[' || ch == '{') 
		{
			stack.push(ch);
		} 
		else if (stack.empty()) // in-case of input like only } or ] or ) it will not get pushed in the stack, so it will remain empty, thus will return false.
		{ 
			return false;
		} 
		else 
		{
			char top = stack.pop();
			if ((top == '(' && ch != ')') || (top == '[' && ch != ']')|| (top == '{' && ch != '}')) 
			{
				return false;
			}
		}
	}


	return stack.empty();

	}

}
