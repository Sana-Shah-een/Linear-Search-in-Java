package linearpackage;

import java.util.Arrays;

public class SearchinStringUsingForEachLoop {

	public static void main(String[] args) {
		String name="Sana";
		char target='i';
		boolean ans=search(name,target);
		System.out.println(ans);
		
		
//		name.toCharArray() -> convert String into Char Array
		System.out.println(Arrays.toString(name.toCharArray()));
	}
	
	static boolean search(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		
		for(char ch:str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}

}
