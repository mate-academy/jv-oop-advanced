package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 25;
    public static final int VALUE_FOR_DEFAULT_FIGURE = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureClass.values().length);
        switch (FigureClass.values()[index]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), VALUE_FOR_DEFAULT_FIGURE);
    }

    private Circle getRandomCircle() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Square getRandomSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(supplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }
}
