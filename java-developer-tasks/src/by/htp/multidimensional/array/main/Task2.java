package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task2 {
	// 2. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		createMas(mas);
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();
		int k = 2;// строка
		int p = 3; // столбец
		System.out.println(k + " строка матрицы :");
		for (int i = 0; i < mas[k].length; i++) {
			System.out.print(mas[k-1][i] + " ");

		}
		System.out.println();
		System.out.println(p + " столбец матрицы :");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][p-1] + " ");

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
