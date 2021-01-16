package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task3 {
	/*
	 * 3. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
	 * первая строка справа налево, вторая строка слева направо, третья строка
	 * справа налево и так далее.
	 */

	public static void main(String[] args) {
		int m = 4;
		int n = 6;
		int[][] mas = new int[m][n];
		createMas(mas);
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Результат: ");
		for (int i = 0; i < mas.length; i++) {
			if (i == 0 || i % 2 == 0) {
				for (int j = 1; j <= mas[i].length ; j++) {
					System.out.print(mas[i][mas[i].length - j] + " ");

				}
				System.out.println();
			} else {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(mas[i][j] + " ");

				}
				System.out.println();
			}

		}

	}

	public static void createMas(int[][] mas) {
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextInt(10);

			}

		}

	}

}
