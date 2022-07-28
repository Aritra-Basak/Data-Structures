package placements;

import java.util.*;
public class Solutions {
	static void rec(int a)
	{
		if(a==0)
			return;//when 0 then it will neither print nor return
		System.out.println(a);//here it first prints then perform recursion
		rec(a-1);
		System.out.println(a);//here the recursion happens first then it prints
		
	}

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
      int a =sc.nextInt();
      rec(a);
    }
}
//time complexity O(N) because the recursion is going till N times and no loops are required.
