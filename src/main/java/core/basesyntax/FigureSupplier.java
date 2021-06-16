package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN = 1;
    private static final int MAX = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomSide = random.nextInt(MIN, MAX + 1);
        int index = random.nextInt(FigureEnum.values().length);
        FigureEnum randomFigure = FigureEnum.values() [index];

        switch (randomFigure) {
            case CIRCLE -> {
                return new Circle(colorSupplier.getRandomColor(), randomSide);
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        + randomSide, randomSide, randomSide);
            }
            case RECTANGLE -> {
                return new Rectangle(colorSupplier.getRandomColor(), randomSide, randomSide);
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(colorSupplier.getRandomColor(), randomSide, randomSide);
            }
            case SQUARE -> {
                return new Square(colorSupplier.getRandomColor(), randomSide);
            }
            default -> {
                return new Circle(ColorEnum.WHITE.toString(), MAX);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorEnum.WHITE.toString(), MAX);
    }
}
