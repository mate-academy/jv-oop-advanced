package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_CIRCLE = 10;
    private static final int MAX_LENGTH = 100;
    private static final int NUMBER_FIGURE = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                                                                 random.nextInt(MAX_LENGTH));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                                                             random.nextInt(MAX_LENGTH));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_FIGURE)) {
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
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS_CIRCLE);
    }
}
