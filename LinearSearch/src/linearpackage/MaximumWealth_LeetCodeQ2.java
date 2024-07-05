package linearpackage;

//https://leetcode.com/problems/richest-customer-wealth/

public class MaximumWealth_LeetCodeQ2 {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,2,1}
		};
		
		int answer=maxWealth(arr);
		System.out.println(answer);
		

		int answer2=maxWealth(arr);
		System.out.println(answer2);

	}
	
//	METHOD 1: Using For Loop
	
	static int maxWealth(int[][] accounts) {
//		person->row ,account->col
		int answer=Integer.MIN_VALUE;//same as -> int answer=0;
		
		for(int person=0;person<accounts.length;person++) {
//			When start col then take sum for that row
			int rowsum=0;
			for(int account = 0;account<accounts[person].length;account++) {
				rowsum+=accounts[person][account];
			}
//			now we have sum of accounts of person
//			check with overall answer
			if(rowsum>answer) {
				answer=rowsum;
			}
		}
		return answer;
	}
	
	
//	METHOD 2: Using For Each Loop
	
	static int maxWealth2(int[][] accounts) {
		int answer=Integer.MIN_VALUE;
		for(int[] account: accounts) {
			int sum=0;
			for (int element:account) {
				sum+=element;
			}
			if(sum>answer) {
				answer=sum;
			}
		}
		return answer;
	}
}
