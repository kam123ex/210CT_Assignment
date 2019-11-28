package Week7_Advanced;

public class BubbleSortTest {

	public static void main(String[] args) {

		BubbleSort bs = new BubbleSort();
		int[] ar = {98, 38, 93, 33, 21, 6, 63, 81, 32};


		System.out.println("Bubble Sort Array: ");
		
		bs.Bsed(ar);
		
			for(int i=0; i < ar.length; i++){  
				System.out.print(ar[i] + " ");  
			}
		System.out.println();  
		System.out.println("times: " + bs.times);
	}
}