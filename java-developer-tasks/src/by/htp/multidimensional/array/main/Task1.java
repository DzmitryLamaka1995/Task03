package by.htp.multidimensional.array.main;

import java.util.Random;

public class Task1 {
	// 1. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		createMas(mas);
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Элементы массива стоящие на диагонали: ");

		for (int i = 0,j=0; i < mas.length; i++,j++) {  //i -это позиция строки, j - это позиция столбика
			System.out.print(mas[i][j] + " ");

		}
		System.out.println();

		for (int i = mas.length - 1, j = 0; i >= 0; i--, j++) {  //i -это позиция строки, j - это позиция столбика
			System.out.print(mas[i][j] + " ");

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