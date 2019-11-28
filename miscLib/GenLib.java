package miscLib;


public abstract class GenLib {

	/**
	 *	randomly generate an integer between start and end inclusively.
	 */
	public static int genInt(int start, int end) {
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		return ( (int)(Math.random() * (end - start + 1)) + start );
	}


} // class GenLib