package week4;

public class LinkedList<T> {
	
	private Node<T> head;

	public void add(T data) {
	    if (head == null) {
	        head = new Node<>(data);
	    } else {
	        Node<T> current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = new Node<>(data);
	    }
	}



    public LinkedListIterator iterator() {
        return new LinkedListIterator();
    }


    public class LinkedListIterator {	
        private Node<T> current = head;


        public boolean hasNext() {
            return current != null;
        }


        public T next() {
            if (current == null) {
                throw new IllegalStateException("No more elements");
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
