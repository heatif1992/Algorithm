package lab8;

public class prob3 {
	
	public static boolean isPrime(int n, int i) {
		if(n==1) return false;
		if(n==2) return true;
		if(i*i>n) return true;
		if(n%i==0) return false;
		else i++;
		return isPrime(n,i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(1, 2));
		System.out.println(isPrime(7, 2));
		System.out.println(isPrime(225, 2));
	}

}
