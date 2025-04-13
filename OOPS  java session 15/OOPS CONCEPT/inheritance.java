// Inheritance is when properties and methods of the base class are passed on to a derived class
// public class inheritance {
//     public static void main(String args[]){
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }



//multiLevel inheritance
// public class inheritance {
//     public static void main(String args[]){
//         Dog dubby = new Dog();
//         dubby.legs = 4;
//         dubby.eat();
//         System.out.println(dubby.legs);
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }
// class Mammels extends Animal{
//     int legs;
// }
// class Dog extends Mammels{
//     String breed;
// }


// Hierarchial inheritance 
// public class inheritance {
//     public static void main(String args[]){
//         Fish shark = new Fish();
//         Mammels m1 = new Mammels();
//         Bird parrot = new Bird();
//         m1.walks();
//         parrot.fly();
//         shark.swim();
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }
// class Mammels extends Animal{
//     void walks(){
//         System.out.println("Walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swim");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }



//Hybrid inheritance

// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Swimmer {
    void swim();
}

// Base Class
class Dog {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child Class: Jo Animal interface ko implement karegi aur Dog se inherit karegi
class Labrador extends Dog implements Animal, Swimmer {
    // Animal interface ka method implement karna
    public void eat() {
        System.out.println("Labrador eats");
    }

    // Swimmer interface ka method implement karna
    public void swim() {
        System.out.println("Labrador swims");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.bark();   // Dog class ka method
        lab.eat();    // Animal interface ka method
        lab.swim();   // Swimmer interface ka method
    }
}

