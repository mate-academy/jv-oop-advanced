package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String CIRCLE = "Circle";
    private static final String ISOSCELES_TRAPEZOID = "IsoscelesTrapezoid";
    private static final String RECTANGLE = "Rectangle";
    private static final String RIGHT_TRIANGLE = "RightTriangle";
    private static final String SQUARE = "Square";
    private static final String[] FIGURES = new String[]
            {CIRCLE, ISOSCELES_TRAPEZOID, RECTANGLE, RIGHT_TRIANGLE, SQUARE};

    public Figure getRandomFigure() {
        int randomIndex = getRandomNumber();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure;
        switch (FIGURES[randomIndex ]) {
            case CIRCLE:
                figure = new Circle(
                        CIRCLE, getRandomNumber(), colorSupplier.getRandomColor());
                return figure;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(
                        ISOSCELES_TRAPEZOID, getRandomNumber(), getRandomNumber(),
                        getRandomNumber(), colorSupplier.getRandomColor());
                return figure;
            case RECTANGLE:
                figure = new Rectangle(
                        RECTANGLE, getRandomNumber(), getRandomNumber(),
                        colorSupplier.getRandomColor());
                return figure;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(
                        RIGHT_TRIANGLE, getRandomNumber(), getRandomNumber(),
                        colorSupplier.getRandomColor());
                return figure;
            default:
                figure = new Square(
                        SQUARE, getRandomNumber(), colorSupplier.getRandomColor());
                return figure;
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(FIGURES.length);
    }
}
