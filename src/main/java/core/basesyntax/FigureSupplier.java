package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int SIDE_MAX_VALUE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureCount = 1 + (int) (Math.random() * FIGURE_TYPES);

        switch (figureCount) {
            case 1: return getRandomSquare();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomCircle();
            default: return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSide());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSide());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSide(), getRandomSide(), getRandomSide());
    }

    public int getRandomSide() {
        return random.nextInt(SIDE_MAX_VALUE);
    }
}
