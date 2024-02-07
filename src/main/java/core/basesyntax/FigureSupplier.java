package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    protected static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FigureType.values().length);

        switch (FigureType.values()[figureNumber]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomFigure();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND), random.nextInt(BOUND));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }
}
