package Week7_Advanced;

public class HeapSort {

	int n = 0;
	int temp = 0;
	int times = 0;
	public HeapSort() {}
	
	public int[] hsed(int[] arrhs) {
		n = arrhs.length;
		
		for(int i=n/2-1; i>=n; i--) {
			heapF(arrhs, n, i);
		}
		for(int i=n-1; i>=0; i--) {
				temp = arrhs[0];
				arrhs[0] = arrhs[i];
				arrhs[i] = temp;
				heapF(arrhs, i, 0);
			}
		return arrhs;
		}
		
	public void heapF(int[] arrhs, int n, int i) {
		times++;
		int lag 	= i;
		int left 	= 2*i +1;
		int right 	= 2*i + 2;
		
		if (left < n && arrhs[left] > arrhs[lag]) 
            lag = left; 
  
        if (right < n && arrhs[right] > arrhs[lag]) 
            lag = right; 
  
        if (lag != i) 
        { 
            int swap = arrhs[i]; 
            arrhs[i] = arrhs[lag]; 
            arrhs[lag] = swap; 
  
            heapF(arrhs, n, lag); 
        }
	}
}
