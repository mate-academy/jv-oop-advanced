package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int MAX_PARAMETER_VALUE = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_AMOUNT);
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
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PARAMETER_VALUE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PARAMETER_VALUE),
                random.nextInt(MAX_PARAMETER_VALUE),
                random.nextInt(MAX_PARAMETER_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PARAMETER_VALUE),
                random.nextInt(MAX_PARAMETER_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PARAMETER_VALUE),
                random.nextInt(MAX_PARAMETER_VALUE));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_PARAMETER_VALUE));
    }
}
