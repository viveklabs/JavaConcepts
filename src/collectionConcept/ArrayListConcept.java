package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); // use indexing concept

		ar.add(100);
		ar.add("vivek");
		ar.add(23.43);
		ar.add('c');
		ar.add(true);

		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));
		}

		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ar1.add(123);
		ar1.add(234);
		ar1.add(333);
		ar1.add(2);
		ar1.add(100);

		System.out.println(ar1.size());

		// using for loop for traversion the array list
		for (int i = 0; i < ar1.size(); i++) {

			System.out.println(ar1.get(i));
		}

		System.out.println("************************");

		// using iterator for traversing array list
		System.out.println("using itergator");

		Iterator it = ar1.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		// add all - merging two arraylist

		System.out.println("add all from ar1 to ar");

		ar.addAll(ar1);

		Iterator it1 = ar.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		// retain all - print common values in both array
		System.out.println("retain all");
		System.out.println();

		
		ArrayList ar3 = new ArrayList(); // use indexing concept

		ar3.add(100);
		ar3.add("vivek");
		ar3.add(23.43);
		ar3.add('c');
		ar3.add(true);
		
		
		ArrayList<Integer> ar4 = new ArrayList<Integer>();

		ar4.add(123);
		ar4.add(234);
		ar4.add(333);
		ar4.add(2);
		ar4.add(100);
		
		ar3.retainAll(ar4);

		
		  Iterator it2 = ar3.iterator();
		  
		  while(it2.hasNext()) {
		  
		  System.out.println(it2.next()); }
		  
		  
		  Employee e1 = new Employee("vivek",27);
		  Employee e2 = new Employee("vinay", 27);
		  Employee e3 = new Employee("tom",23);
		  
		  ArrayList<Employee> ar9 = new ArrayList<Employee>();
		  
		  ar9.add(e1);
		  ar9.add(e2);
		  ar9.add(e3);
		  
		  
		  System.out.println("*******************************");
		  
		  Iterator it8 = ar9.iterator();
		  
		  
		  while(it8.hasNext()) {
			  
			  Employee emp = (Employee) it8.next();
			  System.out.println(emp.age);
			  System.out.println(emp.name);
			  
			  
			  
			  
		  }
		  
		  
		 

	}

}
