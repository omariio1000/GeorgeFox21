
/**
 
 */

import java.util.*;

public class Delayed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		float[] answers = new float[N];
		for (int i = 0; i < N; i++) {
			float k = scanner.nextInt();
			float p = scanner.nextInt();
			float x = scanner.nextInt();

			float cost = 1000000000;

			for (int j = 1; j < 10000000; j++) {
				float sum = ((k / j) * p) + (j * x);
				if (sum < cost && sum > 0) {
					cost = sum;
				}
			}
			answers[i] = cost;
		}

		for (int i = 0; i < answers.length; i++) {
			if (i != answers.length - 1) {
				System.out.printf("%.3f\n", answers[i]);
			} else {
				System.out.printf("%.3f", answers[i]);
			}

		}
		scanner.close();
	}
}
