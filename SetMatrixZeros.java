import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {

	public static void main(String[] args) throws IOException {
		List<Integer> Value = new ArrayList<Integer>();
		Value.add(0);
		Value.add(1);
		Value.add(2);
		Value.add(1);
		Value.add(2);
		Value.add(3);
		Value.add(1);
		Value.add(0);
		Value.add(3);

		int rownum = 3, colnum = 3;

		MatrixCreate((ArrayList<Integer>) Value, rownum, colnum);
	}

	public static void MatrixCreate(ArrayList<Integer> value, int rownum, int colnum) {
		int k = 0;
		List<Integer> col = new ArrayList<Integer>();
		List<Integer> row = new ArrayList<Integer>();
		int matrix[][] = new int[rownum][colnum];
		for (int i = 0; i < rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				matrix[i][j] = value.get(k);
				k++;

			}

		}

		System.out.println("before change: " + Arrays.deepToString(matrix));

		for (int i = 0; i < rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				if (matrix[i][j] == 0) {

					row.add(i);
					col.add(j);
				}

			}

		}
		fillRow(matrix, row, colnum);
		fillCol(matrix, col, rownum);

		System.out.println("after change: " + Arrays.deepToString(matrix));
	}

	private static void fillCol(int[][] matrix, List<Integer> col, int rownum) {
		int length = col.size();

		for (int l = length - 1; l >= 0; l--) {
			int cl = col.get(l);

			for (int i = 0; i < rownum; i++) {
				matrix[i][cl] = 0;
			}
		}

	}

	private static void fillRow(int[][] matrix, List<Integer> row, int colnum) {
		int length = row.size();

		for (int l = length - 1; l >= 0; l--) {
			int rw = row.get(l);

			for (int i = 0; i < colnum; i++) {
				matrix[rw][i] = 0;
			}

		}

	}
}
