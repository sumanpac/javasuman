package packagePractice;

public class MethodEx2 {
	
	
		public void Add(int x, int y) {
		int a=x;
		int b=y;
		int c = x + y;
				System.out.println("addition is----> \n" + c);
		}
		
		public void Mul(int x, int y) {
			int a = x;
			int b = y;
			int c = x * y;
			System.out.println("Multiplication of ----> " +a +"and"+b+ "is :" + c);

		}
		
	public static void main(String[] args) {
		
		int  p = 5;
		int q = 7;
		
		MethodEx2 methodEx = new MethodEx2();
		
		methodEx.Add(p, q);
		
		methodEx.Mul(p, q);
	
		}
		
		
	}
	
	
