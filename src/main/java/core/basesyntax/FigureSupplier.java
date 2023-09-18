package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int FIGURES_COUNT = 5;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int randomSizeRange = random.nextInt(10) + 1;

        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), randomSizeRange);
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomSizeRange, randomSizeRange, randomSizeRange);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), randomSizeRange, randomSizeRange);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), randomSizeRange, randomSizeRange);
            default:
                return new Square(colorSupplier.getRandomColor(), randomSizeRange);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
