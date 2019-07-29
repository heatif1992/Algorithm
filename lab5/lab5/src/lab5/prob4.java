package lab5;

public class prob4 {

	public static boolean equalIndex(int[] a, int i, int j) {
		
		if(i==a[i] || j==a[j]) {
			System.out.println("i= "+i +"    " + "j= "+j );
			return true;
		}
		if(i!=a[i] && j!=a[j] && (i==j || j==i+1)) return false;
			
		if(i<a[i] && j>a[j] && (i+j)/2<=a[(i+j)/2]) return equalIndex(a, (i+j)/2, j);
		else if(i<a[i] && j>a[j] && (i+j)/2>=a[(i+j)/2]) return equalIndex(a, i, (i+j)/2);
		else if(i>a[i] && j<a[j] && (i+j)/2>=a[(i+j)/2]) return equalIndex(a, (i+j)/2, j);
		else if(i>a[i] && j<a[j] && (i+j)/2<=a[(i+j)/2]) return equalIndex(a, i, (i+j)/2);

		return false;
	}
	public static void main(String[] args) {
		
		int[]a= {-1,0,1,2,3,4,5,6,8,12,45,55,66,99,400};
		int[]b= {-1,0,1,2,3,4,5,7,10,12,45,55,66,99,400};
		int[]c= {-1};
		int[]e= {-1,0,1,2,3,4,5,6,10,12,45,55,66,99,400};
		int[]f= {0};

		System.out.print(equalIndex(a, 0, a.length-1));
		System.out.println();
		System.out.print(equalIndex(b, 0, b.length-1));
		System.out.println();
		System.out.print(equalIndex(c, 0, c.length-1));
		System.out.println();
		System.out.print(equalIndex(e, 0, e.length-1));
		System.out.println();
		System.out.print(equalIndex(f, 0, f.length-1));

	}

}
