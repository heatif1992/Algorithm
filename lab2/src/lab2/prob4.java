package lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob4 {
	
	
	public static List<List> powerSet(int[] arr) {
		 
		int s;
		List<List> P=new ArrayList<>();
		List<List> S=new ArrayList<>();
		
		P.add(S);
		List<Integer> T=new ArrayList<>();
		

		if(arr.length==0) return P;
		
		for(int i=0;i<arr.length;i++){
			s=P.size();
			for(int j=0;j<s;j++) {
				T=new ArrayList(P.get(j));
				T.add(arr[i]);
				P.add(new ArrayList(T));
				T.clear();
			}
		}
		return P;
	}


	public static void main(String[] args) {

		int[]a= {1,2,3,4};
		System.out.println(powerSet(a));

	}
}
