package DatastructuresAndAlgorithm;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String s = "madam";
		
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length / 2; i++) {
			
			if (arr[i] != arr[arr.length - 1 - i]) {
				
				System.out.println("It is not a Palindrome");
				return;
			}
		}
 
		System.out.println("It is a Palindrome");
		
	}
}
