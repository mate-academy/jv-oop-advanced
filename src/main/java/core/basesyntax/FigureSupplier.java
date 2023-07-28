package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final double DEFAULT_RADIUS = 10;
    private Random randomizer = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        final int figureIndex = randomizer.nextInt(FigureEnum.values().length);
        final FigureEnum randomFigure = FigureEnum.values()[figureIndex];
        final String color = colorSupplier.getRandomColor();
        switch (randomFigure) {
            case CIRCLE: {
                final double radius = randomizer.nextDouble();
                return new Circle(radius, color);
            }
            case ISOSCELES_TRAPEZOID: {
                final double firstBase = randomizer.nextDouble();
                final double secondBase = randomizer.nextDouble();
                final double height = randomizer.nextDouble();
                return new IsoscelesTrapezoid(firstBase, secondBase, height, color);
            }
            case RECTANGLE: {
                final double firstSide = randomizer.nextDouble();
                final double secondSide = randomizer.nextDouble();
                return new Rectangle(firstSide, secondSide, color);
            }
            case RIGHT_TRIANGLE: {
                final double firstLeg = randomizer.nextDouble();
                final double secondLeg = randomizer.nextDouble();
                return new RightTriangle(firstLeg, secondLeg, color);
            }
            case SQUARE: {
                final double side = randomizer.nextDouble();
                return new Square(side, color);
            }
            default: {
                return getDefaultFigure();
            }
        }
    }
}
