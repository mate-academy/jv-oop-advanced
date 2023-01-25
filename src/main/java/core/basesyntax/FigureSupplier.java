package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_RANDOM_VALUE = 10;
    private final Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {

        int randomInt = random.nextInt(Figures.values().length);

        switch (Figures.values()[randomInt]) {
            case CIRCLE:
                return getCircle();
            case RECTANGLE:
                return getRectangle();
            case SQUARE:
                return getSquare();
            case RIGHTTRIANGLE:
                return getRightTriangle();
            default :
                return getIsoscelesTrapezoid();
        }
    }

    private Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public Circle getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
