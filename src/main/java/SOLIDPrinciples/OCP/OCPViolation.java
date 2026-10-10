package SOLIDPrinciples.OCP;

//Violates OCP: Every time a new shape is added, we need to modify the existing class.

class AreaCalculator {
    public double calculateArea(String shape, double radius, double length,
                                double breadth){
        if(shape.equals("Circle")){
            return Math.PI * radius * radius;
        }
        else if(shape.equals("rectangle")){
            return length * breadth;
        }

        return 0;
    }
}

public class OCPViolation{
    static void main() {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Circle Area: "+areaCalculator.calculateArea("Circle", 5, 10, 10));
    }
}
