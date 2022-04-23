package day50_inheritance.Shapes;

public class Square extends Shape{

    public double side;

    public Square(double side){

        this.side=side;
    }
    public double area(){

        return side*side;
    }
    public double perimeter(){

        return 4*side;
    }
}
