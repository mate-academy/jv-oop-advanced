package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PROPERTY = 30;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getRandomRightTriangle();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY));
    }
}
