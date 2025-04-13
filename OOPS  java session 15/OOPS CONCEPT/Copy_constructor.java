public class Copy_constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "NIRAJ CHAUHAN";
        s1.rollNo = 77;
        s1.password = "qrgtjy";
        s1.marks[0] = 78;
        s1.marks[1] = 90;
        s1.marks[2] = 98;
        Student s2 = new Student(s1);
        s2.password = "dgfhgj";
        s1.marks[2] = 99;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollNo;
    String password;
    int marks[];

    class Address{
        String Village;
    }
    // Student(Student s1){       // Shallow copy constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo =s1.rollNo;
    //     this.marks = s1.marks;
    // }

    Student(Student s1){           // Deep copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.rollNo =s1.rollNo;
        for(int i = 0; i<3; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
        System.out.println("contructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollNo){
        marks = new int[3];
        this.rollNo = rollNo;
    }
}
