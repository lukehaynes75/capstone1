package capstoneweek1;

import java.util.Scanner;

public class pigLatin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String forward = "yes";

		while (forward.equalsIgnoreCase("yes")) {
			System.out.println("Please enter a word to be translated to Pig Latin");
			String word = scan.next();
			String str = pigLatin(word);
			if (str == "-1")
				System.out.print("No vowels found." + " Pig Latin not possible");

			else
				System.out.println(str);
			System.out.println(" Would you like to continue? yes/no");
			forward = scan.next();

		}
		scan.close();
	}

	static boolean isVowel(char c) {
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u');
	}

	static String pigLatin(String s) {

		int len = s.length();
		int index = -1;
		for (int i = 0; i < len; i++) {
			if (isVowel(s.charAt(i))) {
				index = i;
				break;
			}
		}

		if (index == -1)
			return "-1";
		
		else if (index == 0)
			return s.substring(index) + "way";
		else
		return s.substring(index) + s.substring(0, index) + "ay";
	}
}