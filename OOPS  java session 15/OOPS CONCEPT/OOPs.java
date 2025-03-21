public class OOPs {
    public static void main(String args[]){
        Pen p1 = new Pen();              //created a Pen Object is called p1
        p1.setColor("yellow");
        //System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "blue";
        System.out.println(p1.color);
    }    
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int math , int phy , int chem){
        percentage = (math + phy + chem)/3;
    }
}
