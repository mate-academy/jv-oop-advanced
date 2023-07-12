package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_NUMBER = 40;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getSquare();
            default:
                return getRightTriangle();
        }
    }

    public Circle getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER));
    }

    public Rectangle getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER));
    }

    public Square getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_NUMBER),
                random.nextInt(MAX_NUMBER));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
