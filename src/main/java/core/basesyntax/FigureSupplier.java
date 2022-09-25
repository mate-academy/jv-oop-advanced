package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int CIRCLE_DEFAULT_RADIUS = 10;
    public static final String CIRCLE_DEFAULT_COLOR = Color.WHITE.name();
    public static final int FIGURE_TYPE_NUMBER = 5;
    public static final int CONST_NUMBER = 50;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_TYPE_NUMBER);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomInt(),
                getRandomInt(), getRandomInt());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),getRandomInt());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),getRandomInt());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private int getRandomInt() {
        return random.nextInt(CONST_NUMBER);
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_DEFAULT_COLOR, CIRCLE_DEFAULT_RADIUS);
    }
}

