package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FigureType.values().length;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    enum FigureType {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }

    public Figure getRandomFigure() {
        FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
        return switch (type) {
            case CIRCLE -> new Circle(colorSupplier.getRandomColor(), random.nextDouble(10) + 1);
            case SQUARE -> new Square(colorSupplier.getRandomColor(), random.nextDouble(10) + 1);
            case RECTANGLE ->
                    new Rectangle(colorSupplier.getRandomColor(),
                            random.nextDouble(5) + 1,
                            random.nextDouble(10) + 1);
            case RIGHT_TRIANGLE -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(10) + 1,
                    random.nextDouble(8) + 1);
            case ISOSCELES_TRAPEZOID ->
                    new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                            random.nextDouble(10) + 1,
                            random.nextDouble(5) + 1,
                            random.nextDouble(4) + 1);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
