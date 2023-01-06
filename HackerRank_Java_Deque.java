/*
 * In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers N and M: representing the total number of integers and the size of the subarray, respectively. The next line contains N space separated integers.

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3


Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

 s1=(5,3,5)- Has  2 unique numbers.

 s2=(3,5,2)- Has  3 unique numbers.

s3=(5,3,2)- Has  3 unique numbers.

 s4=(2,3,2)- Has 2  unique numbers.

In these subarrays, there are 2,3,3,2  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is 3.
 * */

    import java.util.*;
    public class Testing_file {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            HashMap<Integer, Integer> freqs = new HashMap<Integer, Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int ans = 0, countDistinct = 0;
            
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addLast(num);
                if (freqs.get(num) == null) 
                	freqs.put(num,0);
                
                freqs.put(num,freqs.get(num)+1);
                if (freqs.get(num)==1) 
                	countDistinct++;
                
                if (deque.size()==m+1)
                {
                    int rem = deque.removeFirst();
                    freqs.put(rem,freqs.get(rem)-1);
                    if (freqs.get(rem) == 0) 
                    	countDistinct--;
                }
                if (deque.size()==m){
                    if (countDistinct > ans) 
                    	ans = countDistinct;
                }
               
            }
            System.out.println(ans);
        }
    }
