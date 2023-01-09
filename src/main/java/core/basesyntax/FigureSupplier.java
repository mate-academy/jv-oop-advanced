package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final int valueCount = 100;
    private final int figureCount = 5;

    public Figure getRandomFigure() {

        switch (random.nextInt(figureCount)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(valueCount), color.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(valueCount),
                random.nextInt(valueCount),
                random.nextInt(valueCount),
                color.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(valueCount),
                random.nextInt(valueCount),
                color.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(valueCount),
                random.nextInt(valueCount),
                color.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(valueCount), color.getRandomColor());
    }

    public Figure getDefaultFigure() {
        final int defaultValue = 10;
        final String white = Color.WHITE.name();
        return new Circle(defaultValue, white);
    }
}
