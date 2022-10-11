package job_title;

public class Main {
    //    Создать классы "Директор", "Рабочий", "Бухгалтер".
    //    Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы.
    public static void main(String[] args) {
        Employees employees1 = new Director("Director");
        Employees employees2 = new Worker("Worker");
        Employees employees3 = new Accountant("Accountant");

        employees1.print();
        employees2.print();
        employees3.print();
    }
}
