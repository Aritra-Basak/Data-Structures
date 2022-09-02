package placements;
import java.util.*;
public class COLLECTION_Stack {

		 public static void main(String [] args)
		    {
		    	Scanner sc = new Scanner(System.in);
		    	Stack<Integer> stack = new Stack<>();
		    	System.out.println("Enter the limit");
		    	int n = sc.nextInt();
		    	for(int i = 1;i<=n;i++)
		    	{
		    		stack.push(i);
		    	}
		    	System.out.println("Is The stack empty?");
		    	System.out.println(stack.isEmpty());
		    	System.out.println("Size is :"+ stack.size());

		    	System.out.println("After ");
		    	for(int i = 1;i<=n;i++)
		    	{
		    	System.out.println(stack.pop());
		    	}
		    	
		    }

}
