package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM = new Random().nextInt(5);
    private static final String CIRCLE = "Circle";
    private static final String ISOSCELES_TRAPEZOID = "IsoscelesTrapezoid";
    private static final String RECTANGLE = "Rectangle";
    private static final String RIGHT_TRIANGLE = "RightTriangle";
    private static final String SQUARE = "Square";
    private static final String[] nameFigure = new String[]
            {CIRCLE, ISOSCELES_TRAPEZOID, RECTANGLE, RIGHT_TRIANGLE, SQUARE};

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure;
        switch (nameFigure[RANDOM]) {
            case CIRCLE:
                figure = new Circle(
                        CIRCLE, myRandom(), colorSupplier.getRandomColor());
                return figure;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(ISOSCELES_TRAPEZOID,
                        myRandom(), myRandom(), myRandom(), colorSupplier.getRandomColor());
                return figure;
            case RECTANGLE:
                figure = new Rectangle(
                        RECTANGLE, myRandom(), myRandom(), colorSupplier.getRandomColor());
                return figure;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(
                        RIGHT_TRIANGLE, myRandom(), myRandom(), colorSupplier.getRandomColor());
                return figure;
            default:
                figure = new Square(
                        SQUARE, myRandom(), colorSupplier.getRandomColor());
                return figure;
        }
    }

    private int myRandom() {
        return new Random().nextInt(nameFigure.length);
    }
}
