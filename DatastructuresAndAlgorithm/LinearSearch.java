package DatastructuresAndAlgorithm;

public class LinearSearch {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		int search=10;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==search) {
				System.out.println("Found");
				return;

			}
			
		}
	
			System.out.println("Not Found");
		
	
	}
}
