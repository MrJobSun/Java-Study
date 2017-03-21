package ARRAY;

public class ChessTable {
	public static int[][] a = new int[8][8];

	public static void main(String[] args) {
		int b = 0;
		// Инициализация массива!!!
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				a[i][j] = b++;
				// System.out.print(a[i][j]);
			}
			// System.out.println();
		}
		// Вывод на консоль!!!

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				// a[i][j] = i*j;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}