package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomRectangle();
            case 2:
                return createRandomCircle();
            case 3:
                return createRandomRightTriangle();
            case 4:
                return createRandomIsoscelesTrapezoid();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", CIRCLE_RADIUS);
    }

    private Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomDouble() * CIRCLE_RADIUS);
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble() * CIRCLE_RADIUS,
                getRandomDouble() * CIRCLE_RADIUS);
    }

    private Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomDouble() * CIRCLE_RADIUS);
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble() * CIRCLE_RADIUS,
                getRandomDouble() * CIRCLE_RADIUS);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble() * 10,
                getRandomDouble() * CIRCLE_RADIUS, getRandomDouble() * CIRCLE_RADIUS);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}
