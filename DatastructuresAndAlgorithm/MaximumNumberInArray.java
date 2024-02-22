package DatastructuresAndAlgorithm;

public class MaximumNumberInArray {
	
	    public static int findingMax(int[] nums) {
	        if (nums == null || nums.length == 0) {
	        	 System.out.println("Invalid Array");
	        }

	        int max = nums[0]; 

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > max) {
	                max = nums[i]; 
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 5, 2, 9, 7, 1};
	        int maxNumber = findingMax(array);
	        System.out.println(maxNumber);
	    }

}
