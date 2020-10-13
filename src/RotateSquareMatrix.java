/**
 * Rotate a square matrix by 90 degrees in anti clockwise direction.
 * first reverse and then transpose or vice-versa
 * @author reshma
 *
 */
public class RotateSquareMatrix {
	
	// Time Complexity: O(n2)	
	public static void reverseMatrix(int[][] arr, int rows, int columns) {
		int temp;
		for(int i=0;i<rows;i++) {
			for(int j=0,k=columns-1;j<k;j++,k--) {
				temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
			}
		}
	}
	
	// Time Complexity: O(n2)	
	public static void transposeMatrix(int[][] arr, int rows, int columns) {
		int temp;
		for(int i=0;i<rows;i++) {
			for(int j=i;j<columns;j++) {
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
}
