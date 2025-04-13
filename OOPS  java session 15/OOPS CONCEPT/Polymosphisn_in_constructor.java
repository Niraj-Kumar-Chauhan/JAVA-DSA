public class Polymosphisn_in_constructor {
    public static void main(String args[]){
        //Student s1 = new Student();
        Student s2 = new Student("Niraj Chauhan");
        Student s3 = new Student(125);
    }
}
class Student{
    String name;
    int rollNo;
    Student(){                                 // none parameterized constructor
        System.out.println("Constructor is called...");
    }
    Student(String name){     // parameterized constructor
        this.name = name;
    }
    Student(int rollNo){     // parameterized constructor
        this.rollNo = rollNo;
    }
}
