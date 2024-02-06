package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_PROPERTY_VALUE = 50;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_PROPERTY_VALUE) + 1);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PROPERTY_VALUE) + 1,
                random.nextInt(MAX_PROPERTY_VALUE) + 1,
                random.nextInt(MAX_PROPERTY_VALUE) + 1);
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PROPERTY_VALUE) + 1,
                random.nextInt(MAX_PROPERTY_VALUE) + 1);
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PROPERTY_VALUE) + 1,
                random.nextInt(MAX_PROPERTY_VALUE) + 1);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PROPERTY_VALUE) + 1);
    }
}
