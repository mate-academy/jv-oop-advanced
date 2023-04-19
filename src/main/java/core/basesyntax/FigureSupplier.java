package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT_OF_FIGURES = 5;
    private static final int MAX_VALUE_FOR_BOUND = 100;
    private static final int RADIUS_BY_DEFAULT = 10;
    private static final Color COLOR_BY_DEFAULT = Color.WHITE;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = getRandomeType();
        Figure figure = null;
        switch (index) {
            case 0:
                figure = createCircle();
                break;
            case 1:
                figure = createSquare();
                break;
            case 2:

                figure = createRectangle();
                break;
            case 3:

                figure = createRightTriangle();
                break;
            default:
                figure = createIsoscelesTrapezoid();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_BY_DEFAULT, COLOR_BY_DEFAULT);
    }

    private int getRandomeType() {
        return random.nextInt(MAX_COUNT_OF_FIGURES);
    }

    private Circle createCircle() {
        int randomeRadius = random.nextInt(MAX_VALUE_FOR_BOUND);
        return new Circle(randomeRadius, colorSupplier.getRandomColor());
    }

    private Square createSquare() {
        int squareRandomeSide = random.nextInt(MAX_VALUE_FOR_BOUND);
        return new Square(squareRandomeSide, colorSupplier.getRandomColor());
    }

    private Rectangle createRectangle() {
        int rectangleRandomASide = random.nextInt(MAX_VALUE_FOR_BOUND);
        int rectangleRandomBSide = random.nextInt(MAX_VALUE_FOR_BOUND);
        return new Rectangle(rectangleRandomASide,
                rectangleRandomBSide,
                colorSupplier.getRandomColor());
    }

    private RightTriangle createRightTriangle() {
        int firstRandomeLeg = random.nextInt(MAX_VALUE_FOR_BOUND);
        int secondRandomeLeg = random.nextInt(MAX_VALUE_FOR_BOUND);
        return new RightTriangle(firstRandomeLeg,
                secondRandomeLeg,
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        int trapezoidRandomeASide = random.nextInt(MAX_VALUE_FOR_BOUND);
        int trapezoidRandomeBSide = random.nextInt(MAX_VALUE_FOR_BOUND);
        int trapezoidRandomeHeigth = random.nextInt(MAX_VALUE_FOR_BOUND);
        return new IsoscelesTrapezoid(trapezoidRandomeASide,
                trapezoidRandomeBSide,
                trapezoidRandomeHeigth,
                colorSupplier.getRandomColor());
    }
}
