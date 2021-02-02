package udemy;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        Rectangle r = new Rectangle();
        s.draw();
        r.draw();
    }
}
