public class Remove_duplicate {
    public static void main(String args[]){
        String str = "apnnacollege";
        boolean map[] = new boolean[26];
        removDuplicate(str, 0, new StringBuilder(""), map);
    }
    public static void removDuplicate(String str, int idx , StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removDuplicate(str, idx+1, newstr, map);
        }else{
            map[currChar - 'a'] = true;
            removDuplicate(str, idx+1, newstr.append(currChar), map);
        }
    }
}
