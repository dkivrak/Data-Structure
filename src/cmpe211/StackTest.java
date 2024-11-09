package week4;

public class StackTest {

	public static void main(String[] args) {
		
		LinkedListStack<Integer> originalStack  = new LinkedListStack<>();
		originalStack.push(1);
		originalStack.push(2);
		originalStack.push(3);

		LinkedListStack<Integer> copiedStack  = new LinkedListStack<>(originalStack);

		

		System.out.println("Original stack:");
		while(!originalStack.isEmpty()) {
			System.out.println(originalStack.pop() + " ");
		}
		
		copiedStack.push(4);

		System.out.println("\nCopied stack:");
        while (!copiedStack.isEmpty()) {
            System.out.print(copiedStack.pop() + " ");
        }
		
        originalStack.push(5); 
        copiedStack.push(5);
        
        System.out.println("\n\nAfter modifying both stacks independently:");
        System.out.println("Original stack (pop işlemleri): " + originalStack.pop()); 
        System.out.println("Copied stack (pop işlemleri): " + copiedStack.pop()); 
		
		
		
		
		
		
	}

	

	

}
