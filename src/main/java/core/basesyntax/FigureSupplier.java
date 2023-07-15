package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int UPPER_INTEGER_BOUND = 10;
    private static final String WHITE_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }
    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomIntValue());
    }

    private Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomIntValue(),
                getRandomIntValue(), getRandomIntValue());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomIntValue(),
                getRandomIntValue());
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomIntValue(),
                getRandomIntValue());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomIntValue());
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR, 10);
    }

    private int getRandomIntValue() {
        return random.nextInt(UPPER_INTEGER_BOUND);
    }
}
