package linearpackage;

import java.util.Scanner;

//	search The target and return the element
public class LinearSearchReturnElement {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		int[] nums= {1,-2,4,66,19,88,3,44,99};
		int target=in.nextInt();
		int ans=linearsearch(nums,target);
		System.out.println("The element "+ ans +" is found.");
	}		
		

		static int linearsearch(int[] arr,int target) {
			if(arr.length==0) {
				return -1;
			}
			
//			run a FOR EACH loop
			for (int element:arr) {
				if(element==target) 
					return element;		
			}
			
//			This line will execute if none of the above return statements have executed
//			hence the target not found
			return Integer.MAX_VALUE;
		}

}
