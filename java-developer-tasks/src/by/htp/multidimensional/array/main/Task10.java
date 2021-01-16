package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		createMas(mas);
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%2d ", mas[i][j]);

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Положительные элементы главной диагонали: ");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] > 0) {
				System.out.print(mas[i][i] + " ");
			}

		}

	}

	public static void createMas(int[][] mas) {
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextInt(10) - 5;

			}

		}

	}

}
