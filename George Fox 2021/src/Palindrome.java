/**
 
 */

import java.util.*;

public class Palindrome {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] answers = new String[N];
		for (int i = 0; i < N; i++) {
			String p = scanner.nextLine();
			int l = p.length() + 1;
			if (l % 2 == 0) {
				answers[i] = "Odd.";
			}
			else {
				answers[i] = "Or not.";
			}
		}
		for (int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);
		}
		scanner.close();
	}
}
 