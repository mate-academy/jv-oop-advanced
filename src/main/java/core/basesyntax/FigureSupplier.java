package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int randomType = random.nextInt(NUMBER_OF_FIGURES);
        // Assuming max size for a figure is 100 for the example
        double randomSize = random.nextDouble() * 100;
        double randomSize1 = random.nextDouble() * 100;
        double randomSize2 = random.nextDouble() * 100;
        String randomColor = colorSupplier.getColorRandom();
        switch (randomType) {
            case 0:
                return new Circle(randomColor, randomSize);
            case 1:
                return new Square(randomSize, randomColor);
            case 2:
                return new Rectangle(randomSize, randomSize1, randomColor);
            case 3:
                return new RightTriangle(randomSize, randomSize1, randomColor);
            default:
                return new IsoscelesTrapezoid(randomSize, randomSize1, randomSize2, randomColor);
        }
    }
}
