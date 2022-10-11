package figures_abstract;

public class Circle extends Figure {

    double PI;

    public Circle(double r, double PI) {
        super(r);
        this.PI = PI;
    }

    public double area() {
        System.out.println("Area of a circle: ");
        return (r * r * PI);
    }

    public double perimeter() {
        System.out.println("Perimeter of a circle: ");
        return (2 * r * PI);
    }
}
