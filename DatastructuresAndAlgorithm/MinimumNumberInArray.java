package DatastructuresAndAlgorithm;

public class MinimumNumberInArray {
	
	  public static int findingMin(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            System.out.println("Invalid Array");
	        }

	        int min = nums[0]; 

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] < min) {
	                min = nums[i]; 
	            }
	        }

	        return min;
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 5, 2, 9, 7,1};
	        int minNumber = findingMin(array);
	        System.out.println(minNumber);
	    }

}
