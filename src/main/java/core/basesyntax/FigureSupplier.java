package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final int MAX_SIZE = 30;
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier(RANDOM);

    public Figure getRandomFigure() {
        Figures randomEnumFigure = Figures.values()[RANDOM.nextInt(Figures.values().length)];
        switch (randomEnumFigure) {
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case RIGHT_TRIANGLE:
                return getRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Circle getCircle() {
        return new Circle(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextInt(MAX_SIZE));
    }

    public Square getSquare() {
        return new Square(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextInt(MAX_SIZE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE), RANDOM.nextInt(MAX_SIZE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(
                COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE), RANDOM.nextInt(MAX_SIZE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextInt(MAX_SIZE),
                RANDOM.nextInt(MAX_SIZE), RANDOM.nextInt(MAX_SIZE));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
