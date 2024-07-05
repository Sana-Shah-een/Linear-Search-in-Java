package linearpackage;

public class Maxvaluein2DArray {

	public static void main(String[] args) {
		int[][] arr= {
				{1,3,4,5},
				{6,7,8},
				{9,11,22,33},
				{333,444,555,6666}
		};
		
		System.out.println(Integer.MIN_VALUE);
		int ans=max1(arr);
		System.out.println(ans);
		int ans2=max2(arr);
		System.out.print(ans2);
	}
	
	//METHOD 1:
	static int max1(int[][] arr) {
		int maxval=arr[0][0];
		//using For Loop
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>maxval) {
					maxval=arr[row][col];
				}
			}
		}
		return maxval;
	}
	
	//METHOD 2:
	static int max2(int[][] arr) {
		int maximum=Integer.MIN_VALUE;
		//using For Each Loop
		for(int[] ar:arr) {
			for(int element:ar) {
				if (element>maximum) {
					maximum=element;
				}
			}
		}
		return maximum;
		
	}
}
