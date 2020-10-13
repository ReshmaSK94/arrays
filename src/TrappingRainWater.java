/**
 * Given n non-negative integers representing an elevation map, where the width of each bar is 1.
 * Find the amount of water that is trapped between these bars after raining
 * @author reshma
 *
 */
public class TrappingRainWater {
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(n), as left and right arrays each of size n
	 * */
	public static int findWater(int[] arr, int size) {
		int sum=0,index;
		int[] left = new int[size];
		int[] right = new int[size];
		
		//construct the left array which contains maximum bar on its left including the bar itself
		// this will take O(n) time
		left[0]=arr[0];
		for(index=1;index<size;index++) {
			left[index] = Math.max(left[index-1], arr[index]);
		}
		
		//construct the right array which contains maximum bar on its right including the bar itself
		// this will take O(n) time
		right[size-1]=arr[size-1];
		for(index=size-2;index>=0;index--) {
			right[index] = Math.max(right[index+1], arr[index]);
		}
		
		// find the minimum of left and right bars and subtract the current bar from it.
		// this will take O(n) time
		for(index=0;index<size;index++) {
			sum += Math.min(left[index],right[index]) - arr[index];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,1,0,3,0,2};
		System.out.println(findWater(arr, arr.length));
	}
}
