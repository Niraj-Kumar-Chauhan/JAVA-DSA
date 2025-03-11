public class count_lowerCase_in_string {
    public static int countLowerCasech(String  str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String name = "Niraj Kumar Chauhan";
        System.out.println("Number of LowerCase Vowel In String = " + countLowerCasech(name));
    }
}