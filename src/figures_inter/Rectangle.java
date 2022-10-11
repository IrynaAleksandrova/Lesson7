package figures_inter;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return (a * b);
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
