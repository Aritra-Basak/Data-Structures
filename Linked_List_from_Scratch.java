package technicals;
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
		//constructor that can be used for creating and adding values with giving the next Node info
		public Node (int value, Node next)
		{
			this.value=value;
			this.next=next;
		}
	} 
	 //every time we create an object reference of the class linked these variables will also be created
	private Node head;//contains the info about first node
	private Node tail;//contains the info about last node
	private int size;//the size of the linked list
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
	 try {
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
		 Node node = new Node(value,temp.next);//creating the node and passing the next info
		 temp.next=node;//the node which was being pointed by temp now it's next will be the newly created node.
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
		 Node node =head;
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
	 while(temp!=null)//At the last the tail will always point to the null
	 {
		 
		 System.out.print(temp.value+" -> ");
		 temp=temp.next;
		 
     }
	 System.out.println("End");
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
		
	}

}
