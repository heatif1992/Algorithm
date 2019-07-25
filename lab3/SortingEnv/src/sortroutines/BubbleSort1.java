package sortroutines;

import java.util.Arrays;

import runtime.Sorter;


public class BubbleSort1 extends Sorter {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		
		int len = arr.length;
		boolean sorted;
		for(int i = 0; i < len; ++i) {
			sorted=true;
			for(int j = 0; j < len-1; ++j) {
				if(arr[j]> arr[j+1]){
					sorted=false;
					swap(j,j+1);
				}
			}
			if(sorted==true) break;
		}
	}
	
	int[] swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
		
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort bs = new BubbleSort();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}

}