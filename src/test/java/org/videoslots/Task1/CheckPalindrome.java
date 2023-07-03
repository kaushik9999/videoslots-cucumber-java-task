package org.videoslots.Task1;

public class CheckPalindrome {

	public static boolean testPlindrome(String input) {
		String reverseInput = "";
		int length = input.length();

		for (int i = (length - 1); i >= 0; --i) {
			reverseInput = reverseInput + input.charAt(i);
		}

		if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
			System.out.println("Palindrome");
			return true;
		} else {
			System.out.println("Not a Palindrome");
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean out =CheckPalindrome.testPlindrome("BABAB");
		System.out.println(out);
	}

}
