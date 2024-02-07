package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 15;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Figures getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_COLOR,
                DEFAULT_RADIUS);
        return circle;
    }

    public Figures getRandomFigure() {
        int index = new Random().nextInt(Figure.values().length);
        switch (Figure.values()[index]) {
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case CIRCLE:
                return getCircle();
            case RIGHTTRIANGLE:
                return getRightTriangle();
            case ISOSCELESTRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                getDefaultFigure();
        }
        return getDefaultFigure();
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE));
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE));
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }
}
