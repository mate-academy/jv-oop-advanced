package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_BOUND = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int i = random.nextInt(FigureType.values().length);

        switch (FigureType.values()[i]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
            random.nextInt(RANDOM_BOUND));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
            random.nextInt(RANDOM_BOUND));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
            random.nextInt(RANDOM_BOUND),
            random.nextInt(RANDOM_BOUND));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
            random.nextInt(RANDOM_BOUND),
            random.nextInt(RANDOM_BOUND));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextInt(RANDOM_BOUND),
            random.nextInt(RANDOM_BOUND),
            random.nextInt(RANDOM_BOUND));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
