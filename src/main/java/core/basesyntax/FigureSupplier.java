package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getRectangle();
            case 1:
                return getRightTriangle();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getCircle();
            default:
                return getSquare();
        }
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random
                .nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random
                .nextInt(MAX_VALUE), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random
                .nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
