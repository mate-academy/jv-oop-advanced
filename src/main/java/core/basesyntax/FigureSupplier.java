package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private static final double MAX_RANDOM_VALUE = 10.;
    private static final int AMOUNT_OF_FIGURES = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = random.nextInt(AMOUNT_OF_FIGURES);
        switch (index) {
            case 0:
                return new Square(color, randomSide());
            case 1:
                return new Circle(color, randomSide());
            case 2:
                return new IsoscelesTrapezoid(color,
                        randomSide(), randomSide(),
                        randomSide());
            case 3:
                return new RightTriangle(color,
                        randomSide(),
                        randomSide());
            default:
                return new Rectangle(color,
                        randomSide(),
                        randomSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double randomSide() {
        return random.nextDouble(MAX_RANDOM_VALUE);
    }
}
