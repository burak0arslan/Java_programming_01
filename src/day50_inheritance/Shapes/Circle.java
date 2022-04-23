package day50_inheritance.Shapes;

public class Circle extends Shape{

    public double radius;
    public static double pi = 3.14;

    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return radius*radius*pi;
    }
    public double perimeter(){
        return 2*pi*radius;
    }
}
