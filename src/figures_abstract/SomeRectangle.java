package figures_abstract;

public class SomeRectangle extends Figure {

    public SomeRectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return (a * b);
    }
}
