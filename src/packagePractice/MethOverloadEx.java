package packagePractice;

public class MethOverloadEx {

	
		
		public void addnos(int n1, int n2) {
			System.out.println(n1+n2);
		}
		
		public void addnos(int n1, int n2, int n3)
		{
			System.out.println(n1+n2+n3);
		}
		
		public static void main(String[] args) {

		int a=10;
		int b=25;  int c=5;
		
		MethOverloadEx methover1 = new MethOverloadEx();
		
		//methover1.addnos(a,b);
		
		methover1.addnos(a,b,c);
		
			
		
	}
	
}
