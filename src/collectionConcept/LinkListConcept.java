package collectionConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
		

		LinkedList<String> l = new LinkedList<String>();
		
		l.add("vivek");
		l.add("prasad");
		l.add("TCS");
		l.add("ghatotand");
		
		System.out.println("elements of linkedlist are: " + l);
		
		l.addFirst("Mr");
		l.addLast("west Bokaro");
		
		System.out.println("elements of linkedlist are: " + l);
		
		System.out.println(l.get(0));
		
		System.out.println(l.set(1, "ghatotand"));
		
		System.out.println("elements of linkedlist are: " + l);
		
		l.set(5, "vinay");
		System.out.println("elements of linkedlist are: " + l);
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("elements of linkedlist are: " + l);
		
		//for loop
		System.out.println();
		System.out.println("for loop");
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		System.out.println("while loop");
		//while loop
		int n =0;
		while (l.size()>n) {
			System.out.println(l.get(n));
			n++;
		}
		//iterator
		System.out.println();
		System.out.println("iterator");
		
		Iterator<String> it = l.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//advance for loop
		System.out.println();
		System.out.println("Advance for loop");
		
		for (String str:l) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
