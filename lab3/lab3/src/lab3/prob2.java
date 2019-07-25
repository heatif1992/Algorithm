package lab3;

public class prob2 {

	
	public static int[] sort(int[] t) {
		
		int count0=0;
		int count1=0;
		
		for(int i=0;i<t.length;i++) {
			if(t[i]==0) count0++;
			else if(t[i]==1) count1++;
		}
		
		for(int i=0;i<t.length;i++) {
			if(i+1<=count0) t[i]=0;
			else if(i+1<=count1+count0 && i+1>count0) t[i]=1;
			else t[i]=2;
		}
		
		return t;
	}
	
	public static void main(String[] args) {

		int[]a= {2,2,2,2,2,1,1,1,1,0,0,0,0};
		a=sort(a);
		
		for(int i=0;i<a.length;i++)
		System.out.print(" "+a[i]);
	}

}
