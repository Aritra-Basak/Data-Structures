package technicals;
import java.util.*;
public class Solutions {
	static ArrayList <String> list = new ArrayList<> ();
	static void subset(String p, String up)
	{
		if(up.isEmpty())
		{
		list.add(p); 
		 System.out.println(list);
			return;
		}
		char ch=up.charAt(0);
		subset(p,up.substring(1));//for printing with excluding the extracted character
		subset(p+ch,up.substring(1));//for printing including the extracted character.
		//in above call we are not doing ch+p because we want to maintain the character sequence like abc can be a subset not cba.
	
		// a blank line will also be printed because there will be a recursion call where all the characters are skipped and printed.
	}
	//2nd Method without the use of static ArrayList
	static ArrayList<String> subseq (String p, String up)
	{
		if(up.isEmpty())
		{
			ArrayList<String> list = new ArrayList <> ();
			list.add(p);
			return list;
		}
		char c=up.charAt(0);
		ArrayList<String> left=subseq(p+c,up.substring(1));
		ArrayList<String> right = subseq(p,up.substring(1));
		left.addAll(right);//adding all the elements from right list to left
		return left;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String p="";
       subset(p,str);
       System.out.println("The answer in single line:-");
       System.out.println(list);
       System.out.println("Answer by 2nd Method:");
       System.out.println(subseq(p,str));
      
	}
}
