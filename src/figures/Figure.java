package figures;

public abstract class Figure {
    double a;
    double b;
    double r;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure(double r) {
        this.r = r;
    }

    protected abstract double area();

    protected abstract double perimeter();
}
