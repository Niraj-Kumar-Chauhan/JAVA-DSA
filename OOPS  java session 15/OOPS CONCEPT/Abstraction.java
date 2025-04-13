public class Abstraction {
    public static void main(String args[]){
        Checken c1 = new Checken();
        c1.eat();
        c1.walks();

        Horse h1 = new Horse();
        h1.eat();
        h1.walks();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walks();
}
class Horse extends Animal{
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
class Checken extends Animal{
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
