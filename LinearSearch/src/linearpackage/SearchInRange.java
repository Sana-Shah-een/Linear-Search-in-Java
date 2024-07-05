package linearpackage;

public class SearchInRange {

	public static void main(String[] args) {
		int[] nums= {2,3,4,6,44,22,-2};
		int target=44;
		int ans=search(nums,target,2,5);
		System.out.println(ans);
	}
	static int search(int[] arr,int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		
//		run a for loop
		for (int index=start;index<=end;index++) {
//			check for element at every index if it is = target
			int element = arr[index];
			if(element==target) 
				return index;		
		}
		
//		This line will execute if none of the above return statements have executed
//		hence the target not found
		return -1;
	}
}
