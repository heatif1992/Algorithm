package lab1;

public class prob4 {
	
	public static int GCD (int a, int b) {
		  int r;
		  r = a % b;
		  if (r == 0)
		    return b;
		  else
		    return GCD (b, r);
		}

	public static void main(String[] args) {
		
		System.out.println(GCD(12,42));

	}

}
