/**
 
 */

import java.util.*;

public class Zeros {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] answers = new String[N];
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			number++;
			String numS = String.valueOf(number);
			String reconstructed = "";
			for (int j = 0; j < numS.length(); j++) {
				if (numS.charAt(j) == '0' ) {
					reconstructed += "1";
					if (j != numS.length() - 1) {
						if (numS.charAt(j+1) != '0') {
							reconstructed += "1";
						}
					}
				}
				else {
					reconstructed += numS.charAt(j);
				}
			}
			answers[i] = reconstructed;
		}
		for (int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);
		}
		scanner.close();
	}
}
 