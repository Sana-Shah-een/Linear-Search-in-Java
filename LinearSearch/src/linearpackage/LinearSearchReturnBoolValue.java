package linearpackage;

import java.util.Scanner;

public class LinearSearchReturnBoolValue {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int[] nums= {1,-2,4,66,19,88,3,44,99};
		int target=in.nextInt();
		boolean ans=linearsearch(nums,target);
		System.out.println( ans );
	}		
		

		static boolean linearsearch(int[] arr,int target) {
			if(arr.length==0) {
				return false;
			}
			
//			run a FOR EACH loop
			for (int element:arr) {
				if(element==target) 
					return true;		
			}
			
//			This line will execute if none of the above return statements have executed
//			hence the target not found
			return false;
		}

}
