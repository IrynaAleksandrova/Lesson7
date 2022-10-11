package figures_inter;

public class Circle implements Figure {
    private double r;
    private double PI;

    public Circle(double r, double PI) {
        this.r = r;
        this.PI = PI;
    }

    @Override
    public double area() {
        return (r * r * PI);
    }

    @Override
    public double perimeter() {
        return (2 * r * PI);
    }
}
