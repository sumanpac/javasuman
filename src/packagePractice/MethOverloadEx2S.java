//method overloading example with same args but diff order 
package packagePractice;
public class MethOverloadEx2S {

		
public void addthis(int n1, String st1) {   //addthis is a method name with int, & string args
	System.out.println(n1+st1);
	
	}

public void addthis(String st1, int n1)		//addthis method here with diff order of args - string first and int next
{
	System.out.println(st1+n1);
}
		
		public static void main(String[] args){
			
			int a=15;
					String s="something";
		
						MethOverloadEx2S methoverloadex2s = new MethOverloadEx2S();
		
		methoverloadex2s.addthis(a,s);
		
		methoverloadex2s.addthis(s,a);
		
			
		
	}
	
}
