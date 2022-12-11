package packagePractice;   // strings - concatination

public class MethodEx3 {
	
		public String concat( String st1, String st2) {
			String st3= st1 +" "+ st2;
			return st3;

		}
		
						
	public static void main(String[] args) {
		
		String a= "Pachala";
		String b= "somanna";
				
				MethodEx3 methodEx3 = new MethodEx3();
				
	String c= methodEx3.concat(a, b);
	
	System.out.println(c);
		
	}
}
	
	
