package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;
    public static final int DEFAULT_FIGURE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_FIGURE_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FigureType.values().length)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomTriangle();
            case 4:
                return getRandomTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + MIN_VALUE,
                random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    public Figure getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE)
                + MIN_VALUE, random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    public Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE)
                + MIN_VALUE, random.nextInt(MAX_VALUE) + MIN_VALUE, random.nextInt(MAX_VALUE)
                + MIN_VALUE);
    }
}
