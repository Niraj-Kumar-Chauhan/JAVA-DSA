import java.util.ArrayList;

public class StackB {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty () {

            if (list.size() == 0) return true;

            return false;
        }

        public static void push (int num) {
            list.add(num);
        }

        public static int pop () {
            
            if (isEmpty()) {
                return -1;
            }

            int num = list.get(list.size() - 1);

            list.remove(list.size() - 1);

            return num;
        }

        public static int peek () {

            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        
        Stack stack  = new Stack();

        System.out.println(stack.isEmpty());

        stack.push(3);
        stack.push(2);
        stack.push(1);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();

            if (stack.isEmpty()) {
                System.out.println(stack.peek());
            }

        }

    }
}