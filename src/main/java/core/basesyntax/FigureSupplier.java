package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 10;
    private static final int FIGURE_TYPES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_TYPES)) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            case 4:
                return createIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    private double getRandomSide() {
        return random.nextDouble() * MAX_SIDE_LENGTH;
    }

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSide());
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSide());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSide(),
                getRandomSide(),
                getRandomSide());
    }
}
