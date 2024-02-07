package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_UNITS = 10;
    private static final int FIGURES_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURES_NUMBER);
        String randomFigureName = FigureType.values()[randomFigureNumber].name();
        String randomColor = colorSupplier.getRandomColor();
        switch (FigureType.valueOf(randomFigureName)) {
            case SQUARE:
                return new Square(random.nextInt(MAXIMUM_UNITS),
                        randomColor);
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAXIMUM_UNITS),
                        random.nextInt(MAXIMUM_UNITS),
                        randomColor);
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MAXIMUM_UNITS),
                        random.nextInt(MAXIMUM_UNITS),
                        randomColor);
            case CIRCLE:
                return new Circle(random.nextInt(MAXIMUM_UNITS), randomColor);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(MAXIMUM_UNITS),
                        random.nextInt(MAXIMUM_UNITS),
                        random.nextInt(MAXIMUM_UNITS), randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name());
    }
}

