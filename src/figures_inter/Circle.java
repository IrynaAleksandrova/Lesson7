package figures_inter;

public class Circle implements Figure {
    double r;
    double PI;

    @Override
    public double area() {
        System.out.println("Area of a circle: ");
        return (r * r * PI);
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter of a circle: ");
        return (2 * r * PI);
    }
}
