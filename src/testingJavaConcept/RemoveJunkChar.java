package testingJavaConcept;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		String str = "!@#$## vivek @##090#^##$";
		
		str = str.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(str);

	}

}
