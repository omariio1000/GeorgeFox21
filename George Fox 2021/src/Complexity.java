
/**
 
 */

import java.util.*;

//import java.util.HashMap;
import java.util.ArrayList;

public class Complexity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] answers = new int[N];
		for (int i = 0; i < N; i++) {
			String input = scanner.nextLine();
			HashMap<Character, Integer> values = new HashMap<Character, Integer>();
			for (int j = 0; j < input.length(); j++) {

				int count = 0;
				if (values.get(input.charAt(j)) == null) {
					for (int k = 0; k < input.length(); k++) {
						if (input.charAt(j) == input.charAt(k)) {
							count++;
						}
					}
					values.put(input.charAt(j), count);
				}
			}
			/*
			 * ArrayList<Character> u = new ArrayList<Character>(); for (int j = 0; j <
			 * input.length(); j++) { boolean matched = false; for (int k = 0; k < u.size();
			 * k++) { if (u.get(k) == input.charAt(j)) { matched = true; } } if (!matched) {
			 * u.add(input.charAt(j)); } }
			 */

			if (values.size() > 2) {
				answers = remake(input, values, i, 1, answers);
				//answers[i] = u.size() - 2;
			} else {
				answers[i] = 0;
			}
		}
		// int sum=0;
		for (int i = 0; i < answers.length; i++) {
			// sum+= answers[i];
			System.out.println(answers[i]);
		}
		// System.out.println(sum);
		scanner.close();
	}

	private static int[] remake(String input, HashMap<Character, Integer> values, int index, int times, int answers[]) {
		// TODO Auto-generated method stub
		char remove = ' ';
		int lowest = 100000;
		for (int i = 0; i < input.length(); i++) {
			if (values.get(input.charAt(i)) < lowest) {
				lowest = values.get(input.charAt(i));
				remove = input.charAt(i);
			}
		}
		String toRemove = "";
		toRemove += remove;

		String remade = input.replaceFirst(toRemove, "");
		HashMap<Character, Integer> newVals = new HashMap<Character, Integer>();
		for (int j = 0; j < remade.length(); j++) {
			int count = 0;
			if (newVals.get(remade.charAt(j)) == null) {
				for (int k = 0; k < remade.length(); k++) {
					if (remade.charAt(j) == remade.charAt(k)) {
						count++;
					}
				}
				newVals.put(remade.charAt(j), count);
			}
		}
		if (newVals.size() > 2) {
			times++;
			remake(remade, newVals, index, times, answers);
		} else {
			answers[index] = times;
		}
		return answers;

	}
}
