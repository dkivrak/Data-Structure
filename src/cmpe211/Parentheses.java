package week4;

import java.util.Scanner;

public class Parentheses {

    public static boolean isBalanced(String input) {
        LinkedListStack<Character> stack = new LinkedListStack<>();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the parentheses:");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        LinkedListStack<Character> stack = new LinkedListStack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("The newest node of the given stack: " + stack.peek());
        }

        scanner.close();
    }
}
