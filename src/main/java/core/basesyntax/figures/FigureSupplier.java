package core.basesyntax.figures;

import core.basesyntax.colors.Color;
import core.basesyntax.colors.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE).toLowerCase();

    private static final double MAX_VALUE = 100.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        EnumFigure enumFigure = EnumFigure.values()[random.nextInt(EnumFigure.values().length)];
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        switch (enumFigure) {
            case CIRCLE:
                double randomRadius = random.nextDouble() * MAX_VALUE;
                return new Circle(randomRadius, randomColor);
            case ISOSCELES_TRAPEZOID:
                double largeBase = generateRandomDouble();
                double isoTrapezoidSide = generateRandomDouble();
                double smallBase = generateRandomDoubleInRange(largeBase, isoTrapezoidSide);
                return new IsoscelesTrapezoid(isoTrapezoidSide, largeBase, smallBase, randomColor);
            case RECTANGLE:
                double firstRectSide = generateRandomDouble();
                double secondRectSide = generateRandomDouble();
                return new Rectangle(firstRectSide, secondRectSide, randomColor);
            case RIGHT_TRIANGLE:
                double firstLeg = generateRandomDouble();
                double secondLeg = generateRandomDouble();
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            case SQUARE:
                double squareSide = generateRandomDouble();
                return new Square(squareSide, randomColor);
            default:
                System.out.println("Something got wrong");
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double generateRandomDouble() {
        return random.nextDouble() * MAX_VALUE;
    }

    private double generateRandomDoubleInRange(double minValue, double maxValue) {
        double range = maxValue - minValue;
        return minValue + (random.nextDouble() * range);
    }
}
