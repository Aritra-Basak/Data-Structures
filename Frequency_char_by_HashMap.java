package technicals;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String stl = sc.next();
		String st= stl.toLowerCase(); //converting every character to lower case. So the program doesn't face case discrimination

		char [] ch = st.toCharArray();
		LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
		// checking each char of strArray
        for (char c : ch) {
            if (list.containsKey(c)) {
 
                // If char is present in list already or not,
                // incrementing it's count by 1
                list.put(c, list.get(c) + 1);
            }
            else {
 
                // If char is not present in list,
                // putting this char to charCountMap with 1 as it's value
                list.put(c, 1);
            }
        }
        System.out.println(list);
    
	}

}
