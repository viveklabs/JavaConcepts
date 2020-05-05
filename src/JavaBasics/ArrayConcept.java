package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=34;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("length is: " + a.length);
		
		
		
		
		char b[] = new char[2];
		b[0]='c';
		b[1]='e';
		System.out.println(b.length);
		
		
		String w[] = new String[2];
		w[0]="vivek";
		w[1]="prasad";
		
		for(int q=0;q<w.length;q++) {
			System.out.println(w[q]);
		}
		
		System.out.println("Object Array - Contains different data types");
		System.out.println();
		Object ob[] = new Object[5];
		ob[0]="vivek";
		ob[1]='d';
		ob[2]=3;
		ob[3]=56.32;
		ob[4]=true;
		
		for (int i=0;i<ob.length;i++) {
			
			System.out.println(ob[i]);
		}
		
	
	}

}
