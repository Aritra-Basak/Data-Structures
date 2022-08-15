package technicals;
//Building Single Linked List from Scratch
import java.util.*;
//class containing details about the linked list
class Linked
{
	//nested class containing info about an individual node of the list and used to create a node with a value .
	 private class Node
	{
		private int value;//contains the value of the current node of the linked list
		private Node next;//contains the info about the next node, which the current node is pointing to.
		
		//constructor that can be used for creating and adding values without giving the next Node info
		public Node (int value)
		{
			this.value=value;
		}
	} 
	 //every time we create an object reference of the class linked these variables will also be created
	  Node head;//contains the info about first node
	  Node tail;//contains the info about last node
	  int size;//the size of the linked list
	public Linked()
	{
		this.size=0;//when we create a new linked list then the size will be automatically be set to 0
	}
	
	//whenever we want to insert a node at first
 public void insertFirst(int value)
 {
	Node node =new Node(value); 
	node.next=head; //making the created node point to the node which was the already existing list's head
	//if there was no existing list and the head was null so currently this node will point null.
	head = node;//making the created node the head as it will be the beginning of the list.
 
    if(tail == null)//when there is no list then tail will be null so making it point the current created node only.
    {
    	tail = head;
    }
    size++;
 }
 
 //inserting value at last
 public void insertLast(int value)
 {
	 
	 if(tail ==null)//if tail is null then we will add the node and it will be the first node not the last.
	 {
		 insertFirst(value);
		 return;
	 }
	 Node node = new Node(value);
	 tail.next=node; //making the already existing list tail pointing to the new node
	 tail=node;//now making this node as tail
	
	 size++;
 }
 
 //inserting a node at desired position
 public void insert(int value , int pos)
 {
	 try { //we can also just throw the exception and don't need to catch it.
	 if(pos==0)
	 {
		 insertFirst(value);
      }
	 else if(pos ==size)
	 {
		 insertLast(value);
	 }
	 else if(pos>size)//if given position is greater than the size of the list then it will throw an index out of bounds exception.
	 {
		throw new IndexOutOfBoundsException();
	 }
	 else
	 {
		 Node temp=head;
		 for(int i =1;i<pos;i++)//as we are initializing the node with head so we don't need to start the iteration with 0
		 {
			 temp=temp.next;//traversing till before the given position so we can add the node at that position.
		 }
		/* Node node = new Node(value,temp.next);//creating the node and passing the next info so that the newly created node point to the temp.next node
		 temp.next=node;//the node which was being pointed by temp now it's next will be the newly created node.
		*/
		 Node node = new Node(value);
		 node.next=temp.next;
		 temp.next=node; 
		 size++;
	 }
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
 }
 
 //prints the size of the list
 public void size()
 {
	 System.out.println("Size of the list is :"+size);;
 }
 
//delete node from 1st
 public void deleteFirst()
{
	head =head.next;
	 if(head==null)//this means that there was a single element and we are just deleting that
		 tail=null;
	size--;
}
 
 //delete node from last
 public void deleteLast()
 {

	 Node temp=head;
	 for(int i =1;i<size-1;i++)
	 {
		 temp=temp.next;//at the end of the loop this temp node will point the node previous of the last node which we want to delete
	 }
	 tail=temp;
	 tail.next=null;
	 size--;
 }
 
 //deletion of a desired node
 public void delete(int pos)
 {
	 if(pos==0)
	 {
		deleteFirst();
	 }
	 else if (pos ==size-1)
	 {
		deleteLast();
	 }
	 else
	 {
		 Node temp=head;
		 for(int i =1;i<pos;i++)
		 {
			 temp= temp.next;//at the end of the loop this temp node will point the node previous of the node which we want to delete
		 }
		 temp.next=temp.next.next;
		 size--;
	 }
	 
 }
 
 //get the value of node of the given index
 public Node find(int value)
 {
	 Node node = head;
	 while(node!=null)
	 {
		 if (node.value==value)
			 return node;
		 node= node.next;
	 }
	 return null;//if nothing is found just return null
 }
 
 //getting the node of that has the particular value
 public int get(int index)
	 {
		 Node node =head;//if the position is given to 0 it will return head value only
		 for(int i =1;i<=index;i++)
		 {
			 node = node.next;
		 }
		 return node.value;
		 
	 }
 
 //for displaying the linked list
 public void display()
 {
	 Node temp=head;
	 //to calculate length of the list
	// int length=0;
	 while(temp!=null)//At the last the tail will always point to the null
	 {
		 
		 System.out.print(temp.value+" -> ");
		// length++;
		 temp=temp.next;
		 
		 
     }
	 System.out.println("End");
	// System.out.println(length);
  }
 
 //removing duplicate nodes from the sorted Linked List
 public void remove_duplicate()
 {
 	Node node= head;
 
 	while(node.next!=null)
 	{
 		if(node.next!=null && node.value==node.next.value)//if the value of the current node is same as that of the next node then we will just break the referring connection and point to the next node
 		{
 			node.next=node.next.next;
 			size--;
 		}
 		else
 		node=node.next;
 	}
 	tail = node;//like if the last node is an duplicate and it gets removed so the node with which it was checked will be marked tail.
 	//if the last node is not an duplicate and we don't remove it then also it will make the last rode referred as tail.
 	tail.next=null;
 }
 
 //merging two sorted list into a single sorted list
 public static Linked merge(Linked first , Linked second)
 {
	 Node f=first.head;
	 Node s = second.head;
	 Linked ans= new Linked();
	 
	 //we will keep checking both the list from the head and who ever has the lowest value, its value will be added to the answer list
	 while(f!=null && s!=null)
	 {
		 if (f.value<s.value)
		 {
			ans.insertLast(f.value);
		    f=f.next;
			 
		 }
		 else
		 {
			 ans.insertLast(s.value);
			 s=s.next;
		 }
	 }
	 //now it may happen that the list are of different lengths and the larger list have values left still, 
	 //so the value will be added to the sorted list as it is till it get reached to null
	 while(f!=null)
	 {
		 ans.insertLast(f.value);
		 f=f.next;
	 }
	 while(s!=null)
	 {
		 ans.insertLast(s.value);
		 s=s.next;
	 }
	 return ans;
	 
 }


 //finding the middle node in a list in a single pass using 2 pointer method
 public int middle()
 // to find the middle of the list in 1 pass we are using two pointers i.e. we are using fast and slow and making one of them move at double speed that of other.
 //so the node moving with double speed will reach the last node of the list at that same time the slower moving node will reach the half length of the faster one i.e. the middle of the list
 {
	 Node fast =head;
	 Node slow= head;
	 while(fast!=null && fast.next!=null)
	 {
		 fast=fast.next.next;
		 slow=slow.next;
	 }
	 return slow.value;
 }
 

//checking that the given list has a cycle list or not
public boolean hasCycle()
{
	Node fast = head;
	Node slow =head;
	while(fast!=null && fast.next!=null)
	{ //to check whether a cycle is present inside a Linked List we use 2 pointers fast and slow, where we move fast by 2 steps and slow by 1 step
		//if fast meet slow again that means they are moving in a cycle, hence there is a cycle present
		fast=fast.next.next;
		slow=slow.next;
		if(fast==slow)
			return true;
	}
	return false;
}


//For finding the length of a cycle inside a Linked List
 public int cycleLength()
 {
	 Node fast = head;
	 Node slow=head;
	 while (fast!=null && fast.next!=null)
	 {
		 fast=fast.next.next;
		 slow=slow.next;
		 if(fast ==slow)
		 {
			 int length=0; //to count the length of the cycle we will make slow move once again in the cycle, when slow and fast meets again the no. of times slowed moved is the length of the cyclic list.
			 do
			 {
				 slow=slow.next;
				 length++;
			 }while(slow!=fast);
			 return length;
		 }
	 }
	 return 0;
 }

 
 //recursive reverse of a list
 public void reverse2(Node node)
 {
	 if(node == tail)
	 {
		 head = tail;
		 return;
	 }
	 reverse2(node.next);
	 //this will happen when returning from a recursive call
	 tail.next=node;
	 tail=node;
	 tail.next=null;
 }
 
 
 //iterative or in-place reversal
 //most important
 //most used
 public void reverse()
 {
	 //here we are 3 using to reference pointer , prev will be pointing to null, present will be pointing the head of the list and nxt will be pointing the present.next element 
	 //we will iterate till present becomes null and that time the prev will point to the last element.
	 //as we iterate or traverse we will make present node point to prev or prev node and make prev =present and present = nxt and will move till nxt != null
	 if(size<2)//this means it has only one node
		 //or we can write if(head==tail)
		 return;
	 Node prev= null;
	 Node present =head;
	 Node nxt = present.next;
	 while(present!= null)
	 {
		 present.next=prev;
		 prev= present;
		 present=nxt;
		 if(nxt!= null)
			 nxt=nxt.next;
	 }
	 head =prev;
 }
 
 
 
}
public class LL {

	public static void main(String[] args) {
		Linked list = new Linked();
		for(int i =1;i<=5;i++)
		{
			list.insertFirst(i);
		}
		list.display();
		list.insertLast(20);
		list.display();
		list.insert(20, 2);
		list.display();
		list.size();
		list.deleteFirst();
		list.display();
		list.size();
		list.delete(2);
		list.display();
	    System.out.println(list.get(3));	
		list.size();
		list.display();
		list.deleteLast();
		list.display();
		
		//for removing duplicate purpose
		Linked list2 = new Linked();
		for(int i =1;i<=5;i++)
		{
			list2.insertFirst(i);
		}
		list2.display();
		list2.insertFirst(5);
		list2.insertLast(1);
		list2.display();
	    list2.remove_duplicate();	
		list2.display();
		
		//for merging two sorted list into a single sorted list
		Linked first = new Linked();
		Linked second = new Linked();
		first.insertFirst(5);
		first.insertFirst(3);
		first.insertFirst(1);
		System.out.println("First list is:");
		first.display();
		second.insertFirst(14);
		second.insertFirst(9);
		second.insertFirst(2);
		second.insertFirst(1);
		System.out.println("Second List is:");
		second.display();
		Linked.merge(first,second).display();
		
		//if the LinkedList has a cycle part
	    System.out.println(list2.hasCycle());
		// finding the middle of a list
	    System.out.println(list2.middle());

	    //reversing a list
	     list2.display();
	     list2.reverse();
	     System.out.println("Reversed form of the list is");
	     list2.display();
	     
	    
		
	}

}

