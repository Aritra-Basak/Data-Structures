package technical;
import java.util.*;
class Double_Linked
{
	private class Node 
	{
		int value;
		Node next;
		Node previous;
		public Node(int value)
		{
			this.value=value;
		}
	}
    
	Node head;
	Node tail;
	int size;
	public Double_Linked()
	{
		this.size=0;
	}
	 
	//inserting node at beginning
	public void insertFirst(int value)
	{
		Node node = new Node(value);
		node.next=head; //if head is null then it will be first created node and it will point to null or else if there exist a list already then this node will point to that list head
		node.previous= null;//the head or the new node created now will point null in back direction always
		if(head!= null)//if head is not null then the head referred node will point to this new node as a back connection with .previous
			head.previous=node;
		head= node;
		if(tail == null)
			tail=head;
		size++;
	}
	
	//inserting a node at last
	public void insertLast(int value)
	{
		if (tail == null)//this means that there is no node at all so the insertFirst method will be called.
		{
			insertFirst(value);
		}
		else
		{
			Node node = new Node(value);
			tail.next=node;//making tail reference node to point to the newly created node
			node.previous=tail;//making the new node point to the tail referred node as a back connection with .previous
			node.next=null;//making the new node point to null with .next;
			tail = node;//now making the node referred as tail
			size++;
		}
	}
	
	//inserting at a desired position
	public void insert(int value , int pos)
	{
		if(pos==0)
			insertFirst(value);
		else if (pos <size && pos >0)
		{
			Node temp=head;
			for(int i =1;i<pos;i++)
			{
				temp = temp.next;
			}
			Node node= new Node(value);
			node.next=temp.next;//making the node point to next node which was earlier pointed by temp using .next
			temp.next.previous=node;//making the next node or the temp.next node point the newly created node as a backward connection with .previous
			node.previous=temp;
			temp.next=node;
			size++;
			
		}
		else if (pos==size)
		{
			insertLast(value);
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
	}
	
    //delete from position
	public void delete(int pos)
	{
		if (pos ==0)
		{
			head = head.next;
			if(head ==null)//if there was only one single element and head and tail were both pointing to that so making it delete will make head point to null so we will make tail also point to null
				tail =null;
			else
				head.previous=null;
			size--;
		}
		else if (pos ==size-1)
		{
			tail=tail.previous;
			if(tail==null)//if there was only one single element and head and tail were both pointing to that so making it delete will make tail point to null so we will make head also point to null
				head=null;
			else
				tail.next=null;
			size--;
		}
		else if (pos>0 && pos <size-1)
		{
			Node temp = head;
			for(int i =1;i<pos;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			temp.next.previous=temp;
			size--;
		}
		else
			throw new IndexOutOfBoundsException();
	}
		
	//getting size
	public void size()
	{
		System.out.println("Size is :"+size+"\n");
	}
	
	//for displaying the nodes in a list format
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ->");
			temp=temp.next;
		}
		System.out.println("End");
		
	}
	
	//Printing the linked list in reverse or just reversing the Linked list
	public void reverse()
	{
		System.out.println("\nReversed Form of the given list is :");
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.value+" ->");
			temp=temp.previous;
		}
		System.out.println("Start\n");
		
		
	}

	//getting the value of an index or given node
	 public int get(int index)
	 {
		 Node node =head; //if the position is given to 0 it will return head value only
		 for(int i =1;i<=index;i++)
		 {
			 node = node.next;
		 }
		 return node.value;
		 
	 }
 
}

public class Double {

	public static void main(String[] args) {
		Double_Linked list = new Double_Linked();
		for(int i =1;i<=5;i++)
		{
			list.insertFirst(i);
		}
		list.display();
		list.insert(22, 4);
		list.insert(200,6);
		list.display();
		list.size();
		list.insertLast(1000);
		list.display();
		System.out.println(list.get(0));
		System.out.println(list.get(list.size-1));
		System.out.println(list.get(2));
		list.reverse();
		list.display();
		list.size();
		list.delete(0);
		list.display();
		list.delete(list.size-1);
		list.display();
		list.delete(1);
		list.display();
		list.reverse();
		list.size();
		
		
	}

}
