package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_NUMBER = 100;
    private static final int NUMBER_OF_FIGURES = 4;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAXIMUM_NUMBER));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAXIMUM_NUMBER), random.nextInt(MAXIMUM_NUMBER),
                        random.nextInt(MAXIMUM_NUMBER));
            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAXIMUM_NUMBER));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAXIMUM_NUMBER), random.nextInt(MAXIMUM_NUMBER));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAXIMUM_NUMBER), random.nextInt(MAXIMUM_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
