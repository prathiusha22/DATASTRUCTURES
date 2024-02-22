package DatastructuresAndAlgorithm;

public class ArrayProduct {
	
	public static void main(String[] args) {
		int[] array = { 2, 2, 3, 4, 5 };
		int product =1;
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(product);
	}

}