public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World

        // Insert a string at a specific position
        sb.insert(6, "Java ");
        System.out.println(sb);  // Output: Hello Java World

        // Delete a part of the string
        sb.delete(6, 11);
        System.out.println(sb);  // Output: Hello World

        // Reverse the string
        sb.reverse();
        System.out.println(sb);  // Output: dlroW olleH
    }
}

