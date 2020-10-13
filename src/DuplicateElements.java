/**
 * Find the duplicate elements in an array in O(n) time and O(1) extra space
 * Note: 1<= arr[i] <=n
 * @author reshma
 *
 */
public class DuplicateElements {
	public static void findDuplicates(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			if(arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			else
				System.out.println(Math.abs(arr[i]));
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,2,4,5,6,6};
		findDuplicates(arr, arr.length);
	}
}
