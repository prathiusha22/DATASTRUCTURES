package DatastructuresAndAlgorithm;

public class PalindromeInteger {

	public static void main(String[] args) {

		int num = 123421;
		String numString = String.valueOf(num);
		int length = numString.length();

		for (int i = 0; i < length / 2; i++) {
			if (numString.charAt(i) != numString.charAt(length - 1 - i)) {
				System.out.println("It is not a Palindrome");
				return;
			}
		}

		System.out.println("It is a Palindrome");

	}
}
