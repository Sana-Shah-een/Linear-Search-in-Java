package linearpackage;


//	 Find Minimum element in the array
public class SearchMinElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,-2,99,66,0};
		System.out.println(min(arr));
	}
	
	static int min(int[] arr) {
		if (arr.length==0) {
			return -1;
		}
		
		int minimum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		return minimum;
	}

}
