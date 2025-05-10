package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
            case ISISCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10), random.nextInt(10));
            default: throw new RuntimeException("This object is not of required type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}
