/**
 * Find the two repeating elements in an array, 
 * given n+2 elements
 * 1<=a[i]<=n
 * all elements from 1 to n occur atleast once except two numbers which occur twice
 * @author reshma
 *
 */
public class RepeatingElements {
	
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * 
	 * alternative approach is same as finding duplicate elements by using absolute method
	 * */
	public static void printRepeating(int[] arr, int size) {
		int set_bit,x=0,y=0,xor_result=arr[0],n=size-2,index;
		
		//find the XOR of all the elements
		for(index=1;index<size;index++) {
			xor_result^=arr[index];
		}
		
		//do XOR for xor_result with all the numbers from 1 to n
		for(index=1;index<=n;index++) {
			xor_result^=index;
		}
		
		//find the rightmost significant bit
		set_bit = xor_result & ~(xor_result-1);
		
		//partition the elements of an array based on setbit
		for(index=0;index<size;index++) {
			if((arr[index] & set_bit) == 0)
				x=x^arr[index];
			else
				y=y^arr[index];
		}
		
		//partition the elements [i.e; 1 to n] based on setbit
		for(index=1;index<=n;index++) {
			if((index & set_bit) == 0)
				x=x^index;
			else
				y=y^index;
		}
		System.out.println("The two repeating elements are: " + x +" and "+y);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,6,2};
		printRepeating(arr, arr.length);
		
		int arr1[] = {2,4,2,5,4,3,1};
		printRepeating(arr1, arr1.length);
	}
}
