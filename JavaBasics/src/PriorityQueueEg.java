import java.util.*;
public class PriorityQueueEg {
    
	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();      //Integer
		q.add(22);
		q.add(55);
		q.add(20);
		q.add(8);
		q.add(10);
		
		System.out.println("Current Element");
		System.out.println("First element:" +q.element());
		System.out.println("First element:" +q.peek());
		
		Iterator<Integer> i = q.iterator();
		while(i.hasNext()) {
		 System.out.println(i.next());
		}
		
		System.out.println("After Removing");
		System.out.println("First element:" +q.remove());
		System.out.println("First element:" +q.poll());
		
		Iterator<Integer> r = q.iterator();
		while(r.hasNext()) {
			 System.out.println(r.next());
		}
		
		
		PriorityQueue<String> q1 = new PriorityQueue<String>();             //String
		q1.add("Ram");
		q1.add("pavi");
		q1.add("moni");
		
		System.out.println("Current Elements");
		System.out.println("First element:" +q1.element());
		System.out.println("First element:" +q1.peek());
		
		Iterator<String> i1 = q1.iterator();
		while(i1.hasNext()) {
			 System.out.println(i1.next());
		}
		
		System.out.println("After Removing");
		System.out.println("First element:" +q1.remove());
		System.out.println("First element:" +q1.poll());
		
		
		Iterator<String> r1 = q1.iterator();
		while(r1.hasNext()) {
			 System.out.println(r1.next());
		}
		
		
}
}
