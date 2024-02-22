package DatastructuresAndAlgorithm;

public class QuickSort {
	
	 public static int partition(int[] num, int i, int j) {
	        // i -> is leftmost element
	        // j -> is rightmost element

	        // taking pivot at the middle 
	        int pivot = num[(i + j) / 2];

	        while (i < j) {
	            // stops at when num[i] >= pivot
	            while (num[i] < pivot) {
	                i++;
	            }

	            while (pivot < num[j]) {
	                j--;
	            }

	            if (i <= j) {
	                int temp = num[i];
	                num[i] = num[j];
	                num[j] = temp;
	                i++;
	                j--;
	            }
	        }
	        
	        return i;
	    }

	    public static void quicksort(int[] num, int i, int j) {
	    	
	        int pivot_index = partition(num, i, j);

	        if (i < pivot_index - 1) {
	            quicksort(num, i, pivot_index - 1);
	        }

	        if (pivot_index < j) {
	            quicksort(num, pivot_index, j);
	        }
	    }

	    // Main method
	    public static void main(String[] args){
	        int[] num = { 27, 23, 11, 7, 9, 17, 6 };
	        quicksort(num, 0, num.length - 1);

	        for (int i : num) {
	            System.out.print(i + " ");
	        }
	    }     
}
