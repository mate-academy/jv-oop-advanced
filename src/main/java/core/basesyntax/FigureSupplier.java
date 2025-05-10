package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE_OF_PARAMETER = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
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

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_OF_PARAMETER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_OF_PARAMETER),
                random.nextInt(MAX_VALUE_OF_PARAMETER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_OF_PARAMETER),
                random.nextInt(MAX_VALUE_OF_PARAMETER));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_OF_PARAMETER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_OF_PARAMETER),
                random.nextInt(MAX_VALUE_OF_PARAMETER),
                random.nextInt(MAX_VALUE_OF_PARAMETER));
    }
}
