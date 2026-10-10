package SOLIDPrinciples.OCP;

interface Shape{
    double calculateArea();
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Calculator{
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}

public class OCPWithoutViolation {
    static void main() {
        Calculator calculator = new Calculator();
        System.out.println("Circle Area: "+calculator.calculateArea(new Circle(10)));
    }
}
