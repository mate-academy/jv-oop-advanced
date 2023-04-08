package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANGE = 101;
    private static final Random random = new Random();
    private static final ColorSupplier randomColor = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomRectangle();
            case 2:
                return createRandomRightTriangle();
            case 3:
                return createRandomCircle();
            default:
                return createRandomIsoscelesTrapezoid();
        }
    }

    private Figure createRandomSquare() {
        return new Square(randomColor.getRandomColor(), random.nextInt(RANGE));
    }

    private Figure createRandomRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                random.nextInt(RANGE), random.nextInt(RANGE));
    }

    private Figure createRandomRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextInt(RANGE), random.nextInt(RANGE));
    }

    private Figure createRandomCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextInt(RANGE));
    }

    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(), random.nextInt(RANGE),
                random.nextInt(RANGE), random.nextInt(RANGE));
    }
}
