package figures;

public class SomeRectangle extends Figure {

    public SomeRectangle(double a, double b) {
        super(a, b);
    }

    protected double area() {
        return 0;
    }

    protected double perimeter() {
        return (a * b);
    }
}
