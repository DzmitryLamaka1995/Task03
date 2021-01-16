package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task11 {
	/*
	 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
	 * саму матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {
		int[][] mas = new int[10][20];
		createMas(mas);
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);

			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			int countFive = 0;
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 5) {
					countFive++;
				}

			}
			if (countFive >= 3) {
				System.out.println("В строке " + (i + 1) + ", цифра 5 встречается 3 или более раз");

			}

		}

	}

	public static void createMas(int[][] mas) {
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextInt(15);

			}

		}

	}

}
