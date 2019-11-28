package Week4_Advanced;

public class TestQueue2 {

    public static void main(String[] args) {
		//ListQueue q = new ListQueue();
		ArrayQueue q = new ArrayQueue(20);
		q.setDequeueCheck("bqt");
	
				q.enqueue(new Integer(1));
				System.out.println(q);
				q.enqueue(new Integer(2));
				System.out.println(q);
				q.enqueue(new Integer(3));
				System.out.println(q);
			
				System.out.println(q.dequeue());
				System.out.println(q);
				System.out.println(q.dequeue());
				System.out.println(q);
				
    }

} // clas TestQueue