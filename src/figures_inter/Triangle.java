package figures_inter;

public class Triangle implements Figure {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return (0.5 * a * b);
    }

    @Override
    public double perimeter() {
        return (2 * a + b);
    }
}
