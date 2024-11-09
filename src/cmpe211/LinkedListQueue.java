package week4;


public class LinkedListQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    public T dequeue() {
    	if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
    	T dequeuedData = front.data;
    	front  = front.next;
    	if (front == null) {
            rear = null;
        }
    	size--;
    	return dequeuedData;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public int size() {
        return size;
    }
    
    public LinkedListQueue(LinkedListQueue<T> original) {
        this.front = null;
        this.rear = null;
        this.size = 0;

        Node<T> current = original.front;
        while (current != null) {
            this.enqueue(current.data); 
            current = current.next; 
        }
    }
}
