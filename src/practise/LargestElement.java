package practise;

import java.util.Arrays;

public class LargestElement {


	    public static void main(String[] args) {
	        int[] arr = {5, 7, 1, 4, 8, 6, 9, 2};
	        int k = 3;
	        int[] kLargest = findKLargestElements(arr, k);
	        System.out.println("The " + k + " largest elements in the array are: " + Arrays.toString(kLargest));
	    }

	    public static int[] findKLargestElements(int[] arr, int k) {
	        Arrays.sort(arr);
	        int[] kLargest = new int[k];
	        int j = 0;
	        for (int i = arr.length - 1; i >= arr.length - k; i--) {
	            kLargest[j++] = arr[i];
	        }
	        return kLargest;
	    }}
