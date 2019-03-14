package app.swaroop;

public class Palindrome {

	public static void main(String[] args) {
		String str = "geeks";
		int len = str.length()-1; 
		boolean isPalindrome = false;
		
		for (int i =0; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(len-i)) {
				isPalindrome = true;
			}
			else {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
