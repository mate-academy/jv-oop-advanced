package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Circle(color, random.nextDouble() * BOUND);
            case 1:
                return new Square(color, random.nextDouble() * BOUND);
            case 2:
                return new Rectangle(color, random.nextDouble() * BOUND, random.nextDouble() * BOUND);
            case 3:
                return new RightTriangle(color, random.nextDouble() * BOUND, random.nextDouble() * BOUND);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * BOUND, random.nextDouble() * BOUND, random.nextDouble() * BOUND);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
