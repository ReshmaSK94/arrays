/**
 * Given an array A of size n where each element ranges from 0 to n-1.
 * Rearrange the array such that A[i] = A[A[i]]
 * @author reshma
 *
 */
public class RearrangeArray {
	/*
	 * Time Complexity : O(n)
	 * Space Complexity: O(1)
	 * */
	public static void rearrange(int[] arr, int size) {
		int i;
		for(i=0;i<size;i++) {
			arr[i] = arr[i] + (arr[arr[i]] % size) * size;
		}
		
		for(i=0;i<size;i++) {
			arr[i] = arr[i] / size;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,0,2,4};
		rearrange(arr, arr.length);
		for(int a:arr)
			System.out.println(a);
	}
}
