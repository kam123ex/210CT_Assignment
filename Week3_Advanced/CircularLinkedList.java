package Week3_Advanced;
class ListNode {
    Object data;
    ListNode next;
    
    ListNode(Object o) {
        data = o;
        next = null;
    }
    
    ListNode(Object o, ListNode nextNode) {
        data = o;
        next = nextNode;
    }
    
    Object getData() {
        return data;
    }
    
    ListNode getNext() {
        return next;
    }
} // class ListNode

class EmptyListException extends RuntimeException {
    public EmptyListException() {
        super("List is empty");
    }
} // class EmptyListException

class CircularLinkedList {
    private ListNode head;
    private ListNode tail;
    private ListNode last;
    
    
    public CircularLinkedList() {
        head = null;
        tail = null;
    }
    
    // Check the Linked List is Circular
    public boolean isCircular(ListNode head) 
    { 
        if (head == null) 
        return true; 
      
        ListNode node = head.next; 
      
        while (node != null && node != head) 
        node = node.next; 
      
        return (node == head); 
    }
    
    public ListNode getHead() {
    	return head;
    }
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addToEmpty(Object item) {
    	
    	ListNode newNode = new ListNode(item);

    	head = newNode;
    	tail = newNode;
    	newNode.next = head;

    }
    
    public void addToHead(Object item) {
    	ListNode newNode = new ListNode(item);
    	
    	if(head == null) {
    		addToEmpty(item);
    	}else {
    		newNode.next = tail.next;
    		head = newNode;
    		tail.next = head;
    	}
        
    }
    public void addToTail(Object item) {
    	ListNode newNode = new ListNode(item);
    	
    	if(head == null) {
    		addToEmpty(item);
    
    	}else {
    		tail.next = newNode;
    		tail = newNode;
    		tail.next = head;
    	}
    }
    

    
    
    public Object removeFromHead() throws EmptyListException {
        Object item = head.data;
        if(isEmpty()){
            throw new EmptyListException();
        }else if(head == tail){
            head = tail = null;
        }else{
            item = head.data;
            head = head.next;
            tail.next = head;
        }
        return item;
    }
    
    public Object removeFromTail() throws EmptyListException {
        Object item = head.data;
        if(isEmpty()){
            throw new EmptyListException();
        }else if(head == tail){
            head = tail = null;
        }else{
            ListNode current = head;
            while(current.next != tail){
                current = current.next;
            }
            item = tail.data;
            tail = current;
            tail.next = head;
        }
        return item;
    }
    
    public String toString() {
        ListNode current = head;
        String s = "[ ";
    	if(head == null) {
    		s += "List is empty.";
    	}else {
    		s += "Nodes of the circular linked list: ";
    	
    	do {
    		s += current.data + " ";
    		current = current.next;
    	}while (current != head);
    	}
    	return s + "]";
    }
} // class LinkedList
