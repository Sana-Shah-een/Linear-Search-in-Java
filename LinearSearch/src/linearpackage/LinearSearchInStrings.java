package linearpackage;

public class LinearSearchInStrings {

	public static void main(String[] args) {
		String name="Sana";
		char target='i';
		boolean ans=search(name,target);
		System.out.println(ans);
	}
	
	static boolean search(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
