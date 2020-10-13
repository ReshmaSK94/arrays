/**
 * Given an array A of size n, rotate it by d positions. left rotation
 * 
 * @author reshma
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		rotateLeft(arr, arr.length, 2);
		rotateLeft(arr, arr.length, 2);
		for (int i : arr)
			System.out.println(i);
	}

	/*
	 * Reversal algorithm for left rotation of an array
	 * 
	 * Time Complexity: O(n) Space Complexity: O(1)
	 */
	private static void rotateLeft(int[] arr, int size, int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, size - 1);
		reverse(arr, 0, size - 1);

	}

	private static void reverse(int[] arr, int leftIndex, int rightIndex) {
		int temp;
		for (; leftIndex < rightIndex; leftIndex++, rightIndex--) {
			temp = arr[leftIndex];
			arr[leftIndex] = arr[rightIndex];
			arr[rightIndex] = temp;
		}
	}
}
