package by.htp.multidimensional.array.main;

public class Task7 {

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		for (int i = mas.length - 1; i >= 0; i--) {
			for (int j = 0; j < mas[i].length - i; j++) {
				mas[i][j] = i + 1;

			}

		}
		System.out.println("Наш массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");

			}
			System.out.println();

		}

	}

}
