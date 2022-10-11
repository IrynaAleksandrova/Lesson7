package figures_abstract;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    public double area() {
        System.out.println("Area of a rectangle: ");
        return (a * b);
    }

    public double perimeter() {
        System.out.println("Perimeter of a rectangle: ");
        return (2 * (a + b));
    }
}
