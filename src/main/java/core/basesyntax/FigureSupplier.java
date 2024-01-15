package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 50;
    public static final int NUMBER_OF_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int value = random.nextInt(NUMBER_OF_FIGURE);
        switch (value) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getRandomFigure();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE));
    }
}


