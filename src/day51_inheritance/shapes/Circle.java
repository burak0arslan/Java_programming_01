package day51_inheritance.shapes;

public class Circle extends Shape{
    //static double pi = 3.14;

    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius=radius;
    }

    @Override
    public double area() {
        //return pi*radius*radius;
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        //return 2*radius*radius;
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
