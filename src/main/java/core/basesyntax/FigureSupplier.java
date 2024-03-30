package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final FigureType[] FIGURE_TYPES = FigureType.values();
    private static final int FIGURE_COUNT = FIGURE_TYPES.length;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType figureType = getRandomFigureType();
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case SQUARE -> new Square(color, getRandomSide());
            case RECTANGLE -> new Rectangle(color, getRandomSide(), getRandomSide());
            case RIGHT_TRIANGLE -> new RightTriangle(color, getRandomSide(), getRandomSide());
            case CIRCLE -> new Circle(color, getRandomRadius());
            case ISOSCELES_TRAPEZOID ->
                    new IsoscelesTrapezoid(color, getRandomSide(),
                            getRandomSide(), getRandomSide());
            default -> throw new IllegalStateException("Unexpected value: " + figureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double getRandomSide() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomRadius() {
        return random.nextDouble() * 10 + 1;
    }

    private FigureType getRandomFigureType() {
        int index = random.nextInt(FIGURE_COUNT);
        return FIGURE_TYPES[index];
    }
}
