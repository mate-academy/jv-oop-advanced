package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 10;
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figures.values().length);
        switch (Figures.values()[index]) {
            case SQUARE:
                return getSquare();
            case CIRCLE:
                return getCircle();
            case RECTANGLE:
                return getRectangle();
            case RIGHTTRIANGLE:
                return getRightTriangle();
            case ISOSCELESTRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                getDefaultFigure();
        }
        return getDefaultFigure();
    }

    public Circle getCircle() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

    public Square getSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(supplier.getRandomColor(),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        return circle;
    }
}

