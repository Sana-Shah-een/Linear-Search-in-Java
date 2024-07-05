package linearpackage;

import java.util.*;
//      Searching in the array : return the index if item found 
//		otherwise if item not found then return -1
public class LinearSearchReturnIndex {

	public static void main(String[] args) {

//		Time Complexity of LS in best case is O(1)
//		In Worst Case it is O(n)
//		Space complexity in LS is also Constant O(1)
		
//		Space Complexity mean that are you taking extra space
		Scanner in= new Scanner(System.in);
		int[] nums= {1,-2,4,66,19,88,3,44,99};
		int target=in.nextInt();
		int ans=linearsearch(nums,target);
		System.out.println("The "+ target+ " is found at "+ ans+ " index");
	}		
		

		static int linearsearch(int[] arr,int target) {
			if(arr.length==0) {
				return -1;
			}
			
//			run a for loop
			for (int index=0;index<arr.length;index++) {
//				check for element at every index if it is = target
				int element = arr[index];
				if(element==target) 
					return index;		
			}
			
//			This line will execute if none of the above return statements have executed
//			hence the target not found
			return -1;
		}
}
	


