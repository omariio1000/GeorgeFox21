/**
 
 */

import java.util.*;

public class Latin {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] answer = new String[N];
		for (int i = 0; i < N; i++) {
			int rows = Integer.parseInt(scanner.nextLine());
			char[][] input = new char[rows][rows];
			for (int j = 0; j < rows; j++) {
				String temp = scanner.nextLine();
				for (int k = 0; k < input.length; k++) {
					input[j][k] = temp.charAt(k);
				}
			}
			answer[i] = check(rows, input);
		}
		scanner.close();
	}

	private static String check(int rows, char[][] input) {
		// TODO Auto-generated method stub
		boolean notRed = false;
		boolean notL = false;
		
		int row = 0;
		int column = 0;
		
		while (row != rows) {
			
		}
		
		rturn null;
	}
}
 