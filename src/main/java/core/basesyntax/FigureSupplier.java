package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_VALUE_PROPERTIES = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1 -> {
                double randomRadius = random.nextDouble(MAX_VALUE_PROPERTIES);
                return new Circle(colorSupplier.getRandomColor(), randomRadius);
            }
            case 2 -> {
                double randomSide = random.nextDouble(MAX_VALUE_PROPERTIES);
                return new Square(randomSide, colorSupplier.getRandomColor());
            }
            case 3 -> {
                double randomFirstLeg = random.nextDouble(MAX_VALUE_PROPERTIES);
                double randomSecondLeg = random.nextDouble(MAX_VALUE_PROPERTIES);
                return new RightTriangle(randomFirstLeg, randomSecondLeg,
                        colorSupplier.getRandomColor());
            }
            case 4 -> {
                double randomFirstSide = random.nextDouble(MAX_VALUE_PROPERTIES);
                double randomSecondSide = random.nextDouble(MAX_VALUE_PROPERTIES);
                return new Rectangle(randomFirstSide, randomSecondSide,
                        colorSupplier.getRandomColor());
            }
            default -> {
                double randomShorterSide = random.nextDouble(MAX_VALUE_PROPERTIES);
                double randomLongerSide = random.nextDouble(MAX_VALUE_PROPERTIES);
                double randomHeight = random.nextDouble(MAX_VALUE_PROPERTIES);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomShorterSide, randomLongerSide, randomHeight);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
