import java.util.Arrays;

/**
 * Given an array A, construct product array such that prod[i] is equal to the
 * product of all the elements except A[i] without using division operator
 * 
 * @author reshma
 *
 */
public class ProductArray {
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(n)
	 * */
	public static int[] productArrayWithoutDivision(int[] arr, int size) {
		int[] product = new int[size];
		int temp = 1, index;
		for (index = 0; index < size; index++) {
			product[index] = temp;
			temp *= arr[index];
		}
		temp = 1;
		for (index = size - 1; index >= 0; index--) {
			product[index] *= temp;
			temp *= arr[index];
		}
		return product;
	}
	
	public static void display(int[] arr) {
		for(int a: arr)
			System.out.println(a);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int[] prod = productArrayWithoutDivision(arr,4);
		System.out.println(Arrays.asList(prod));
		display(prod);
	}
}
