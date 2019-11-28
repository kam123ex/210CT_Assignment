package Week3_Advanced;

public class TestLinkedList {
	public static void main (String args[]) {
		CircularLinkedList s = new CircularLinkedList();
		System.out.println(s);
		System.out.println();

		s.addToTail (42);
		System.out.println();
		System.out.println(s);
		System.out.println();
		s.addToTail (new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToTail (new String("hello"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}

		s.addToHead (new Integer(42));
		System.out.println(s);
		System.out.println();
		s.addToHead (new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToHead (new String("hello"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
			System.out.println();
		}
		System.out.println("List is circular?");
	    System.out.print(s.isCircular(s.getHead())? "Yes\n" : 
                "No\n" ); 
	}
	
} // class TestLinkedList