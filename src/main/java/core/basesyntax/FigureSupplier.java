package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();

    }

    private double generateRandomSize() {
        return random.nextDouble() * 100;
    }

    public Figure getRandomFigure() {
        int randomType = random.nextInt(NUMBER_OF_FIGURES);
        double randomSize = generateRandomSize();
        double randomSize1 = generateRandomSize();
        double randomSize2 = generateRandomSize();
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
