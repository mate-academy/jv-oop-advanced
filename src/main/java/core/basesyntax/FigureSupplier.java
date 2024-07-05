package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_SIZE = 10;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final int MAX_SIDE_LENGTH = 10;
    private static final int maxValue = 5;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(maxValue);
        String randomColor = colorSupplier.getRandomColor();
        double randomSide = getRandomSide();

        switch (figureType) {
            case 0:
                return new Square(randomColor.toLowerCase(), randomSide);
            case 1:
                return new Rectangle(randomColor, randomSide, randomSide);
            case 2:
                return new RightTriangle(randomColor, randomSide, randomSide);
            case 3:
                return new Circle(randomColor, randomSide);
            case 4:
                return new IsoscelesTrapezoid(randomColor, randomSide, randomSide, randomSide);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    private double getRandomSide() {
        return random.nextDouble() * MAX_SIDE_LENGTH;
    }
}
