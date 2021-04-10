/**
 
 */

import java.util.*;

public class Fear {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		long[] answers = new long[N];
		for (int i = 0; i < N; i++) {
			String numbers = scanner.nextLine();
			long num1 = 0;
			long num2 = 0;
			String tempNum = "";
			for (int j = 0; j < numbers.length(); j++) {
				if (numbers.charAt(j) == ' ') {
					num1 = Long.parseLong(tempNum);
					tempNum = "";
				}
				else {
					tempNum += numbers.charAt(j);
				}
			}
			num2 = Long.parseLong(tempNum);
			
			long sum = 0;
			for (long j = num1; j <= num2; j++) {
				for (long k = 1; k <= j; k++) {
					if (j % k == 0) {
						sum += k;
					}
				}
			}
			
			
			
			answers[i] = sum;
		}
		scanner.close();
		for (int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);
		}
	}
}
