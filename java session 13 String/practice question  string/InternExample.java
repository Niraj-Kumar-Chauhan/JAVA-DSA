public class InternExample {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";

        // Interning the string
        String str3 = str1.intern();

        // Checking reference equality
        System.out.println(str1 == str2); // false, because str1 is a new object
        System.out.println(str2 == str3); // true, both point to the same interned string
    }
}
