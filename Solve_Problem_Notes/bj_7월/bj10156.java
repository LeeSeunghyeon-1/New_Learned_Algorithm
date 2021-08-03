package Solve_Problem_Notes.bj_7월;

import java.util.Scanner;

public class bj10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int result = array[0] * array[1] - array[2];

		if (result <= 0) {
			result = 0;
		}

		System.out.print(result);

	}

}
