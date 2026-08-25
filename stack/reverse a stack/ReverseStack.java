import java.util.*;

public class ReverseStack {

    public static void printStack (Stack<Integer> stack) {

        while (!stack.isEmpty()) {
            System.out.println("elem: " + stack.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> stack, int item) {

        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        int top = stack.pop();

        pushAtBottom(stack, item);

        stack.push(top);
    }

    public static void reverseStack (Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int elem = stack.pop();
        
        reverseStack(stack);

        pushAtBottom(stack, elem);

    }
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);

        System.out.println("reverse stack: -> \n");

        printStack(stack);

    }

}