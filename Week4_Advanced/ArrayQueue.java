package Week4_Advanced;

public class ArrayQueue {
	private int maxSize;
	private Object[] entry;
	private int front;
	private int rear;
	private int count;
	private String check = "";
	public ArrayQueue(int size) {
		maxSize = size;
		entry = new Object[maxSize];
		count = 0;
		front = 0;
		rear= -1;
	}
	
	public ArrayQueue() { 
		this(10);
	}
	
	public boolean full() {
		return count == maxSize;
	}
	public boolean empty() {
		return count <= 0;
	}
	public void setDequeueCheck(String check) {
		this.check = check;
	}
	
	public void enqueue(Object o) throws QueueFullException {
		if (count < maxSize) {
			count++;
			if (rear < maxSize - 1)
				rear++;
			else
				rear = 0;
			entry[rear] = o;
		} else
			throw new QueueFullException();
	}
	
	public Object dequeue() throws EmptyQueueException {
		if (count <= 0) {
			throw new EmptyQueueException();
		}
		
		count--;
		Object item = entry[front];
		if (front < maxSize - 1)
			front++;
		else
			front = 0;
		if(check == "bqt") {
			return "dequeue : " + item;
		}else {
		return item;
		}
	}
	
	public String toString() {

		String s = "front [ ";

		int index = front;
		for (int i = 0; i < count; i++) {
			s = s + entry[index] + " ";
			if (index < maxSize-1)
				index++;
			else
				index = 0;
		}
		s = s + "] rear";
		return s;

	}
	
}
// class EmptyQueueException
class EmptyQueueException extends RuntimeException {
	public EmptyQueueException () {
		super("Queue is empty");
	}
}
// class QueueFullException
class QueueFullException extends RuntimeException {
	public QueueFullException () {
		super("Queue is full");
	}
}
