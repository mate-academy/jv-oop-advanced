package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final double MAX_DIMENSION = 10.0;
    private static final int FIGURE_TYPE = 5;
    private static final int RADIUS_DEFAULT_CIRCLE = 10;
    private static final String COLORS = Color.WHILE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(Color color) {
        int figureType = random.nextInt(FIGURE_TYPE);
        switch (figureType) {
            case 0:
                return createRandomSquare(color);
            case 1:
                return createRandomRectangle(color);
            case 2:
                return createRandomIsoscelesTrapezoid(color);
            case 3:
                return createRandomCircle(color);
            default:
                return createRandomRightTriangle(color);
        }
    }

    private Square createRandomSquare(Color color) {
        double side = random.nextDouble() * MAX_DIMENSION;
        return new Square(color.name(), side);
    }

    private Rectangle createRandomRectangle(Color color) {
        double length = random.nextDouble() * MAX_DIMENSION;
        double width = random.nextDouble() * MAX_DIMENSION;
        return new Rectangle(color.name(), length, width);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(Color color) {

        double topBase = random.nextDouble() * MAX_DIMENSION;
        double bottomBase = random.nextDouble() * MAX_DIMENSION;
        double height = random.nextDouble() * MAX_DIMENSION;
        return new IsoscelesTrapezoid(color.name(), topBase, bottomBase, height);
    }

    private Circle createRandomCircle(Color color) {
        double radius = random.nextDouble() * MAX_DIMENSION;
        return new Circle(color.name(), radius);
    }

    private RightTriangle createRandomRightTriangle(Color color) {
        double firstLeg = random.nextDouble() * MAX_DIMENSION;
        double secondLeg = random.nextDouble() * MAX_DIMENSION;
        return new RightTriangle(color.name(), firstLeg, secondLeg);
    }

    public Figure getDefaultFigure() {
        String color = COLORS;
        double radius = RADIUS_DEFAULT_CIRCLE;
        return new Circle(color, radius);
    }
}

