package merge;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class merge_sort {
	public static void main (String[] arg) {
		int[] arr = {5, 1, 6, 2, 3, 4};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}
	
	private static void printArray(int[] arr) {
		for (int i: arr) 
			System.out.print(i + " ");
		
		System.out.print("\n");
	}
	
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		//Base condition
		if (n < 2)
			return;
		
		//Find a midpoint
		int mid = n / 2;
		
		//Create two temporary arrays;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		
		for (int i = 0; i < mid; i++) 
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		
		// Called this function recursively
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int a = 0, l = 0, r = 0;
		
		while (l < left.length && r < right.length) {
			if (left[l] < right[r]) 
				arr[a++] = left[l++];
			else
				arr[a++] = right[r++];
		}
		
		while (l < left.length)
			arr[a++] = left[l++];
		
		while (r < right.length) 
			arr[a++] = right[r++];	
	}
	
}
