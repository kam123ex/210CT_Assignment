package Week6_Advanced;

public class TestRecusiveSearch {

	public static void main(String[] args) {

		RecursiveSearch rs = new RecursiveSearch();
		
		int[] arr1 = { 2, 45, 234, 567, 876, 900, 976, 999 };
		int index = rs.recursiveBinarySearch(arr1, 0, arr1.length, 45);
		System.out.println("Found 45 at " + index + " index");
		index = rs.recursiveBinarySearch(arr1, 0, arr1.length, 999);
		System.out.println("Found 999 at " + index + " index");
		index = rs.recursiveBinarySearch(arr1, 0, arr1.length, 876);
		System.out.println("Found 876 at " + index + " index");
	}
}
