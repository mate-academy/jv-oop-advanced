package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FiguresList.values().length);
        FiguresList randomFigure = FiguresList.values()[index];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND));

            case TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND));
            case TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND),
                        random.nextInt(BOUND));
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigure);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
