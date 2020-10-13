/**
 * Given an unsorted array of positive integers. 
 * Find the no. of triangles that can be formed with 3 different elements as 3 sides of triangle
 * @author reshma
 *
 */
public class TrianglesPossible {
	public static int findTriangles(int[] arr, int size) {
		int sum=0,i,j,k;
		// sort the array which may take O(nlogn) time
		for(i=0;i<size-2;i++) {
			k=i+2;
			for(j=i+1;j<size-1;j++) {
				while(k<size && arr[i] + arr[j] > arr[k])
					k=k+1;
				sum = sum + k-j-1;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,7,8,10,12,14,50};
		System.out.println("No. of triangles possible: " + findTriangles(arr, arr.length));
	}
}
