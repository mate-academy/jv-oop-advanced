package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_COUNT);
        switch (figureNumber) {
            case 0:
                return createCircle();
            case 1:
                return createSquare();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            case 4:
                return createIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomSide() {
        return random.nextInt(MAX_VALUE);
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSide(), getRandomSide());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSide(),
                getRandomSide(), getRandomSide());
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
    }

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSide());
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSide());
    }
}
