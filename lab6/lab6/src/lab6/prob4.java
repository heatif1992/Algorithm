package lab6;

import java.util.List;

public class prob4 {
	
	public static int occurOnce(int[] a) {
		
		int[][] b=new int[3*a.length][2];
		int[][] c=new int[a.length][2];
		
		for(int i=0;i<a.length;i++) {
			if(b[a[i]][0]==0) {
				b[a[i]][0]=i+1;
				b[a[i]][1]++;
			}
			else {
				b[a[i]][1]++;
			}
			
		}
		
		//int j=0;
		for(int i=0;i<b.length;i++) {
			if(b[i][0]>0) {
				c[b[i][0]-1][0]=i;
				c[b[i][0]-1][1]=b[i][1];
				//j++;
			}
		}
		
		for(int i=0;i<c.length;i++) {
			if(c[i][1]==1) {
				return c[i][0]; 
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] a={1, 2, 4, 9, 3, 2, 1, 4, 5};
		
		System.out.println(occurOnce(a));
	}

}
