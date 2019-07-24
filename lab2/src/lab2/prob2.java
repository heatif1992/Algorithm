package lab2;

public class prob2 {
	
	
	public static int[] merge(int[] a,int[] b) {
		
		int i=0;
		int j=0;
		int k=0;
		int[] merged=new int[a.length+b.length];
		

			while(i+j<merged.length) {
				if(i!=a.length && a[i]<b[j]) {
					merged[k]=a[i];
				    i++;
					k++;
				}
				else if(j!=b.length) {
					merged[k]=b[j];
					j++;
					k++;
				}
				if(j==b.length) {
					while(i+j<merged.length) {
						merged[k]=a[i];
					    i++;
						k++;
					}
				}
			}

		return merged;
		
	}

	public static void main(String[] args) {

		int[] b= {2, 4, 23, 25};
		int[] a= {2, 4, 8, 11, 13, 21, 23, 25};
		
		int[] m=merge(a,b);
		
		for(int i=0;i<m.length;i++)
		System.out.print(" "+m[i]);
		
	}

}
