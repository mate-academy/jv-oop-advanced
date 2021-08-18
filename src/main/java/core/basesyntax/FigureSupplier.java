package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 127;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(NUMBER_OF_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomLength = random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;

        switch (randomFigureIndex) {
            case 0:
                return new IsoscelesTrapezoid(randomLength,
                        randomLength + random.nextInt(MAX_VALUE),
                        randomLength + random.nextInt(MAX_VALUE), randomColor);
            case 1:
                return new Circle(randomLength, randomColor);
            case 2:
                return new RightTriangle(randomLength, randomLength, randomColor);
            case 3:
                return new Square(randomLength, randomColor);
            default:
                return new Rectangle(randomLength, randomLength, randomColor);
        }
    }
}
