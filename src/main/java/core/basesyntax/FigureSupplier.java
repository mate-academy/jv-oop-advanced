package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";

    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));

    }

    public Figure getRandomFigure() {

        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

