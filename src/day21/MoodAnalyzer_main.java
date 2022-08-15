package day21;

import java.util.Scanner;

public class MoodAnalyzer_main {
	/**
	 * Main method to get uer input
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		MoodAnalyzer_func mf = new MoodAnalyzer_func();
		System.out.println("Say about your mood");
		String mood = sc.nextLine();
		mood=mood.trim();
		mood = mood + " ";
		while (flag) {
			System.out.println("1.Analyse\n2.Exit program");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println(mood+"|");
				mf.analyze(mood);
				break;
			case 2:
				flag = false;
				break;
			}
		}
		sc.close();

	}

}
