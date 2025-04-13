public class StaticKeyW {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.school = "KSY";
        //System.out.println(s1.school);  // print KSY
        Student s2 = new Student();
        //System.out.println(s2.school); // print KSY
        Student s3 = new Student();
        s3.school = "NCIT";
        System.out.println(s1.school); // print NCIT
    }
}
class Student{
    String name;
    int roll;

    static String school;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}