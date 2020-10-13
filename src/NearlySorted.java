/**
 * Sort a nearly sorted array in which each element is misplaced by utmost
 * k-positions
 * 
 * @author reshma
 *
 */
public class NearlySorted {
	/*
	 * Time complexity: O(kn)
	 */
	public static void insertionSort(int[] arr, int size) {
		int current, i, j;
		for (i = 1; i < size; i++) {
			current = arr[i];
			for (j = i; j > 0 && arr[j - 1] > current; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = current;
		}
	}
}
