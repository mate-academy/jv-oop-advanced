package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomType = random.nextInt(NUMBER_OF_FIGURES);
        double randomMax = random.nextDouble(Integer.MAX_VALUE);
        double randomMax1 = random.nextDouble(Integer.MAX_VALUE);
        double randomMax2 = random.nextDouble(Integer.MAX_VALUE);
        String randomColor = colorSupplier.getRandomColor();

        switch (randomType) {
            case 0:
                return new Circle(randomMax, randomColor);
            case 1:
                return new Square(randomMax, randomColor);
            case 2:
                return new Rectangle(randomMax, randomMax1, randomColor);
            case 3:
                return new RightTriangle(randomMax, randomMax1, randomColor);
            default:
                return new IsoscelesTrapezoid(randomMax, randomMax1, randomMax2, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, colorSupplier.getWhiteColor());
    }
}
