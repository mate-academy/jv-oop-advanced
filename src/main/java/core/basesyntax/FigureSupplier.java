package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_RANDOM_VALUE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(Color.values().length);

        switch (Figures.values()[randomInt]) {
            case CIRCLE:
                getCircle();
            case RECTANGLE:
                getRectangle();
            case SQUARE:
                getSquare();
            case RIGHTTRIANGLE:
                getRightTriangle();
            default :
                getIsoscelesTrapezoid();
        }
        return getDefaultFigure();
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
                random.nextDouble(MAX_RANDOM_VALUE),
                random.nextDouble(MAX_RANDOM_VALUE));
    }

    private Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(MAX_RANDOM_VALUE),
                random.nextDouble(MAX_RANDOM_VALUE));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(MAX_RANDOM_VALUE),
                random.nextDouble(MAX_RANDOM_VALUE),
                random.nextDouble(MAX_RANDOM_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
