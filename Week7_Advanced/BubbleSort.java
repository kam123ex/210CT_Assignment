package Week7_Advanced;

public class BubbleSort {

	int n = 0;
	int temp = 0;
	int times = 0;
	public BubbleSort() {}
	
	public int[] Bsed(int[] arrBs) {
		n = arrBs.length;
		for(int i=0; i<n; i++) {
		
			for(int j=1; j<(n-i); j++) {
				times++;
				if(arrBs[j-1]>arrBs[j]) {
					temp = arrBs[j-1];
					arrBs[j-1] = arrBs[j];
					arrBs[j] = temp;
				}
			}
		}
		return arrBs;
	}
}
