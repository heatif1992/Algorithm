package lab4;

import java.util.List;

public class prob5 {

	public static void reverse(int[] a, int i, int j) {
		
		if(i>j) return;		
		int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
			reverse(a,i+1,j-1);
	}
	
	public static void main(String[] args) {


		int[]a= {0,1,2,3,4,5,6};
		reverse(a,0,a.length-1);

		for(int i=0;i<a.length;i++) System.out.print(" " + a[i]);
		
	}

}
