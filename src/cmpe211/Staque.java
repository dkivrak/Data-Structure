package week4;

public class Staque<T> {

	private Node<T> head;
	private Node<T> tail;
    private int size;

    public Staque() {
    	this.head = null;
    	this.tail = null;
    	this.size = 0;
    }
    
    public void push(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = head;
		head = newNode;
		if (tail == null) { // Eğer liste boşsa, tail de aynı düğümü gösterir.
			tail = newNode;
		}
		size++;	
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Steque is empty");
		}
		T poppedData = head.data; // Kaldırılacak veriyi kaydediyoruz.
		head = head.next;
		if (head == null) { // Eğer baş boş ise, kuyruk da boş olmalı.
			tail = null;
		}
		size--;
		return poppedData; // Kaldırılan veriyi döndürüyoruz.
	}
	
	public void enqueue(T data){
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) { 
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public boolean isEmpty() {
        return head == null;
    }
    
    public int size() {
        return size;
    }

    public Staque(Staque<T> other) {
        if (other.isEmpty()) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node<T> current = other.head;
            while (current != null) {
                this.enqueue(current.data);  // Her bir elemanı kuyruğa ekleyerek yeni steque'i oluştur
                current = current.next;
            }
}
        
    }
}
