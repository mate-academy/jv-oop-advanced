package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 15;
    private static final int DEFAULT_VALUE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_VALUE);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }
}
