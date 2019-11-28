package Week7_Advanced;

public class HeapSortTest {

    public static void main(String args[]) {

	HeapSort hs = new HeapSort();
	int[] ar = {98, 38, 93, 33, 21, 6, 63, 81, 32};


	System.out.println("Heap Sort Array: ");
	
	hs.hsed(ar);
	
		for(int i=0; i < ar.length; i++){  
			System.out.print(ar[i] + " ");  
		}
	System.out.println();  
	System.out.println("times: " + hs.times);
    }
}