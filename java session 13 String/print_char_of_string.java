public class print_char_of_string {
    public static void printCharFromString(String fullName){
        for(int i = 0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
    }
    public static void main(String args[]){
        String FullName = "Niraj Chauhan";
        printCharFromString(FullName);
    }
}
