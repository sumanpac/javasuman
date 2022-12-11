package packagePractice;   // return value from a method.

public class MethodEx {
	
		public int Mul(int x, int y) {
		
			int c = x * y;
			return c;
					//System.out.println("Multiplication of ----> " +a +"and"+b+ "is :" + c);

		}
		
	public static void main(String[] args) {
		
		int  p = 5;
		int q = 7;
		
		MethodEx methodEx = new MethodEx();
			
		int c = methodEx.Mul(p, q);
	//	System.out.println(c);
		
		System.out.println("Multiplication of ----> " +p +"and"+q+ "is :" + c);

		}
			
	}
	
	
