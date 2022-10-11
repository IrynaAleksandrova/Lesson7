package figures;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    protected double area() {
        System.out.println("Area of a rectangle: ");
        return (a * b);
    }

    protected double perimeter() {
        System.out.println("Perimeter of a rectangle: ");
        return (2 * (a + b));
    }
}
