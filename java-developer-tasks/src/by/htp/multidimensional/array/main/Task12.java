package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task12 {
	// 12. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
	// в каждом столбце число
	// единиц равно номеру столбца.

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		createMas(mas);
		boolean checkMas = checkMas(mas);
		while (checkMas == false) {
			createMas(mas);

			checkMas = checkMas(mas);

		}

		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}
	}

	public static void createMas(int[][] mas) {
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextInt(2);

			}

		}

	}

	public static boolean checkMas(int[][] mas) {

		for (int i = 0; i < mas[i].length; i++) {
			int countNumbOne = 0;
			for (int j = 0; j < mas.length; j++) {
				if (mas[j][i] == 1) {
					countNumbOne++;
				}
			}
			if (countNumbOne == (i + 1)) {
				if (i == 5) {
					return true;
				}

			} else {
				return false;
			}

		}
		return true;

	}
}
