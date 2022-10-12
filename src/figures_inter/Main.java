package figures_inter;

public class Main {
    //    Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
    //    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    //    Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.

    public static void main(String[] args) {
        Figure figure1 = new Triangle(7.23, 10.11);
        Figure figure2 = new Rectangle(12.15, 16.02);
        Figure figure3 = new Circle(14.93, Math.PI);

        printArea(figure1.area());
        printArea(figure2.area());
        printArea(figure3.area());

        printPerimeter(figure1.perimeter());
        printPerimeter(figure2.perimeter());
        printPerimeter(figure3.perimeter());

        Figure figure4 = new Triangle(8.9, 9.10);
        Figure figure5 = new Triangle(9.10, 10.11);
        double sum = 0;

        Figure[] array = {figure1, figure2, figure3, figure4, figure5};
        for (Figure figures : array) {
            sum += figures.perimeter();
        }
        printPerimeter("Sum of perimeters five figures = ", sum);
    }

    public static void printArea(Object o) { System.out.println("Area: " + o.toString()); }

    public static void printPerimeter(Object o) {
        System.out.println("Perimeter: " + o.toString());
    }

    public static void printPerimeter(String message, Object o) {
        System.out.println(message + o.toString());
    }

}
