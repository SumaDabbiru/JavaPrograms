import java.util.*;
public class Collections {
	public static void main(String args[]){  
		
		//Creating arraylist . It follows insertion order
	
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("1");//Adding object in arraylist  
		al.add("2");  
		al.add("3");  
		al.add("This");
		al.add("is"); 
		al.add("ArrayList"); 
        for (int i = 1; i <= 5; i++) 
            al.add("i"); 
  
        // Printing elements 
        System.out.println(al); 
  
        // Remove element at index 3 
        al.remove(3); 
  
        // Displaying the ArrayList 
        // after deletion 
        System.out.println(al); 
//		for (int i = 0; i < al.size(); i++) 
//            System.out.print(al.get(i) + " "); 
		
		//Traversing list through Iterator  
		Iterator<String> itr = al.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			} 
	
		//Creating Linkedlist . It follows insertion order
			
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("This");  
		ll.add("is");
		ll.add("Linked");  
		ll.add("List");  
		Iterator<String> itr1=ll.iterator();  
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
			} 
		//Creating Vector . It follows insertion order
		Vector<String> v=new Vector<String>();  
		v.add("This");  
		v.add("is");  
		v.add("Vector");  
		v.add("1");  
		Iterator<String> itr2=v.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next()); 
		}  
		
		// Creating Stack
		Stack<String> stack = new Stack<String>();  
		stack.push("This ");  
		stack.push("is");  
		stack.push("Stack"); 
		stack.push("push");  
		stack.add("add"); 
		Iterator<String> itr3=stack.iterator();  
		while(itr3.hasNext()){  
		System.out.println(itr3.next()); 
		}
		
        stack.pop(); 
        System.out.println("After pop");
        // Iterator for the stack 
        Iterator<String> itr13=stack.iterator();  
		while(itr13.hasNext()){  
		System.out.println(itr13.next()); 
		}
		
		//Priority Queue
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
		queue.add("First"); 
		queue.add("This");  
		queue.add("is");  
		queue.add("Priority Queue");  
		queue.add("last");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr4=queue.iterator();  
		while(itr4.hasNext()){  
			System.out.println(itr4.next());  
		}
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr5=queue.iterator();  
		while(itr5.hasNext()){  
			System.out.println(itr5.next());  
		} 
		
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("1.This");  
		deque.add("2.");  
		deque.add("3.Dequeue");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		
		// clear() method 
        deque.clear(); 
  
        // addFirst() method to insert the 
        // elements at the head 
        deque.addFirst("1.addFirst"); 
        deque.addFirst("2.addFirst"); 
  
        // addLast() method to insert the 
        // elements at the tail 
        deque.addLast("1.addLast"); 
        deque.addLast("2.addLast"); 
  
        System.out.println(deque); 
		
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("1.Amy");  
		set.add("2.Ron");  
		set.add("3.Harry");  
		set.add("4.Hermy");  
		set.add("4.Hermy"); 
		//Traversing elements  
		Iterator<String> itr6=set.iterator();  
		while(itr6.hasNext()){  
		System.out.println(itr6.next());  
		}
		
		//LinkedHashSet . no duplicated. indertion order
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("This one is");  
		set1.add("Linked");  
		set1.add("Hash");  
		set1.add("Set"); 
		set1.add("Hash"); 
		Iterator<String> itr7=set1.iterator();  
		while(itr7.hasNext()){  
		System.out.println(itr7.next());  
		}
		
		//Creating and adding elements  to TreeSet . no duplicates. ascending order
		TreeSet<String> set2=new TreeSet<String>();  
		set2.add("This one is");  
		set2.add("Tree"); 
		set2.add("z");
		set2.add("Set");  
		set2.add("Tree"); 
		set2.add("A"); 
		//traversing elements  
		Iterator<String> itr8=set2.iterator();  
		while(itr8.hasNext()){  
			System.out.println(itr8.next());  
		} 
		
		
	}  
}
