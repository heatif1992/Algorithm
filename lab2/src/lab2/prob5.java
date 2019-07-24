package lab2;

public class prob5 {

	public static int Fibonacci(int n) {
		
		int f0=0;
		int f1=1;
		int fn=f1+f0;
		int i=2;
		
		if(n==0) return f0;
		else if (n==1) return f1;
		
		while(i!=n) {
		  f0=f1;
		  f1=fn;
		  fn=f0+f1;
		  i++;
		}
				
		return fn;
	}
	
	public static void main(String[] args) {

		System.out.println(Fibonacci(3));
	}

}
