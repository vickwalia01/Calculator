package Array;
import java.util.LinkedList;
public class Array_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// linked list is useful for faster insertion and deletion but it hold more memory overhead than arraylist. 
//linkedlist each node holds both data and address of next and previous node thats why holds more memory. 		
		LinkedList<String> name=new LinkedList<String>();
		name.add("Hotman");
		name.add("Suraj");
		name.add("didi");
		name.add("Arif");
		name.addFirst("Vick");// to add name to top
		name.add("Rasul");
		name.addLast("Tony");// to add name to last
		name.add(1,"index1");// to a value at a specific index in the list
		name.set(2, "Didi");// to modify list at specific index
		
	//	name.removeLast(); to remove last value
	//	name.removeFirst(); to remove first value
	// name.clear(); to remove all the data from the list
		
		
		for(String x:name)
			System.out.println(x);
		System.out.println(name.size());
		
	}

}
