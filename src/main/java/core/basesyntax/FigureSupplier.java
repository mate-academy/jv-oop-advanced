package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_OF_RANDOM_PARAMETER = 30;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = supplier.getRandomColor();
        int index = random.nextInt(FigureShape.values().length);
        FigureShape figureShape = FigureShape.values()[index];
        int parameter1 = random.nextInt(BOUND_OF_RANDOM_PARAMETER);
        int parameter2 = random.nextInt(BOUND_OF_RANDOM_PARAMETER);

        switch (figureShape) {
            case SQUARE:
                return new Square(randomColor, parameter1);
            case RECTANGLE:
                return new Rectangle(randomColor, parameter1, parameter2);
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, parameter1, parameter2);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor, parameter1, parameter2);
            case CIRCLE:
                return new Circle(randomColor, parameter1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}


