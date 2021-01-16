package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] mas = new int[6];
		System.out.println("Линейный массив: ");
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(6);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		int[][] mas2 = new int[mas.length][mas.length];
		mas2[0] = mas;
		for (int i = 1; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) Math.pow(mas2[0][j], i + 1);

			}
		}
		System.out.println("Результат: ");
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				 System.out.printf("%5d ", mas2[i][j]);

			}
			System.out.println();

		}

	}
}
