/**
 * Binary search or half-interval search or logarithmic search
 * this is applicable only on sorted arrays. not for unsorted array or linked list
 * @author reshma
 *
 */
public class BinarySearch {
	
	/*
	 * Time complexity:
	 * Recurrence relation
	 * T(n) = T(n/2) + 1; if n > 1  
	 *  --> it means after 1 comparison, size of elements to be compared will be reduced by half i.e; n = n/2
	 * T(n) = 1; if n = 1
	 *  So, T(n) = O(log n)
	 * 
	 */
	public static int binarySearch(int[] arr, int target) {
		int l=0, r=arr.length;
		int m = (l+ r)/2;
		while(l<=r) {
			if(arr[m] == target)
				return m;
			if(arr[m] < target)
				l = m +1;
			if(arr[m] > target)
				r = m -1;
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,4,5,6,8,9};
		System.out.println( "Found target 5 at:" + binarySearch(arr, 5));
	}
}
