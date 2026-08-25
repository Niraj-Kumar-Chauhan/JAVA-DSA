import java.util.*;

public class ReverseStr {

    public static String reverse (String str) {

        Stack<Character> charStack = new Stack<>();
        
        int idx = 0;

        while (idx < str.length()) {

            charStack.push(str.charAt(idx));

            idx++;

        }

        StringBuilder result = new StringBuilder("");

        while (!charStack.isEmpty()) {

            char top  = charStack.pop();

            result.append(top);
        }   

        return result.toString();
        
    }
    public static void main(String[] args) {
        
        String str = "abc";

        String reverseStr = reverse(str);

        System.out.println(reverseStr);

    }
}