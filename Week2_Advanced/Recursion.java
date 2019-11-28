package Week2_Advanced;

public class Recursion {

	public float recursionSum(float n) {
		
		if(n<2) {
			return 1;
		}else {
			return 1/n+(recursionSum(n-1));
		}
	}
		// Pseudocode
//	Function recursionSum( n )
//		
//		if(n small than 1) 
//			then return 1;
//		else
//			return 1/n+(recursionSum(n-1));
//		end
//	end
		
	public static void main(String args[])  
	{  
		Recursion re = new Recursion();  
		System.out.println(re.recursionSum(5));  
		System.out.print(re.recursionSum(10));  
	}  
	

}
