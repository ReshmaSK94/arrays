/**
 * Separate 0's and 1's in a given array. 
 * this same algorithm can be used to separate odds and evens in an array
 * @author reshma
 *
 */
public class Separate0and1 {
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */
	
	public static void separate(int[] arr, int size) {
		int leftIndex = 0, rightIndex = size - 1;
		while (leftIndex < rightIndex) {
			while (arr[leftIndex] == 0 && leftIndex < rightIndex)
				leftIndex++;
			while (arr[rightIndex] == 1 && leftIndex < rightIndex)
				rightIndex--;
			if (leftIndex < rightIndex) {
				arr[leftIndex++] = 0;
				arr[rightIndex--] = 1;
			}
		}
	}
	
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */
	
	public static void separateOddAndEven(int[] arr, int size) {
		int leftIndex = 0, rightIndex = size - 1;
		int temp=0;
		while (leftIndex < rightIndex) {
			while (arr[leftIndex] % 2 == 0 && leftIndex < rightIndex)
				leftIndex++;
			while (arr[rightIndex] % 2 == 1 && leftIndex < rightIndex)
				rightIndex--;
			if (leftIndex < rightIndex) {
				temp = arr[leftIndex];
				arr[leftIndex++] = arr[rightIndex];
				arr[rightIndex--] = temp;
				//leftIndex++;
				//rightIndex--;
			}
		}
	}

	
	
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 0, 1, 1, 0, 0, 0 };
		separate(arr1, 7);
		System.out.println("arr1 after separation is: ");
		for (int i : arr1) {
			System.out.println(i);
		}
		
		int[] arr2 = new int[] { 1, 2, 6, 9, 4, 3, 0 };
		separateOddAndEven(arr2, 7);
		
		System.out.println("arr2 after even-odd separation is: ");
		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
