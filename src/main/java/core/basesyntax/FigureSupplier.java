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

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND), random.nextInt(BOUND));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    public Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    public Figure getRandomFigure() {
        int figureNumber = new Random().nextInt(FigureEnum.values().length);

        switch (FigureEnum.values()[figureNumber]) {
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
}
