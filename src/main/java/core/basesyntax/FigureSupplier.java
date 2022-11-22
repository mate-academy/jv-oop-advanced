package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PROPERTY = 30;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY));
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY),
                random.nextInt(FIGURE_PROPERTY));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PROPERTY));
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
}
