package linearpackage;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class CountEvenDigitsInArray_LeetCodeQ1 {
	public static void main(String[] args) {
		int[] arr = {12,345,2,6,7896};
		System.out.println(findnums(arr));
		System.out.println(digits2(0));
		
	}
	
	static int findnums(int[] nums) {
		int count=0;
		for(int num:nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean even(int num) {
		int numofdigits=digits(num);
//		if(numofdigits%2==0) {
//			return true;
//		}
//		return false;
		return numofdigits%2==0;
	}
	
	//First way to find number of digits
	static int digits(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		
		return count;
	}
	

	//Second way to find number of digits 
	
	static int digits2(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		return (int)(Math.log10(num))+1;
	}
}
