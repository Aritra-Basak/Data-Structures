package technicals;
import java.util.*;;

public class Solutions {

	static ArrayList<ArrayList<Integer>> subset(int [] arr)
	{
		ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<Integer>());//adding the internal list in the outer list.
		for(int num:arr)
		{
			int n =outer.size();
			for(int i =0;i<n;i++)
			{
				ArrayList <Integer> internal = new ArrayList<>(outer.get(i));//adding the new number in the already present list inside outer.
				//For the first time when n= 1 one empty inner ArrayList is created due to the initializing-->outer.add(new ArrayList<Integer>())
				internal.add(num);
				outer.add(internal);
			}
			}
		return outer;
	}
	
	//When we need to skip the duplicate elements.
	static ArrayList<ArrayList<Integer>> subsetduplicate(int [] arr)
	{
		ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<Integer>());//adding the internal list in the outer list.
		Arrays.sort(arr);//the below method will only work if the two duplicate elements are together, so by sorting we can easily bring them together.
		int start,end = 0;
		for(int i=0;i<arr.length;i++)
		{
			start=0;
			//if the current element is same as the previous then just we will start adding the current number from the array to the list just the list formed by adding the previous element to its preceding lists one 
			//i.e. simply skip the list where the previous same element was added and just add it to the list which was formed by adding the previous same element.
			if(i>0 && arr[i]==arr[i-1])
			{
				start =end+1;
				
			}
			end= outer.size()-1;
			int n =outer.size();
			for(int j =0;j<n;j++)
			{
				ArrayList <Integer> internal = new ArrayList<>(outer.get(j));//adding the new number in the already present list inside outer.
				//For the first time when n= 1 one empty inner ArrayList is created due to the initializing-->outer.add(new ArrayList<Integer>())
				internal.add(arr[i]);
				outer.add(internal);
			}
			}
		return outer;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int [] arr= new int[n];
		System.out.println("Enter the array elements");
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        ArrayList<ArrayList<Integer>> ans= subset(arr);
        for(int i =0;i<ans.size();i++)//printing the inside ArrayList of the ans.
        {
        	System.out.println(ans.get(i));
        }
        System.out.println("Excluding the duplicates");
        ArrayList<ArrayList<Integer>> ans2= subsetduplicate(arr);
        for(int i =0;i<ans.size();i++)//printing the inside ArrayList of the ans.
        {
        	System.out.println(ans2.get(i));
        }
        
	}
}
//Time complexity is O(N*2^N)
