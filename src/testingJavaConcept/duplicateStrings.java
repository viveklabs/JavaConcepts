package testingJavaConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateStrings {
	
	public static void findDuplicates(String inputString) {
		
		String words[] = inputString.split(" ");
		
		Map<String, Integer> mapString = new HashMap<String, Integer>();
		
		for (String str:words) {
			
			if (mapString.containsKey(str)) {
				
				mapString.put(str, mapString.get(str)+1);
			}else {
				
				mapString.put(str, 1);
			}
		}
		
		Set<String> s1 = mapString.keySet();
		
		String s2 = "";
		
		for (String word : s1) {
			
			if (mapString.get(word)>1) {
				
				System.out.println(word + ":"+ mapString.get(word));
				
				
				
				s2 = s2  + word + ",";
			}
		}
		
		System.out.println(s2);
		
	}
	
	

	public static void main(String[] args) {
		
		findDuplicates("java is very good java and is good java");
		findDuplicates("100 200 300 100 100 300");
		

	}

}
