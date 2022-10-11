package figures_abstract;

public abstract class Figure {
    protected double a;
    protected double b;
    protected double r;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure(double r) {
        this.r = r;
    }

    public abstract double area();

    public abstract double perimeter();
}
