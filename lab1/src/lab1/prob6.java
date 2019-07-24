package lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob6 {
	
	public static int sum(List<Integer> b) {
			return b.stream().mapToInt(Integer::intValue).sum();
	}
	
	
	public static List<Integer> SubsetSum(int[] arr, int k) {
		 
		int s;
		List<List> P=new ArrayList<>();
		List<Integer> S=new ArrayList<>();
		
		P.add(S);
		List<Integer> T=new ArrayList<>();
		//P.add(T);
		if(k==0) return S;
		for(int i=0;i<arr.length;i++){
			
			s=P.size();
			for(int j=0;j<s;j++) {
				T=new ArrayList(P.get(j));
				T.add(arr[i]);
				
				if(sum(T)==k) {
					return T;
				}
				P.add(new ArrayList(T));
				T.clear();
			}
			
		}
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1, 3, 9, 4, 8, 5};
		System.out.println(SubsetSum(a,0));

	}
}
