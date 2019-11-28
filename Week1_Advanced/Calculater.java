package Week1_Advanced;


public class Calculater {
	int[] arrayN;
	
	public Calculater(int[] arrayN) {
		this.arrayN = arrayN;
	}

	public String Q1() {
		String s = "";
		int n1 = 0;
		int n2 = 0;
		
		for(int i = 0; i<arrayN.length; i++) {
			n1 = arrayN[i]*(arrayN[i]-1)/2;
			n2 = 2*arrayN[i]+26;
			
			System.out.println(n1 + "\t\t" + n2);
			
		}
		return s;
	}

}
