package lab1;

public class prob5 {
	
	public static int secondSmallest(int[] arr) {
		
		int m1;
		int m2;
		
		if(arr==null || arr.length < 2) {
		throw new IllegalArgumentException("Input array too small");
		}
		
		if(arr[0]>arr[1]) {
			m1=arr[1];
			m2=arr[0];
		}else {
		
			m2=arr[1];
			m1=arr[0];
		}
		
		for(int i=2;i<arr.length;i++) {
			if(m1>arr[i]) {
				m2=m1;
				m1=arr[i];
			}
			else if(m1<arr[i] && m2>arr[i]) m2=arr[i];
				
		}
		return m2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {5,4,2,1,7,3,6,9,8,12,4,5,0,4,3,2};
		System.out.println(secondSmallest(a));

	}

}
