package DatastructuresAndAlgorithm;

public class PeakElement {

	private static int findPeak(int[] arr, int low, int high, int n) {

		int mid = low + (high - low) / 2;

		if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
			return mid;
		}

		else if (mid > 0 && arr[mid - 1] > arr[mid]) {
			return findPeak(arr, low, (mid - 1), n);
		} else {
			return findPeak(arr, (mid + 1), high, n);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 3, 4 };
		int n = arr.length;
		System.out.println(arr[findPeak(arr, 0, n - 1, n)]);
	}
}
