package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int index = random.nextInt(FigureNames.values().length);
        switch (FigureNames.values()[index]) {
            case CIRCLE:
                return new Circle(
                        random.nextDouble(), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(
                        random.nextDouble(), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(
                        random.nextDouble(), random.nextDouble(), colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        random.nextDouble(), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(random.nextDouble(), Color.WHITE);
    }
}
