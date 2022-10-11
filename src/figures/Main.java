package figures;

public class Main {
//    Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
//    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
//    Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.

    public static void main(String[] args) {
        Figure figure1 = new Triangle(7.23, 10.11);
        Figure figure2 = new Rectangle(12.15, 16.02);
        Figure figure3 = new Circle(14.93, Math.PI);

        System.out.println(figure1.area());
        System.out.println(figure2.area());
        System.out.println(figure3.area());

        System.out.println(figure1.perimeter());
        System.out.println(figure2.perimeter());
        System.out.println(figure3.perimeter());

        Figure figure4 = new SomeRectangle(5.6, 6.7);
        Figure figure5 = new SomeRectangle(6.7, 7.8);
        Figure figure6 = new SomeRectangle(7.8, 8.9);
        Figure figure7 = new SomeRectangle(8.9, 9.10);
        Figure figure8 = new SomeRectangle(9.10, 10.11);
        double sum = 0;
        Figure[] array = {figure4, figure5, figure6, figure7, figure8};
        for (Figure figures : array) {
            sum += figures.perimeter();
        }
        System.out.println("Sum of perimeters = " + sum);
    }
}
