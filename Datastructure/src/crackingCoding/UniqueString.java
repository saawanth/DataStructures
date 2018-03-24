package crackingCoding;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("checking sentence has unique charcters or not :" +UniqueString.isUniqueChar2("abcd"));
	}
	public static boolean isUniqueChar2(String str) {
		boolean[] char_set = new boolean[256];
		for(int i=0;i< str.length();i++) {
			int val= str.charAt(i);
			if (char_set[val]) return false;
			 char_set[val] = true;
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	/*public static boolean isUniqueChars2(String str) {
		 boolean[] char_set = new boolean[256];
		 for (int i = 0; i < str.length(); i++) {
	     int val = str.charAt(i);
		if (char_set[val]) return false;
		 char_set[val] = true;
		}
		return true;
		}*/
}
