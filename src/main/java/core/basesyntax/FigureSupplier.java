package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private double randomValue = Math.abs(random.nextInt());
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure circle = new Circle(colorSupplier.getRandomColor(), randomValue);
    private Figure isosceles_trapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomValue,
            randomValue, randomValue);
    private Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), randomValue, randomValue);
    private Figure right_triangle = new RightTriangle(colorSupplier.getRandomColor(), randomValue, randomValue);
    private Figure square = new Square(colorSupplier.getRandomColor(), randomValue);
    private Figure [] figures = {circle, isosceles_trapezoid, rectangle, right_triangle, square, circle};

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);

        if (figures[index] instanceof Circle) {
            return circle;
        }
        if (figures[index] instanceof IsoscelesTrapezoid) {
            return isosceles_trapezoid;
        }
        if (figures[index] instanceof Rectangle) {
            return rectangle;
        }
        if (figures[index] instanceof RightTriangle) {
            return right_triangle;
        }
        if (figures[index] instanceof Square) {
            return square;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(Color.WHITE, 10);
        return defaultFigure;
    }
}
