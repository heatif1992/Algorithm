package lab3;

public class prob4 {

	public static int count01(int[] a, int i, int j) {

		     if(a[i]==1) {
		    	 System.out.println("number of 1: " + a.length + " number of 0: 0");
		    	 return 0;
		     }
		     else if(a[j]==0) {
		    	 System.out.println("number of 1: 0" + " number of 0: "+ a.length);
		    	 return 0;
		     }
			if(a[(i+j+1)/2]==0 && a[((i+j+1)/2)+1]==1){
				
				System.out.println("number of 1: "+ (a.length-((i+j+1)/2+1)) + " number of 0: "+ ((i+j+1)/2+1));
		    	 return 0;
			}
			if(a[(i+j+1)/2]==1 && a[((i+j+1)/2)-1]==0) {
				System.out.println("number of 1: "+ (a.length-((i+j+1)/2) + " number of 0: "+ ((i+j+1)/2)));
				return 0; 
			}
			if(a[(i+j+1)/2]==0 && a[((i+j+1)/2)+1]==0){
				
				return count01(a,(i+j+1)/2,j);
			}
			else{				
				return count01(a,i,(i+j+1)/2);
			}
	}
	
	public static void main(String[] args) {

		int[]a= { 0,0, 1, 1, 1, 1,1 };
	

		System.out.print(count01(a,0,a.length-1));
		
	}
}
