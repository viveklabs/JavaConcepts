package JavaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		
		String s[][] = new String[2][3];
		
		System.out.println(s.length); // row
		System.out.println(s[0].length); //column
		
		s[0][0]="v";
		s[0][1]="i";
		s[0][2]="v";
		
		s[1][0]="e";
		s[1][1]="k";
		s[1][2]="p";
		
		System.out.println(s[1][2]);
		System.out.println("----------------");
		System.out.println();
		
		for (int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.println(s[i][j]);
			}
		}
		
			}
		
		
		

	}


