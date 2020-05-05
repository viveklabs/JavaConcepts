package collectionConcept;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put(1, "vivek");
		h.put('c',"prasad");
		h.put("vk", 23.43);
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		System.out.println(h.get('c'));
		System.out.println(h.get("vk"));
		
		System.out.println("*************************");
		System.out.println(h.values());
		
		
		System.out.println("*************************");
		
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(2,344);
		
		System.out.println(h1.get(2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
