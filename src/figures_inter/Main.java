package figures_inter;

import figures_abstract.Circle;
import figures_abstract.Figure;
import figures_abstract.Rectangle;
import figures_abstract.Triangle;

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

        Figure figure4 = new Triangle(8.9, 9.10);
        Figure figure5 = new Triangle(9.10, 10.11);
        double sum = 0;
        Figure[] array = {figure1, figure2, figure3, figure4, figure5};
        for (Figure figures : array) {
            sum += figures.perimeter();
        }
        System.out.println("Sum of perimeters = " + sum);
    }
}
