// overloading : multiple function with the same name but diffrent parameter   ---> (compile time polymorphism)
// public class Polymorphism {
//     public static void main(String args[]){
//         overloading add = new overloading();
//         System.out.println(add.sum(3,6));
//         System.out.println(add.sum((float)3.6,(float)6.7));
//         System.out.println(add.sum(3,6,7));
//     }
// }
// class overloading{
//     int sum(int a , int b){
//         return a + b;
//     }
//     float sum(float a , float b){
//         return a + b;
//     }
//     int sum(int a , int b , int c){
//         return a + b + c;
//     }
// }



// overriding : parent and child classes both contains the same function with a diffrent defination


public class Polymorphism {
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eat anythig");
    }
}
class Deer{
    void eat(){
        System.out.println("eat grass");
    }
}