package linearpackage;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{1,3,45,66},
				{12,33,77},
				{11,322,334,66,8},
				{0,44,678,999}
		};
		
		int target=334;
		int[] ans=searching(arr,target);
		System.out.print(Arrays.toString(ans));
	}
	 
	static int[] searching(int[][] arr,int target) {
		for(int row = 0; row<arr.length ; row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
}
