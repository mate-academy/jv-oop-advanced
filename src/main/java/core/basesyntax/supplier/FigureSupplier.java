package core.basesyntax.supplier;

import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[5];
        Figure square = new Square("Square", random.nextInt(100), colorSupplier.getRandomColor(), random.nextInt(100));
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid("Isosceles Trapezoid", random.nextInt(100), colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Figure rightTriangle = new RightTriangle("RightTriangle", random.nextInt(100), colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Figure circle = new Circle("Circle", random.nextInt(100), colorSupplier.getRandomColor(), random.nextInt(100));
        Figure rectangle = new Rectangle("Rectangle", random.nextInt(100), colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(100));
        figures[0] = square;
        figures[1] = circle;
        figures[2] = rectangle;
        figures[3] = isoscelesTrapezoid;
        figures[4] = rightTriangle;
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("Default Circle", 100, colorSupplier.getWhiteColor(), 10);

    }
}
