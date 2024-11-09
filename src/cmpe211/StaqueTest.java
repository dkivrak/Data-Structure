package week4;

public class StaqueTest {

	public static void main(String[] args) {

		 Staque<Integer> OriginalStaque = new Staque<>();
	        OriginalStaque.push(1);
	        OriginalStaque.push(2);
	        OriginalStaque.push(3);

	        // OriginalStaque'i kopyalayan yeni bir steque oluşturuyoruz
	        Staque<Integer> CopiedStaque = new Staque<>(OriginalStaque);

	        System.out.println("Original staque:");
	        while (!OriginalStaque.isEmpty()) {
	            System.out.println(OriginalStaque.pop() + " ");
	        }
	        
	        CopiedStaque.enqueue(0);
	        CopiedStaque.pop();
	        

	        System.out.println("Copied staque:");
	        while (!CopiedStaque.isEmpty()) {
	            System.out.println(CopiedStaque.pop() + " ");
		}
	
	}
	
}
