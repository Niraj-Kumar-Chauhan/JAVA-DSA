public class Convert_num_in_string_english {
    public static void main(String args[]){
        String strNum[] = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        int num = 2019;
        converNumInStringEnglish(num, strNum);
    }
    public static void converNumInStringEnglish(int num , String strNum[]){
        if(num == 0){
            return;
        }
        int index = num%10;
        converNumInStringEnglish(num/10, strNum);
        System.out.print(strNum[index] + " ");
    }
}
