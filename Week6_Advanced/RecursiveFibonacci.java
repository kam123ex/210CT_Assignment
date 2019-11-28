package Week6_Advanced;

public class RecursiveFibonacci {
	
	int num;
	
	public static int fibonacciRec(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return fibonacciRec(n-2) + fibonacciRec(n-1);
		}
	
	    public static void main(String args[]) {
		int maxNumber = 10;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(fibonacciRec(i) +" ");
			}
		}
}
