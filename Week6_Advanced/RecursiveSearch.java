package Week6_Advanced;

public class RecursiveSearch {

	public static int recursiveBinarySearch(int[] array, int head, int tail, int item) {

		if (head < tail) {
			int mid = head + (tail - head) / 2;
			if (item < array[mid]) {
				return recursiveBinarySearch(array, head, mid, item);

			} else if (item > array[mid]) {
				return recursiveBinarySearch(array, mid + 1, tail, item);

			} else {
				return mid;
			}
		}
		return -(head + 1);
	}

}
