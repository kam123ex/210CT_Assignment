package Week1_Advanced;


public class TestCalculater {
	public static void main(String [] args) {
		
		int[] array1 = {5, 10, 20, 50, 100, 500, 1000, 5000};	
		Calculater c1 = new Calculater(array1);
		
		System.out.println(c1.Q1());
	}
}
