package Week6_Advanced;

public class TestRecusiveSearch {

	public static void main(String[] args) {

		RecursiveSearch rs = new RecursiveSearch();
		
		int[] arr1 = { 2, 45, 54, 57, 76, 90, 96, 99 };
		int index = rs.recursiveBinarySearch(arr1, 0, arr1.length, 45);
		System.out.println("Found 45 at " + index + " index");
		index = rs.recursiveBinarySearch(arr1, 0, arr1.length, 99);
		System.out.println("Found 99 at " + index + " index");
		index = rs.recursiveBinarySearch(arr1, 0, arr1.length, 96);
		System.out.println("Found 96 at " + index + " index");
	}
}
