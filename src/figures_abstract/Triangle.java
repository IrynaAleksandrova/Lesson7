package figures_abstract;

public class Triangle extends Figure {

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Area of a triangle: ");
        return (0.5 * a * b);
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter of a triangle: ");
        return (2 * a + b);
    }
}
