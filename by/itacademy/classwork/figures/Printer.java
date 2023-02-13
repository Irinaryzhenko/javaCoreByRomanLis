package by.itacademy.classwork.figures;

import by.itacademy.classwork.figures.figure2d.Circle;
import by.itacademy.classwork.figures.figure2d.Figures2d;
import by.itacademy.classwork.figures.figure2d.Square;
import by.itacademy.classwork.figures.figure2d.Triangle;
import by.itacademy.classwork.generics.Holder;

public class Printer<T extends Figures2d & Cornered> {


    private final T figure;

    public Printer(T figure) {
        this.figure = figure;
    }

    public void  printS() {
        System.out.println(figure.getS());
    }
    public void printCorners () {
        System.out.println(figure.getCountOfCorners());
    }

    public static void main(String[] args) {
        Holder<Figures2d> holder;
        Holder<Circle> circle;

        Square square = new Square(5);
        Printer <Square> squarePrinter = new Printer<>(square);
        Triangle triangle = new Triangle(3,6,7);
        Printer<Triangle> trianglePrinter = new Printer<>(triangle);

        trianglePrinter.printCorners();
        trianglePrinter.printS();

        squarePrinter.printS();
        squarePrinter.printCorners();
    }
}
