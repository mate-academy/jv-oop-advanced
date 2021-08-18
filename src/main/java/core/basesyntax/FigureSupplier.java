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
        switch (nameFigure[RANDOM]) {
            case CIRCLE:
                Figure f1 = new Circle(
                        CIRCLE, myRandom(), colorSupplier.getRandomColor());
                return f1;
            case ISOSCELES_TRAPEZOID:
                Figure f2 = new IsoscelesTrapezoid(ISOSCELES_TRAPEZOID,
                        myRandom(), myRandom(), myRandom(), colorSupplier.getRandomColor());
                return f2;
            case RECTANGLE:
                Figure f3 = new Rectangle(
                        RECTANGLE, myRandom(), myRandom(), colorSupplier.getRandomColor());
                return f3;
            case RIGHT_TRIANGLE:
                Figure f4 = new RightTriangle(
                        RIGHT_TRIANGLE, myRandom(), myRandom(), colorSupplier.getRandomColor());
                return f4;
            default:
                Figure f5 = new Square(
                        SQUARE, myRandom(), colorSupplier.getRandomColor());
                return f5;

        }
    }

    private int myRandom() {
        return new Random().nextInt(nameFigure.length);
    }
}
