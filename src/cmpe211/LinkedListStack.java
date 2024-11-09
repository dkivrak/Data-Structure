package week4;

public class LinkedListStack<T> {
    private Node<T> top;
    private int size;

    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }
    
    public T peek() {
    	if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
    	T peekedData = top.data;
    	return peekedData;
    }
    

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
    
    public LinkedListStack(LinkedListStack<T> otherStack) {
        LinkedListStack<T> tempStack = new LinkedListStack<>();
        
        Node<T> current = otherStack.top;
        while (current != null) {
            tempStack.push(current.data);
            current = current.next;
        }
        
        current = tempStack.top;
        while (current != null) {
            this.push(current.data);
            current = current.next;
        }
    }
   
   
}