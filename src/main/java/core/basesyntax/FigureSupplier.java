package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_MAXIMUM_VALUESE = 20;
    public static final int DEFAULT_FIGURE_MAXIMUM_VALUESE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = new Random().nextInt(FIGURE_COUNT);
        switch (randomFigureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(FIGURE_MAXIMUM_VALUESE));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_MAXIMUM_VALUESE),
                random.nextInt(FIGURE_MAXIMUM_VALUESE));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_MAXIMUM_VALUESE),
                random.nextInt(FIGURE_MAXIMUM_VALUESE));
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(FIGURE_MAXIMUM_VALUESE));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_MAXIMUM_VALUESE),
                random.nextInt(FIGURE_MAXIMUM_VALUESE),
                random.nextInt(FIGURE_MAXIMUM_VALUESE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_FIGURE_MAXIMUM_VALUESE);
    }
}
