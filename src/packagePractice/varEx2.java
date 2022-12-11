package packagePractice;

public class varEx2 {
	 int a =2; // instance variable
	 int b=8;  // instance variable
	
	public static void main(String[] args) {
		
		varEx2 vE1 = new varEx2();
		
		System.out.println(vE1.a);   // 2
		System.out.println(vE1.b);     //8
		
		varEx2 vE2 = new varEx2();
		
		System.out.println(vE2.a);   //2
		System.out.println(vE2.b);    //8
		
		System.out.println("================");
		
		vE2.a = 25;
		vE2.b = 85;
		
		System.out.println(vE1.a);    //2
		System.out.println(vE1.b);    //8
		
		System.out.println(vE2.a);    //25
		System.out.println(vE2.b);   //85
		
		
	}

}
