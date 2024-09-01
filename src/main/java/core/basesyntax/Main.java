package core.basesyntax;

import java.util.Random;

public class Main {
    static final Random random = new Random();

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure circle = new Circle();
        Figure rectangle = new Rectangle();
        Figure rightTriangle = new RightTriangle();
        Figure square = new Square();
        Figure isoscelesTrapezoid = new Figure();
        Figure[] figures = new Figure[]{circle, rectangle, rightTriangle, square, isoscelesTrapezoid};
        int count = 1;
        FigureSupplier figure = new FigureSupplier();
        Figure[] allFigures = new Figure[]{figure.getRandomFigure(figures), figure.getRandomFigure(figures), figure.getRandomFigure(figures),
                figure.getDefaultFigure(), figure.getDefaultFigure(), figure.getDefaultFigure()};
        for (int i = 0; i < allFigures.length; i++) {
            allFigures[i].printAllInformation();
            }
        }
}
