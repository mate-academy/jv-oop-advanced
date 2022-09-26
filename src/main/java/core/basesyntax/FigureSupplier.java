package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE_VALUE = 50;
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier(RANDOM);

    public Figure getRandomFigure() {
        Figures figure = Figures.values()[RANDOM.nextInt(Figures.values().length)];
        switch (figure) {
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case RIGHTTRIANGLE:
                return getRightTriangle();
            case ISOSCELESTRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Circle getCircle() {
        return new Circle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE_VALUE));
    }

    public Square getSquare() {
        return new Square(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE_VALUE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE_VALUE),
                RANDOM.nextInt(MAX_SIZE_VALUE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE_VALUE),
                RANDOM.nextInt(MAX_SIZE_VALUE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_SIZE_VALUE),
                RANDOM.nextInt(MAX_SIZE_VALUE),
                RANDOM.nextInt(MAX_SIZE_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
