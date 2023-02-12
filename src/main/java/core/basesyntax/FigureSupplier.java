package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_BOUNDS = 100;
    private static final Colors defaultColor = Colors.WHITE;
    private static final int defaultRadius = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figures nameOfFigure() {
        return Figures.values()[random.nextInt(Figures.values().length)];
    }

    public Figure getRandomFigure() {
        switch (nameOfFigure()) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS));
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
