package packagePractice;

public class varEx1 {
	static int a =2;
	static int b=8;
	
	public static void main(String[] args) {
		
		varEx1 vE1 = new varEx1();
		
		System.out.println(vE1.a);
		System.out.println(vE1.b);
		
		varEx1 vE2 = new varEx1();
		
		System.out.println(vE2.a);
		System.out.println(vE2.b);
		
		System.out.println("================");
		
		vE2.a = 25;
		vE2.b = 85;
		
		System.out.println(vE1.a);
		System.out.println(vE1.b);
		
		System.out.println(vE2.a);
		System.out.println(vE2.b);
		
		
	}

}
