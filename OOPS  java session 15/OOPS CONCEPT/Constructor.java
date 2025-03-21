public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "NIRAJ KUMAR CHAUHAN";
        System.out.println(s1.name);
        s1.roll = 4;
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is Called...!");
    }
}


// public class Constructor {
//     public static void main(String args[]){
//         Student s1 = new Student("NIRAJ CHAUHAN");
//         System.out.println(s1.name);
//         s1.roll = 4;
//     }
// }
// class Student{
//     String name;
//     int roll;

//     Student(String name){
//         this.name = name;
//     }
// }
