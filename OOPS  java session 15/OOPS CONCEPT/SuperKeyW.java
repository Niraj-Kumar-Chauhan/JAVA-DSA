// public class SuperKeyW {
//     public static void main(String args[]){
//         Horse h1 = new Horse();

//     }
// }
// class Animal{
//     Animal(){
//         System.out.println("Animal constructor is called.");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         super();
//         System.out.println("Horse constructor is called.");
//     }
// }



// public class SuperKeyW {
//     public static void main(String args[]){
//         Horse h1 = new Horse();

//     }
// }
// class Animal{
//     Animal(){
//         System.out.println("Animal constructor is called.");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor is called.");
//     }
// }



public class SuperKeyW {
    public static void main(String args[]){
        Horse h1 = new Horse();
        System.out.println(h1.color);

    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called.");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("Horse constructor is called.");
    }
}