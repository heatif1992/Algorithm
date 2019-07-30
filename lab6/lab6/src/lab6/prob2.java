package lab6;

import sortroutines.MergeSort;

public class prob2 {
	
	public static int[] arrange(int[] a) {
		
		if(a.length<2) return a;
		
		//sorting the array
		MergeSort ms=new MergeSort();
		ms.sort(a);
		
		
		int b[]=new int[a.length];
		int j=0;
		
			for(int i=0;i<a.length/2;i++) {
				b[j]=a[i];
				b[j+1]=a[a.length-1-i];
				j+=2;
			}

		if(a.length%2!=0) b[a.length-1]=a[a.length/2];
		
		return b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,1,2,3,10,5,4,7,8,20,1,12};
		a=arrange(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
