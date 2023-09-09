package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        final int bound = 100;
        int index = random.nextInt(FiguresList.values().length);
        FiguresList randomFigure = FiguresList.values()[index];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(bound));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(bound));
            case TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(bound),
                        random.nextInt(bound));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(bound),
                        random.nextInt(bound));
            case TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(bound),
                        random.nextInt(bound),
                        random.nextInt(bound));
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigure);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle();
    }
}
