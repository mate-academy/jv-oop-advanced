package core.basesyntax;

import java.util.Random;

public class FigureSupplire {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplire colorSupplire = new ColorSupplire();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplire.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplire.getRandomColor(), random.nextInt(MAX_VALUE + 1),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplire.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplire.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplire.getRandomColor(), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }
}
