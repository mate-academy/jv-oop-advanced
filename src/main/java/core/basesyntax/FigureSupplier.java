package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 20;
    private static final int MAX_NUMBER_RANDOM_FIGURE = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor().toString(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor().toString(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor().toString(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toString(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor().toString(),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_RANDOM_FIGURE)) {
            case 1: {
                return getRandomCircle();
            } case 2: {
                return getRandomSquare();
            } case 3: {
                return getRandomRectangle();
            } case 4: {
                return getRandomRightTriangle();
            } case 5: {
                return getRandomIsoscelesTrapezoid();
            } default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorsEnum.WHITE.toString(), 10);
    }

}
