package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 10;
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public double getRandomDimension(Random random,int maxCount) {
        return random.nextDouble() * maxCount;
    }

    public Figure getRandomFigure() {
        int randomFigureType = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigureType) {
            case 0:
                double randomRadius = getRandomDimension(random, MAX_LENGTH);
                return new Circle(randomColor, randomRadius);
            case 1:
                double randomTopSide = getRandomDimension(random, MAX_LENGTH);
                double randomBottomSide = getRandomDimension(random, MAX_LENGTH);
                double randomHeight = getRandomDimension(random, MAX_LENGTH);
                return new IsoscelesTrapezoid(randomColor, randomTopSide, randomBottomSide,
                        randomHeight);
            case 2:
                double randomHeightRect = getRandomDimension(random, MAX_LENGTH);;
                double randomWidth = getRandomDimension(random, MAX_LENGTH);
                return new Rectangle(randomColor, randomHeightRect, randomWidth);
            case 3:
                double randomFirstLeg = getRandomDimension(random, MAX_LENGTH);
                double randomSecondLeg = getRandomDimension(random, MAX_LENGTH);
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            case 4:
                double randomSide = getRandomDimension(random, MAX_LENGTH);
                return new Square(randomColor, randomSide);
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", DEFAULT_RADIUS);
    }
}
