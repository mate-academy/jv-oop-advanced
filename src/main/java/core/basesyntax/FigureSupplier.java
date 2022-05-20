package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int RANDOM_PARAMETER = 10;
    private static final int DEFAULT_PARAMETER = 3;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier(new Random());
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_NUMBER)) {
            case 0:
                return getSquare();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getCircle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_PARAMETER));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_PARAMETER),
                random.nextInt(RANDOM_PARAMETER));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_PARAMETER),
                random.nextInt(RANDOM_PARAMETER));
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_PARAMETER));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(RANDOM_PARAMETER),
                random.nextInt(RANDOM_PARAMETER),
                random.nextInt(RANDOM_PARAMETER));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_PARAMETER);
    }
}
