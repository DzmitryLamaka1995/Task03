package by.htp.multidimensional.array.main;

public class Task6 {

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		for (int i = 0; i < mas.length; i++) {
			if (i == 0 || i == mas.length - 1) {
				for (int j = 0; j < mas.length; j++) {
					mas[i][j] = 1;
				}
			} else {
				mas[i][0] = 1;
				mas[i][mas[i].length - 1] = 1;
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
