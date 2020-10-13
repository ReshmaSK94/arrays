/**
 * Given an array, find the two elements whose sum is closest to zero on a number line
 * @author reshma
 *
 */
public class SumClosestToZeroPair {
	
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */
	/**
	 * arr is sorted array. 
	 * if we have to sort it in this method, then the time complexity will be O(nlogn)
	 * @param arr
	 * @param size
	 */
	public static void sumClosestToZeroPair(int[] arr, int size) {
		int curr_sum = 0;
		int closest_sum = Integer.MAX_VALUE;
		int lIndex = 0, rIndex = size - 1;
		int min_lIndex = 0, min_rIndex = size - 1;

		while (lIndex < rIndex) {
			curr_sum = arr[lIndex] + arr[rIndex];
			if (Math.abs(curr_sum) < Math.abs(closest_sum)) {
				closest_sum = curr_sum;
				min_lIndex = lIndex;
				min_rIndex = rIndex;
			}
			if (curr_sum < 0)
				lIndex++;
			else
				rIndex--;
		}
		System.out.println("the pair whose sum closest to zero is: (" + arr[min_lIndex] + "," + arr[min_rIndex] + ")");
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {-17,-1,1,4, 10, 19, 20};
		sumClosestToZeroPair(arr1, 7);
		
	}
}
