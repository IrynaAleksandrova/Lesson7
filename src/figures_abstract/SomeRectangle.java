package figures_abstract;

public class SomeRectangle extends Figure {

    public SomeRectangle(double a, double b) {
        super(a, b);
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return (a * b);
    }
}
