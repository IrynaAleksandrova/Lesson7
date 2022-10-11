package figures_inter;

public class Rectangle implements Figure {
    double a;
    double b;

    @Override
    public double area() {
        System.out.println("Area of a rectangle: ");
        return (a * b);
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter of a rectangle: ");
        return (2 * (a + b));
    }
}
