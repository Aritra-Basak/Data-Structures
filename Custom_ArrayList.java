package technical;
import java.util.*;

public class CustomizedList <T> //passing the requested generic type as T
{
	 private Object[] data;
	 private static int DEFAULT_SIZE=10;
	 private int size =0;
	
	 //creating an array of length DEFAULT_SIZE
public CustomizedList() 
	{
		data = new Object[DEFAULT_SIZE];//We can’t create an instance of generic type because during the run time the byte code cannot figure out the generic’s type
		//So we are using Object which is the top most class and every classes are child classes of Object Class. So instead Of converting JVM just inherit the property of the given data type.
	}

//adding the elements in the list
 public void add(T num)
 {
	 if(isFull())//checking the all the index is filled up or not i.e checking the array is full or not
	 {
		 resize(); //if full then the size will be doubled 
	 }
	 data[size++]=num; //if not full then the elements are put in the array
 }
 
 //method meant for resizing the array
 private void resize()
 {
 Object [] temp = new Object[data.length*2];
 //copying the current elements inside the new array.
 for(int i =0;i<data.length;i++)
 {
	 temp[i]=data[i];
 }
 data = temp; //copying the new temp array in the data array, so we can again reuse the temp array
 }
 
 //method checking whether the array is full or not
 private boolean isFull()
 {
	 return (size==data.length);
 }
 
 //method for removing an element of desired position
 public void remove(int index)
 {
	 T removed =(T) (data[index]);//We are removing an element of type T not of Object so we need to typecast it
	 data[index]=null;
	 System.out.println("Removed element is "+removed);
 }
 
 //returning the data of the given index
 public void get (int index)
 {
	 System.out.println(data[index]);
 }
 
 //returning the size of the Arraylist
 public void size()
 {
	 int count=0;
	 for(Object ele:data)
	 {
		 if (ele!= null)
			 count++;
	 }
	 System.out.println("Size is: "+count);
	 
 }
 
 //setting the given value in the index
 public void set(int index, T value)
 {
	 data[index] = value;
 }
 
 //we are overriding the toString method and creating of our own.
 @Override
 public String toString()
 {
	 return "CustomizedList: \n{\n" + 
 "data =" + Arrays.toString(data) +
 "\n}";
 }
	public static void main(String[] args) {
		CustomizedList<Integer> list = new CustomizedList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.size();
		System.out.println(list);
		list.remove(2);
		list.size();
		System.out.println(list);
		CustomizedList<String> list2 = new CustomizedList<>();
		list2.add("My");
		list2.add("Name");
		list2.add("is");
		list2.add("Aritra");
		System.out.println(list2);
		list2.get(3);
	}

}
