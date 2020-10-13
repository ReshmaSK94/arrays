/**
 * Given an unsorted array, sort the array in wave form like: a[0] >= a[1]
 * <=a[2] >=a[3] <=a[4] .....
 * 
 * i.e; elements at even index are greater than its both adjacent elements and
 * elements at odd index are less than its both adjacent elements
 * 
 * @author reshma
 *
 */
public class SortInWaveForm {
	public static void main(String[] args) {
		int[] arr = { 20, 10, 8, 6, 4, 2 };
		sortInWaveForm(arr, arr.length);
		for (int i : arr)
			System.out.println(i);
	}

	/*
	 * This approach is by considering even indexes 
	 * Time complexity: O(n)
	 * */
	private static void sortInWaveForm(int[] arr, int size) {
		int i, temp;
		for (i = 0; i < size; i = i + 2) {
			if (i > 0 && arr[i - 1] > arr[i]) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			}
			if (i < size - 1 && arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

	}
}
