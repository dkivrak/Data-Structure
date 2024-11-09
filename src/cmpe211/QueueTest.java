package week4;

public class QueueTest {
    public static void main(String[] args) {
       
    	LinkedListQueue<Integer> originalQueue = new  LinkedListQueue<>();
    	originalQueue.enqueue(1);
    	originalQueue.enqueue(2);
    	originalQueue.enqueue(3);
    	
    	LinkedListQueue<Integer> copiedQueue = new  LinkedListQueue<>(originalQueue);


    	System.out.println("Original queue:");
    	while(!originalQueue.isEmpty()) {
    		System.out.println(originalQueue.dequeue() + " ");
    	}

    	System.out.println("\nCopied  queue:");
    	copiedQueue.enqueue(4);

    	while(!copiedQueue.isEmpty()) {
    		System.out.println(copiedQueue.dequeue() + " ");
    	}
    }
}
